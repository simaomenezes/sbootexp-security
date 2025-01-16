package io.github.simaomenezes.sbootexp_security.domain.repository;

import io.github.simaomenezes.sbootexp_security.domain.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GroupRepository extends JpaRepository<Group, UUID> {
}
