package io.github.simaomenezes.sbootexp_security.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String name;
}
