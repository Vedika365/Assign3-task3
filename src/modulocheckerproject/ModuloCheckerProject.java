/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulocheckerproject;
import java.util.Scanner;
/**
 *
 * @author Vedika
 */
public class ModuloCheckerProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner modulo = new Scanner (System.in);
        //ask for user imput
        System.out.print("please enter a number and a base, separated by space: ");
        String number = modulo.nextLine();
        String number1 = number.substring(0,number.indexOf(' '));
        String number2 = number.substring (number.indexOf(' ')+1);

        //converting the strings to integer

        int num1 = Integer.parseInt(number1);
        int base = Integer.parseInt(number2);

        //Calling method 1 and method 2
        boolean CallOne = isDivisible(num1);
        boolean CallTwo = isDivisible (num1,base);

        if (CallTwo==true){
            System.out.printf("%d is divisible by %d \n",num1,base);
        } else{
            System.out.printf("%d is not divisble by %d \n",num1, base);
        }


        //input letter and base
        System.out.print("Please enter an English letter :  ");
        String letter = modulo.nextLine();
        //convert the string to char
        char chLetter = letter.charAt(0);
        //convert the letter to uppercase to standardize
        char Letter = Character.toUpperCase(chLetter);

        System.out.print("please enter a number base and an enlgish letter base, seperated by space : ");
        String input = modulo.nextLine();
        //separate the input
        String strEnglishBase = input.substring(0,input.indexOf(' '));
        String englishLetterBase = input.substring(input.indexOf(' ')+1);


        //convert the english base to an character
        int EnglishBase = Integer.parseInt(strEnglishBase);
        char LetterBase = englishLetterBase.charAt(0);

        //calling the methods
        boolean Call3 = isDivisible(LetterBase);
        boolean Call4 = isDivisible(LetterBase,base);
        boolean Call5 = isDivisible (Letter,LetterBase);

        if (Call4 ==true){
            System.out.printf("'%c' is divisble by %d \n",Letter,EnglishBase);
        }
        else{
            System.out.printf("'%c' is divisible by %d \n",Letter,EnglishBase);
        }

        if (Call5 ==true){
            System.out.printf("'%c' is divisible by '%c' \n",Letter,LetterBase);
        }
        else{
            System.out.printf("'%c' is not divisible by '%c' \n",Letter,LetterBase);
        }
    }


    //letter to number method
    public static int letterToNumber (char TheChar){
        TheChar = Character.toLowerCase(TheChar);
        //'a' equals to 0, and 'z'equals to 25
        return TheChar-'a';
    }
    //methdo to check if the number is divisle by 3
    public static boolean isDivisible (int num){
        //returns the boolean
        return num%3==0;
    }
    //method used to check if a number is divisble by the base
    public static boolean isDivisible (int num,int base){
        return num % base==0;
    }
    //check if the number conversion of the letter is divisible by 3
    public static boolean isDivisible (char letter){
        //return the value of letterTonumber method in isDivisible method
        return isDivisible(letterToNumber(letter));
    }
    //check if the number conversion of the letter is divisble by the base
    public static boolean isDivisible (char letter,int base){
        return isDivisible(letterToNumber(letter),base);
    }
    /*method to check if letter numeric conversion is divisble by other
            letter's numeric value*/
    public static boolean isDivisible( char letter, char base){
        return isDivisible(letterToNumber(letter),letterToNumber(base));

    }
}
