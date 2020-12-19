package com.example.reservationhotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reservationhotel.Model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
