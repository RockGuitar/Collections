package ru.skypro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main implements MainOperations{

    public static void main ( String[] args ) {
        printEven(nums);
        printUneven(nums);
        printUniqueWords(names);
        printDoublesCount(names);
    }
    public static void printUneven ( List<Integer> nums ) {
        for (Integer num : nums) {
            if (!(num % 2 == 0)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void printEven ( List<Integer> nums ) {
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void printUniqueWords ( List<String> wordList ) {
        Set<String> uniqueNames = new HashSet<>();
        for (String word : wordList) {
            uniqueNames.add((word));
        }
        System.out.println(uniqueNames);
        System.out.println();
    }
    public static void printDoublesCount ( List<String> wordList ) {
        int doublesCount = 0;
        Set<String> doubles = new HashSet<>();
        for (int i = 0; i < wordList.size(); i++) {
            String currentWord = wordList.get(i);
            for (int j = 0; j < wordList.size(); j++) {
                if (currentWord == wordList.get(j) & i!=j) {
                    doubles.add(currentWord);
                }
            }
            if (i == wordList.size() - 1) {
                System.out.println("Количество повторяющихся слов - " + doubles.size()+", а именно: " +doubles);
            }
        }
    }
}

