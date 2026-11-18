package com.acme.catchup.platform_202415551.management.application.commandservices;

import com.acme.catchup.platform_202415551.management.application.commands.CreateReservationCommand;

public interface ReservationCommandService {
    Reservation handle(CreateReservationCommand command);
}
