package nd.nd2.nd2_Advance.task19And20;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence1 = sc.nextLine();

        System.out.println("Enter a second sentence");
        String sentence2 = sc.nextLine();

        System.out.println("Longest common word :" + getLongestCommonWord(toWordArray(sentence1), toWordArray(sentence2)));
        System.out.println("Longest palindrome in sentence one :" + getLongestPalindrome(toWordArray(sentence1)));
        System.out.println("Longest palindrome in sentence two :" + getLongestPalindrome(toWordArray(sentence2)));
    }

    public static String getLongestPalindrome(String[] sentence) {
        String longestWord = "none";
        for (String c : sentence) {
            if (isWordAPalindrome(c)) {
                longestWord = c;
            }
        }
        return longestWord;
    }

    public static boolean isWordAPalindrome(String word) {
        String wordReversed = wordReversed(word);
        if (word.equals(wordReversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static String wordReversed(String word) {
        int count = word.length() - 1;
        char[] reversedArray = new char[word.length()];
        String wordReversed = "";
        for (char c : word.toCharArray()) {
            reversedArray[count] = c;
            count--;
        }
        for (char c : reversedArray) {
            wordReversed += c;
        }
        return wordReversed;
    }

    public static String getLongestCommonWord(String[] sen1, String[] sen2) {
        String CommonWords = " ";
        for (String s1 : sen1) {
            for (String s2 : sen2) {
                if (s1.equals(s2)) CommonWords += s1 + " ";
            }
        }
        return getLongestWordInArray(toWordArray(CommonWords));
    }

    public static String getLongestWordInArray(String[] words) {
        int max = 0;
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > max) {
                max = words[i].length();
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static String[] toWordArray(String sentence) {
        char[] sentenceCharArray = sentence.toCharArray();
        int wordAmount = amountOfWords(sentence);
        String[] sentenceWords = new String[wordAmount];
        String holder = "";
        int count = 0;

        for (char c : sentenceCharArray) {
            if (c == ' ') {
                sentenceWords[count] += holder;
                count++;
                holder = "";
            } else {
                holder += c;
            }
        }
        sentenceWords[count] += holder;
        return noNull(sentenceWords);
    }

    public static int amountOfWords(String sentence) {
        char[] sentenceArray = sentence.toCharArray();
        int count = 1;
        int charCount = 0;
        for (char c : sentenceArray) {
            if (c == ' ') {
                count++;
                charCount++;
            }
        }
        return count;
    }

    public static String[] noNull(String[] wordArray) {
        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = wordArray[i].substring(4);
        }
        return wordArray;
    }
}
