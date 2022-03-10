package ru.skypro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main{

    public static void main ( String[] args ) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7,8,8,8,8));
        List<String> names = new ArrayList<>(List.of(
                "Георгий","Амелия","Егор","Макар","Евгения",
                "Анастасия","Ярослав","Амелия","Ярослав","Амелия"));
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
        Set<Integer> uniqueEvenNumbers = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0 & !uniqueEvenNumbers.contains(num)) {
                System.out.print(num + " ");
                uniqueEvenNumbers.add(num);
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
        int doubles=0;
        Set<String> checkedWords = new HashSet<>();
        Set<String> duplicatedWords = new HashSet<>();
        for (int i = 0; i < wordList.size(); i++) {
            String currentWord = wordList.get(i);
            if(!checkedWords.contains(currentWord)){
                checkedWords.add(currentWord);
                for (int j = 0; j < wordList.size(); j++) {
                    if (currentWord == wordList.get(j) & i!=j) {
                        doubles+=1;
                        duplicatedWords.add(wordList.get(j));
                    }
                }
            }
            if (i == wordList.size() - 1) {
                System.out.println("Количество повторяющихся слов - " + doubles );
                System.out.println("Какие имена повторяются: " + duplicatedWords);
            }
        }
    }
}

