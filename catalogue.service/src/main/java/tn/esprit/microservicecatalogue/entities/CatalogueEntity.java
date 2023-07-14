package tn.esprit.microservicecatalogue.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Array;

/**
 * This class represents a catalogue entity, with basic properties like  ...
 */
@Entity
@Table(name = "catalogues")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CatalogueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;



}




