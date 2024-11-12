package com.axonnetworks.device_service.dto.Response;

import lombok.*;

@Getter
@Setter
public class Entries {
    private String ingestionProtocol;
    private Statistics statistics;
}
