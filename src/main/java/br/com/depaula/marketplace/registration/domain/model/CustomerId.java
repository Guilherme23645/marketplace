package br.com.depaula.marketplace.registration.domain.model;

import org.springframework.util.Assert;

import java.util.UUID;

public record CustomerId(UUID id) {

    public CustomerId {
        Assert.notNull(id, "id must not be null");
    }

    public CustomerId() {
        this(UUID.randomUUID());
    }

}