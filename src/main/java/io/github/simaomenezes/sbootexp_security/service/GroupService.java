package io.github.simaomenezes.sbootexp_security.service;

import io.github.simaomenezes.sbootexp_security.domain.entity.Group;
import io.github.simaomenezes.sbootexp_security.domain.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GroupService {

    @Autowired
    private GroupRepository repository;

    @Transactional
    public Group add(Group group){
        return repository.save(group);
    }

    public List<Group> findAll(){
        return repository.findAll();
    }
}
