package com.training;

import java.util.Arrays;

/**
 * {@link CheckPermutation} has methods to test whether a given string has
 * all unique characters.
 * {@link CheckPermutation#isPermutation(String, String)} tests whether the
 * two strings are permutations of each other or not.
 * {@link CheckPermutation#isPermutationSort(String, String)} (String, String)}
 * tests whether the two strings are permutations of each other or not using the
 * sorting technique.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class CheckPermutation {
    private static final int TOTAL_CHARS_ENGLISH = 28;
    private static final int FIRST_LOWER_CHAR_ENGLISH = 97;
    private static final int FIRST_UPPER_CHAR_ENGLISH = 65;

    /**
     * Returns true if two strings are permutations of each other
     * by comparing strings character by character
     *
     * @param input1 first string to be compared
     * @param input2 second string to be compared
     * @return true if both strings are permutations of each other
     */
    public boolean isPermutation(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }

        // let us assume that the string contains only uppercase and lowercase characters
        int[] entries = new int[2 * TOTAL_CHARS_ENGLISH];
        int index;

        for (int i = 0; i < input1.length(); i++) {
            index = (int) input1.charAt(i);
            index = getConvertedIndex(index);
            entries[index]++;
        }

        for (int i = 0; i < input2.length(); i++) {
            index = (int) input2.charAt(i);
            index = getConvertedIndex(index);
            if (entries[index] == 0) {
                return false;
            } else {
                entries[index]--;
            }
        }

        return true;
    }

    /**
     * Returns true if two strings are permutations of each other
     * by sorting the strings and then using equals to compare the
     * two
     *
     * @param input1 first string to be compared
     * @param input2 second string to be compared
     * @return true if both strings are permutations of each other
     */
    public boolean isPermutationSort(String input1, String input2) {
        char inp1Arr[] = input1.toCharArray();
        Arrays.sort(inp1Arr);
        char inp2Arr[] = input2.toCharArray();
        Arrays.sort(inp2Arr);
        return Arrays.equals(inp1Arr, inp2Arr);
    }

    private int getConvertedIndex(int index) {
        if (index >= FIRST_LOWER_CHAR_ENGLISH) {
            index -= FIRST_LOWER_CHAR_ENGLISH;
            index += TOTAL_CHARS_ENGLISH;
        } else {
            index -= FIRST_UPPER_CHAR_ENGLISH;
        }
        return index;
    }
}
