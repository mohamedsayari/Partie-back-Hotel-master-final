package com.example.reservationhotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reservationhotel.Model.Client;



@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
