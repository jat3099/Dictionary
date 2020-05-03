import javax.swing.*;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {

    WordList wordList = new WordList();
    Scanner scanner = new Scanner(System.in);

    boolean done = false;


        while (!done )
        {
            System.out.println(" 1. enter a word plus definition \n 2. print the word list \n 3 exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {

                case 1:
                    System.out.println("enter a word: ");
                    String word = scanner.nextLine();
                    System.out.println("enter the definition: ");
                    String definition = scanner.nextLine();
                    wordList.append(new WordMeaning(word,definition));
                break;

                case 2:
                    System.out.println(wordList.toString());
                    break;

                case 3:
                done = true;
                    break;

            }//END OF SWITCH STATEMENT


        }//END OF WHILE LOOP


    }


}
