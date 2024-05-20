package dev.naamad.logger;

import dev.naamad.dto.ShuffleRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Component
public class RequestLogger {

    private final WebClient webClient;

    public void logRequest(ShuffleRequestDTO shuffleRequestDTO) {
        webClient.post()
                .uri("/log")
                .bodyValue(shuffleRequestDTO)
                .retrieve()
                .bodyToMono(Void.class)
                .subscribe();
    }
}
