package fr.market.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.market.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {

}
