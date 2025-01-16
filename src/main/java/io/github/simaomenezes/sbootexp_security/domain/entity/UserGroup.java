package io.github.simaomenezes.sbootexp_security.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_user_group")
@Data
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_group")
    private Group group;
}
