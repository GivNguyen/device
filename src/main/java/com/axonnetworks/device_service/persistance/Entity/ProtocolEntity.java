package com.axonnetworks.device_service.persistance.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "protocol")
@Getter
@Setter
public class ProtocolEntity {
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = true, length = 255)
    private String name;
}
