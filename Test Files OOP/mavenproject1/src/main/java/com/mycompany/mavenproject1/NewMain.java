/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import static java.lang.Character.*;
/**
 *
 * @author workstation
 */
public class NewMain {

    public static void camelcase(String s) {
              int wordcount = 1;
              for (int i = 0; i < s.length(); i++) {
                   if (isUpperCase(s.charAt(i)))
                       wordcount++;}
              System.out.println(wordcount);

        }
    public static int minimumNumber(int n, String password){
        int upper = 0,lower = 0,special = 0,digit = 0,minNumber = 0;
        for(int i =0;i<n;i++){
            char c =password.charAt(i);
            upper += (Character.isUpperCase(c))? 1 : 0;
            lower += (Character.isLowerCase(c))? 1 : 0;
            digit += (Character.isDigit(c))? 1 : 0;
            special += ("!@#$%^&*()-+".contains(Character.toString(c)))? 1: 0;
        }
        int[] contraints = {upper,lower,digit,special};
        for(int constraint: contraints){
            if(constraint == 0){
                minNumber++;
            }
        }
        if(n+minNumber>=6) return minNumber;
        else return minNumber+(6-(n+minNumber));
    } 
    
    public static int alternate(String s) {
    
        String nobels = "";
        nobels = nobels+s.charAt(0);
        for(int i = 0;i<s.length();i++){
            for(int j = 1;j<=nobels.length();j++){
                if(nobels.charAt(j-1) != s.charAt(j))
                    nobels = nobels+s.charAt(j);
                else
                    break;
            }
        }
        nobels = nobels.substring(0,nobels.length()-2);
        for(int k = 0; k<s.length();k++){
            s= s.replaceAll(nobels.charAt(k)+"","");
        }
        return s.length();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


    
  
         System.out.println(alternate("afa"));


    
    
    
    
    
    }
    
}
