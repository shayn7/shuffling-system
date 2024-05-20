package dev.naamad.controller;

import dev.naamad.config.LogServiceConfig;
import dev.naamad.dto.ShuffleRequestDTO;
import dev.naamad.dto.ShuffleResponseDTO;
import dev.naamad.logger.RequestLogger;
import dev.naamad.service.ShuffleService;
import dev.naamad.validator.RequestValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/shuffle")
public class ShuffleController {

    private final ShuffleService shuffleService;
    private final RequestValidator requestValidator;
    private final RequestLogger requestLogger;


    @PostMapping
    public Mono<ShuffleResponseDTO> shuffleNumbers(@RequestBody ShuffleRequestDTO shuffleRequestDTO) {
        requestValidator.validate(shuffleRequestDTO);
        int[] shuffledArray = shuffleService.shuffleArray(shuffleRequestDTO.getNumber());
        requestLogger.logRequest(shuffleRequestDTO);

        return Mono.just(new ShuffleResponseDTO(shuffledArray));
    }

}
