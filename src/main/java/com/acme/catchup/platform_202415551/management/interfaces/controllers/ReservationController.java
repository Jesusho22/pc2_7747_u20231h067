package com.acme.catchup.platform_202415551.management.interfaces.controllers;

import com.acme.catchup.platform_202415551.management.application.commandservices.ReservationCommandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reservation")

public class ReservationController {
    private final ReservationCommandService service;
    public ReservationController(ReservationCommandService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<ReservationRequestResponse> createReservation(
            @RequestBody ReservationRequestResource resource
    ){
        var result = service
                .handle(ReservationTransform.toCreateReservationCommandFromCustomerResource(resource));
        var responser = ReservationTransform.toCreateReservationRequestResponseFromCustomerDomain(result);
        return   ResponseEntity.ok(responser);
    }


}
