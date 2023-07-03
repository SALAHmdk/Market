package fr.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.market.dao.IClientRepository;
import fr.market.dao.IProduitRepository;
import fr.market.entities.Client;
import fr.market.entities.Produit;

@SpringBootApplication
public class MarketApplication implements CommandLineRunner {
	@Autowired
	private IClientRepository client;
	
	@Autowired
	private IProduitRepository produit;
	
	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
		
		System.out.println("Lancement terminé,ok");
	}


	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Lancement en cours");
		
		Client a = new Client(null,"MOHAND KACI","Salah","Bagnolet");
		Client b = new Client(null,"KOUNKOUD","JUNIOR","Saint-Gratien");
		Client c = new Client(null,"BOYKA","Youri","Mosscow");
		
		client.save(a);
		client.save(b);
		client.save(c);
		
		Produit d = new Produit(null,"Ballon",30);
		Produit e = new Produit(null,"Iphone",1400);
		Produit f = new Produit(null,"Range_rover",20000);
		Produit g = new Produit(null,"Trotinette",400);
		Produit h = new Produit(null,"Maison",200000);
		
		produit.save(d);
		produit.save(e);
		produit.save(f);
		produit.save(g);
		produit.save(h);
		
	 }
}
