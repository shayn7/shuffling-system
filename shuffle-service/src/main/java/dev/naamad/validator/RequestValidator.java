package dev.naamad.validator;

import dev.naamad.dto.ShuffleRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class RequestValidator {

    public void validate(ShuffleRequestDTO shuffleRequestDTO) {
        int number = shuffleRequestDTO.getNumber();
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Number must be between 1 and 1000");
        }
    }
}
