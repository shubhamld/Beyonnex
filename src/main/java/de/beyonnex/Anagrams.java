package de.beyonnex;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public boolean isAnagrams(String input1, String input2) {
        if ((input1 == null || input2 == null) || (input1.length() != input2.length())) {
            return false;
        }

        Map<Character, Integer> charCountTable = new HashMap<>();

        for (int i = 0; i < input1.length(); i++) {
            charCountTable.put(
                    input1.charAt(i), charCountTable.getOrDefault(input1.charAt(i), 0) + 1
            );
        }

        for (int i = 0; i < input2.length(); i++) {
            charCountTable.put(
                    input2.charAt(i), charCountTable.getOrDefault(input2.charAt(i), 0) - 1
            );
        }

        for (int val : charCountTable.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}