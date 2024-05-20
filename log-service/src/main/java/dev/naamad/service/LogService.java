package dev.naamad.service;

import dev.naamad.dto.ShuffleRequestDTO;

public interface LogService {
    void logRequest(ShuffleRequestDTO request);
}
