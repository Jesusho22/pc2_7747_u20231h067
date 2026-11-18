package com.acme.catchup.platform_202415551.management.infraestructure.persistence.jpa.entities;

import com.acme.catchup.platform_202415551.management.domain.model.valueobjets.ReservationNotes;
import com.acme.catchup.platform_202415551.management.domain.model.valueobjets.ReservationPeriod;
import com.acme.catchup.platform_202415551.management.domain.model.valueobjets.Status;
import com.acme.catchup.platform_202415551.management.infraestructure.persistence.jpa.converters.ReservationNotesPersistenceConverter;
import com.acme.catchup.platform_202415551.management.infraestructure.persistence.jpa.converters.StatusPersistenceConverter;
import com.acme.catchup.platform_202415551.shared.infrastructure.persistence.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ReservationPersistenceEntity extends AuditableAbstractPersistenceEntity {
    @Convert(converter = StatusPersistenceConverter.class)
    @Column(name = "status", nullable = false, updatable = true)
    private Status status;
    @Convert(converter = ReservationNotesPersistenceConverter.class)
    @Column(name = "reservationNotes", nullable = false, updatable = true, unique = true)
    private ReservationNotes reservationNotes;
    @Convert(converter = ReservationPeriodPersistenceConverter.class)
    @Column(name = "dni", nullable = false, updatable = true, unique = true)
    private ReservationPeriod reservationPeriod;
}
