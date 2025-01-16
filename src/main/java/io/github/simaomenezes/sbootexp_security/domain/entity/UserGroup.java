package io.github.simaomenezes.sbootexp_security.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idGroup")
    private Group group;
}
