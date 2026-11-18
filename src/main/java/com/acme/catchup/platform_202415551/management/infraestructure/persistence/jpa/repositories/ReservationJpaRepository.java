package com.acme.catchup.platform_202415551.management.infraestructure.persistence.jpa.repositories;

import com.acme.catchup.platform_202415551.management.infraestructure.persistence.jpa.entities.ReservationPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservationJpaRepository extends JpaRepository<ReservationPersistenceEntity, Long> {
    Optional<ReservationPersistenceEntity> findByStatus(String status);
}
