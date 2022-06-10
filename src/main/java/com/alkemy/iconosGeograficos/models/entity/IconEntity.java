package com.alkemy.iconosGeograficos.models.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "icon")
@Getter
@Setter
public class IconEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String denominacion;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date fechaCreacion;

    private Long altura;

    private String historia;

    @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
    private List<PaisEntity> paises = new ArrayList<>();
}
