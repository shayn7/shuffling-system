package dev.naamad.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ShuffleResponseDTO {
    private int[] shuffledArray;
}
