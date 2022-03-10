package ru.skypro;

import java.util.ArrayList;
import java.util.List;

public interface MainOperations {
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    List<String> names = new ArrayList<>(List.of(
            "Георгий","Амелия","Егор","Макар","Евгения",
            "Анастасия","Ярослав","Амелия","Мирон","Егор"));
    static void printUneven ( List<Integer> list){}
    static void printEven (List<Integer> list){}
    static void printUniqueWords(List<String> list){}
    static void printDoublesCount(List<String> list){}
}
