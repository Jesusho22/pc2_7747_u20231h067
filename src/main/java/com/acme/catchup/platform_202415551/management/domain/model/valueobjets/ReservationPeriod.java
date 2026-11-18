package com.acme.catchup.platform_202415551.management.domain.model.valueobjets;

public record ReservationPeriod(Long reservationPeriod) {
    public ReservationPeriod {
        if (reservationPeriod == null) {
            throw new IllegalArgumentException("reservationPeriod cannot be null");
        }
    }
}