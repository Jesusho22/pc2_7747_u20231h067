package com.acme.catchup.platform_202415551.management.domain.model.aggregates;

import com.acme.catchup.platform_202415551.management.domain.model.valueobjets.ReservationNotes;
import com.acme.catchup.platform_202415551.management.domain.model.valueobjets.ReservationPeriod;
import com.acme.catchup.platform_202415551.management.domain.model.valueobjets.Status;

public class Reservation {
    private Long id;
    private String status;
    private String reservationNotes;
    private Long reservationPeriod;

    public Reservation(Long id, String status, Long reservationPeriod, String reservationNotes) {
        this.id = id;
        this.status = status;
        this.reservationPeriod = reservationPeriod;
        this.reservationNotes = reservationNotes;
    }

    public Reservation(String status, String reservationNotes, Long reservationPeriod) {
        this.status = status;
        this.reservationNotes = reservationNotes;
        this.reservationPeriod = reservationPeriod;
    }

    public Long getReservationPeriod() {
        return reservationPeriod;
    }

    public String getStatus() {
        return status;
    }

    public String getReservationNotes() {
        return reservationNotes;
    }

    public Long getId() {
        return id;
    }
}


