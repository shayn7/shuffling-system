package dev.naamad.service_impl;

import dev.naamad.dto.ShuffleRequestDTO;
import dev.naamad.service.LogService;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Override
    public void logRequest(ShuffleRequestDTO request) {
        System.out.println("Received request to shuffle number: " + request.getNumber());
    }
}
