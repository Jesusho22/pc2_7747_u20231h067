package com.acme.catchup.platform_202415551.management.domain.repositories;

import com.acme.catchup.platform_202415551.management.domain.model.aggregates.Reservation;

import java.util.Optional;

public interface ReservationRepository {
    Optional<Reservation> findById(Long id);
    Reservation save(Reservation customer);
    Optional<Reservation> findByStatus(String status);
    Reservation update(Reservation reservation);
    void deleteById(Long id);
}

