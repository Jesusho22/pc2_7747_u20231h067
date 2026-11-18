package com.acme.catchup.platform_202415551.management.domain.model.valueobjets;

public record Status(String status) {
    public Status{
        if(status==null || status.isBlank()) {
            throw new IllegalArgumentException("Status cannot be null or blank");
        }
    }
}
