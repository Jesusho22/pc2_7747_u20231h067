package com.acme.catchup.platform_202415551.management.application.internal.commandserviceimpl;

import com.acme.catchup.platform_202415551.management.application.commands.CreateReservationCommand;
import com.acme.catchup.platform_202415551.management.application.commandservices.ReservationCommandService;

public class ReservationCommandServiceImpl implements ReservationCommandService {
 private final ReservationRepository repository;
 public ReservationCommandServiceImpl(ReservationRepository repository) {this.repository = repository}


    @Override
    public Reservation handle(CreateReservationCommand command){
        if(command==null){
            throw new IllegalArgumentException("command is null");
        }
        var customer = new Reservation(new Id(command.id()),
                new ReservationCode(command.reservationCode()), new Status(command.status()));
        return repository.save(customer);
    }
}
