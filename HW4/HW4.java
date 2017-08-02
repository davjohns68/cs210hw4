/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davjohns
 */
public class HW4 {
    public static void main(String[] args) {
        System.out.println(WordCount.wordCount("hello"));
        System.out.println(WordCount.wordCount("how are you?"));
        System.out.println(WordCount.wordCount(" how are you?"));
        System.out.println(WordCount.wordCount("how are you?   "));
        System.out.println(WordCount.wordCount("how are you ?"));
        System.out.println(WordCount.wordCount("I am 3 years old"));
        System.out.println(WordCount.wordCount("3 x 4 = 12"));
        System.out.println(WordCount.wordCount("Characters !@#$%^&*"));
        System.out.println(WordCount.wordCount("   "));
    }
}
