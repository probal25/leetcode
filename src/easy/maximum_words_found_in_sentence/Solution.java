package easy.maximum_words_found_in_sentence;

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String[] sen = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFoundNew(sen));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            String[] strings = sentence.split(" ");
            max = Math.max(strings.length, max);
        }
        return max;
    }

    public static int mostWordsFoundNew(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int cnt = 0;
            for (Character c : sentence.toCharArray()) {
                if (c == ' ') cnt++;
            }
            max = Math.max(cnt, max);
        }
        return max + 1;
    }


}


