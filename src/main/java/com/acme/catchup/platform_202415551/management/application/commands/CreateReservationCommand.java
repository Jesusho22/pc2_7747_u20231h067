package com.acme.catchup.platform_202415551.management.application.commands;

public record CreateReservationCommand(
    Long reservationCode,
    Long laboratoryId,
    Long reservationPeriod,
    String equipmentBatch,
    Long accessLevel,
    String status,
    String reservationNotes
){
}
