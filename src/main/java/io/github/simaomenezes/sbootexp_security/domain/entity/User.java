package io.github.simaomenezes.sbootexp_security.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String name;
}
