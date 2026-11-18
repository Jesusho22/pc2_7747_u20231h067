package com.acme.catchup.platform_202415551.management.infraestructure.persistence.jpa.adapters;

import com.acme.catchup.platform_202415551.management.domain.model.aggregates.Reservation;
import com.acme.catchup.platform_202415551.management.domain.repositories.ReservationRepository;
import com.acme.catchup.platform_202415551.management.infraestructure.persistence.jpa.repositories.ReservationJpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class ReservationPersistenceAdapter implements ReservationRepository {

    private final ReservationJpaRepository repository;


    public ReservationPersistenceAdapter(ReservationJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Reservation> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Reservation save(Reservation reservation) {
        if (reservation == null) {
            return null;
        }
        var  result = repository.save(ReservationPersistenceMapper.toEntity(reservation));
        return ReservationPersistenceMapper.toDomain(result);
    }

    @Override
    public Optional<Reservation> findByDni(String status) {
        return Optional.empty();
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
