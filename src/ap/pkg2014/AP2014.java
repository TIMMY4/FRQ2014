/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.pkg2014;

import java.util.Arrays;

/**
 *
 * @author Ryan.Wanner
 */
public class AP2014 {
    public static String scrambleWord(String word){
     char[] wordCharList=word.toCharArray();
        char store ;
      for(int i=0; i<wordCharList.length-1; i++){
          if(wordCharList[i]=='A'){
             store=wordCharList[i];
             wordCharList[i]=wordCharList[i+1];
             wordCharList[i+1]=store;
             i++;
              
          }
      }
      return Arrays.toString(wordCharList);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String word= "ADDS";
               System.out.println(scrambleWord(word));
               
    }
    
}
