package com.example.assu.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class IdentificationLead {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Enumerated
    private String conseiller;
    private String agence;
    private String status;
    private String portfeilleOrigine;
    private String agenceRattachement;
    private String commentConnu;
    private String nomParrain;
    private String autre;
    private String typeContact;
    private OuiOuNon eligibiliteBlocTel;
    private String dateDernierContact;
}
