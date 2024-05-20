package dev.naamad.service_impl;

import dev.naamad.service.ShuffleService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ShuffleServiceImpl implements ShuffleService {

    @Override
    public int[] shuffleArray(int number) {
        List<Integer> list = IntStream.rangeClosed(1, number)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
