package com.acme.catchup.platform_202415551.management.domain.model.valueobjets;

public record ReservationNotes(String reservationNotes) {
    public ReservationNotes {
        if (reservationNotes == null || reservationNotes.isBlank()) {
            throw new IllegalArgumentException("ReservationNotes cannot be null");
        }
    }
}