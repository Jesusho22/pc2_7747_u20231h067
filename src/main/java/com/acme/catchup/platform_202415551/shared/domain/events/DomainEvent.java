package com.acme.catchup.platform_202415551.shared.domain.events;

import java.time.Instant;

public interface DomainEvent {
    Instant occurredAt();
}
