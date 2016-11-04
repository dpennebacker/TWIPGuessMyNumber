package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        String nm[] = { "Anton", "Lafaunda", "Napoleon", "Kip", "Wendy",
                "Sven", "Ripley", "Quesno", "Vinny", "Barbara", "Jiffy",
                "Tamica", "Edison", "Whoopie", "Twanisha", "Wanda",
                "Queen Latifa", "Dawn", "Haywood", "Bufort", "Dillard",
                "Spice", "Posh", "Cinnamon", "Marg", "Tanzania", "Jen",
                "Abigail", "Anne", "Olaf", "Sven", "Harry", "Seamus", "Barry",
                "Marco", "Polo", "Bindi", "Cindi", "Mindi", "Sunflower",
                "Rachel", "William", "Paulina", "Fran", "Martha", "Evan",
                "Frida", "Linda", "Paul", "Zandra" };
        Arrays.sort(nm);
        System.out
                .println("Let's play a game!\nYou will pick a name from the alphabetical list of 50 names below.\n"
                        + "Don't tell me what it is so I can guess it.");
        for (String alpha : nm)
            System.out.println(alpha);
        System.out
                .println("\nThe instructions are simple.\nI will guess a name and you will either respond with "
                        + "\"higher\" or \"lower\" to say if your name is higher or lower on the alphabetical list than my guess."
                        + "\nJust remember \"lower\" means closer to the beginning of the alphabet,\nand \"higher\" means closer to the end of the alphabet"
                        + "\nRespond with \"yes\" if my guess is correct.\n\nAre you ready?");
        Scanner kbI = new Scanner(System.in);
        String r = kbI.next();
        int min = 0;
        int max = 49;
        int j = 0;
        while (r.equalsIgnoreCase("yes")) {
            int avg = (min + max) / 2;
            String guess = nm[avg];
            System.out
                    .println("Is "
                            + guess
                            + " the name you were thinking of? Or is your name higher or lower?");
            String r1 = kbI.next();
            if (r1.equalsIgnoreCase("higher")) {
                min = avg;
                j++;
            } else if (r1.equalsIgnoreCase("lower")) {
                max = avg;
                j++;
            } else if (r1.equalsIgnoreCase("yes")) {
                j++;
                System.out.println("\nWoohoo! I knew that " + guess
                        + " was what you were thining of!");
                if (j <= 6) {
                    System.out
                            .println("I win because I could guess it in "
                                    + j
                                    + " tries, which is within my acceptable limit of 6 tries!!");
                } else if (j > 6) {
                    System.out
                            .println("You win just this time because I couldn't guess within 6 tries and had to guess "
                                    + j + " times. Clearly you cheated!");
                }
                System.out
                        .println("\nAre you ready to LOSE!... I mean... Play again??");
                String r2 = kbI.next();
                if (r2.equalsIgnoreCase("yes")) {
                    System.out
                            .println("\nOkay, think of another name on the list now!\n");
                    min = 0;
                    max = 49;
                    j=0;//added
                } else {
                    System.out
                            .println("Well this was fun. Let's do this again sometime! Goodbye!");
                    break;
                }
            } else {
                System.out
                        .println("\nI think you may have a mistype error.  Try again.\n");
            }
        }
        if (r.equalsIgnoreCase("no"))
            System.out
                    .println("Too bad you don't want to play. See you next time! Goodbye!");

    }
}
