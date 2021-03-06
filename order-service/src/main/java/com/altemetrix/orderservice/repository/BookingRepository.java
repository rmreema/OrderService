package com.altemetrix.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altemetrix.orderservice.domain.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
