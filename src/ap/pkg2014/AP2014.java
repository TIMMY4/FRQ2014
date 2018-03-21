/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.pkg2014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ryan.Wanner
 */
public class AP2014 {

    public static String scrambleWord(String word) {
        char[] wordCharList = word.toCharArray();
        char store;
        for (int i = 0; i < wordCharList.length - 1; i++) {
            if (wordCharList[i] == 'A') {
                store = wordCharList[i];
                wordCharList[i] = wordCharList[i + 1];
                wordCharList[i + 1] = store;
                i++;

            }
        }
        return Arrays.toString(wordCharList);
    }

    public static void scrambleOrRemove(List<String> wordList) {
        String test;
        for (int i =wordList.size()-1; i >=0; i--) {
            if (!wordList.get(i).contains("A")) {
                wordList.remove(i);
                
            } else {
              
                test = scrambleWord(wordList.get(i));
                if(wordList.get(i).equals(test)){
                    wordList.remove(i);
                }
               
                    wordList.remove(i);
                    wordList.add(i, test);
                
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> words = new ArrayList();
        words.add("ADAM");
        words.add("NICK");
        words.add("APPLE");
        words.add("ELI");
        words.add("Anna");
        scrambleOrRemove(words);
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

    }

}
