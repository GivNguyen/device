package com.axonnetworks.device_service.Controller;

import com.axonnetworks.device_service.Service.DeviceService;
import com.axonnetworks.device_service.dto.Response.DeviceResponse;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/device-statistics")
public class StatisticsController {
    public DeviceResponse getStatistics() {
        return new DeviceResponse();
    }
}
