package edu.dosw.bitacora.bitacora_DOSW.semana1.streams;

import java.util.List;

public class PairsGreaterTen {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,8,10,12,15,18,20);
        List <Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0).filter(n -> n > 10).toList();
        System.out.println(result);
    }
}
