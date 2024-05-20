package dev.naamad.controller;

import dev.naamad.dto.ShuffleRequestDTO;
import dev.naamad.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/log")
public class LogController {

    private final LogService logService;

    @PostMapping
    public void logRequest(@RequestBody ShuffleRequestDTO request) {
        logService.logRequest(request);
    }
}
