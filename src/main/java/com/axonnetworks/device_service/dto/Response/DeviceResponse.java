package com.axonnetworks.device_service.dto.Response;


import lombok.*;

import java.util.List;

@Getter
@Setter
public class DeviceResponse {
    private Long active;
    private Long inactive;
    private Long provisioned;
    List<Entries> entries;
}
