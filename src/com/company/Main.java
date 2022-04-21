package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // write your code here
        Scanner caesar = new Scanner(System.in);
        System.out.println("What is your message? ");
        String message;
        message = caesar.nextLine();

        int shifts;
        System.out.println("How many shifts? ");
        shifts = caesar.nextInt();
        shifts = -shifts;

        String cipher = " ";
        for(int i=0; i<message.length();i++)
        {
            char j = message.charAt(i);
            if (j == ' ') {
                cipher+=j;
            }
            if (Character.isUpperCase(j))
            {
                int secret = j;
                int shift = (secret-shifts-65)%26+65;
                cipher += (char)shift;
            } else if(Character.isLowerCase(j))
            {
                int secret = j;
                int shift = (secret-shifts-97)%26+97;
                cipher += (char)shift;
            }
            else
                cipher+=j;
        }
        System.out.println(cipher);
    }
}