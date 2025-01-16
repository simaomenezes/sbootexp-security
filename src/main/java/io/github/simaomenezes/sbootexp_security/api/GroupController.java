package io.github.simaomenezes.sbootexp_security.api;

import io.github.simaomenezes.sbootexp_security.domain.entity.Group;
import io.github.simaomenezes.sbootexp_security.domain.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {

    private GroupRepository repository;

    @PostMapping
    @Transactional
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Group> add(@RequestBody Group group){
        repository.save(group);
        return ResponseEntity.ok(group);
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Group>> getAll(){
        List<Group> groupsList = repository.findAll();
        return ResponseEntity.ok(groupsList);
    }
}
