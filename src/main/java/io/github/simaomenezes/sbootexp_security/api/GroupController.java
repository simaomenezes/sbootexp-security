package io.github.simaomenezes.sbootexp_security.api;

import io.github.simaomenezes.sbootexp_security.domain.entity.Group;

import io.github.simaomenezes.sbootexp_security.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {

    @Autowired
    private GroupService service;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Group> add(@RequestBody Group group){
        service.add(group);
        return ResponseEntity.ok(group);
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Group>> getAll(){
        List<Group> groupsList = service.findAll();
        return ResponseEntity.ok(groupsList);
    }
}
