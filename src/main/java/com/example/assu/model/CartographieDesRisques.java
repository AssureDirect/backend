package com.example.assu.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CartographieDesRisques {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Enumerated
    private OuiOuNon contratAssurance;
    public String quelContrats;
    public String autre;
    public String compagnie;
    public String budget;
    public String periodiciteBudget;
    public String dateEcheance;
}
