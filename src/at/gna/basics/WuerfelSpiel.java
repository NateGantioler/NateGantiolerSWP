package at.gna.basics;

import com.sun.tools.javac.Main;

import java.util.Random;
import java.util.Scanner;

public class WuerfelSpiel
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dice = 0;
        int diceTotal1 = 0;
        int diceTotal2 = 0;

        //User
        System.out.print("User: \n------------------------------------");
        for(int i = 0; i < 6; i++)
        {
            scanner.nextLine();
            dice = random.nextInt(1, 7);
            System.out.print(dice);
            diceTotal1 += dice;
        }


        //Computer
        scanner.nextLine();
        System.out.println("Computer: \n------------------------------------");
        for(int i = 0; i < 5; i++)
        {
            dice = random.nextInt(1, 7);
            System.out.print(dice + " - ");
            diceTotal2 += dice;
        }
        dice = random.nextInt(1, 7);
        System.out.println(dice);
        diceTotal2 += dice;


        //Result
        scanner.nextLine();
        System.out.print("User dice total    vs    Computer dice total");
        scanner.nextLine();
        System.out.println("      " + diceTotal1 + "                        " + diceTotal2);
        System.out.println("------------------------------------");
        if(diceTotal1 < diceTotal2)
        {
            System.out.println("Computer Won!");
        }
        else if(diceTotal1 > diceTotal2)
        {
            System.out.println("User Won!");
        }
        else
        {
            System.out.println("Draw!");
        }
    }
}
