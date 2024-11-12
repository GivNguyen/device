package com.axonnetworks.device_service.dto.Response;

import lombok.*;

@Getter
@Setter
public class Statistics {
    private Long active;
    private Long inactive;
    private Long provisioned;
}
