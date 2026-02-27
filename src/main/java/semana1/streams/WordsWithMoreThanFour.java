package semana1.streams;

import java.util.List;

public class WordsWithMoreThanFour {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "api", "functional", "code", "git");
        List<String> result = words.stream().filter(word -> word.length() > 4)
                .map(word -> word.toUpperCase()).sorted().toList();
        Integer finalResult = result.size();
        System.out.println(result);
        System.out.println(finalResult);
    }
}
