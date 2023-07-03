package fr.market.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Commande {
	@Id
	@GeneratedValue
	private Long id;
	
    private String date;

    private int quantite;
    
    private int code_commande;

}
