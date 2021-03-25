import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class WordGame {
    public static void main(String[] args) {
        Random NewGenerator = new Random();
        Scanner NewScanner = new Scanner(System.in);
        int PointCounter = 0;

        while(true){


            int Number = NewGenerator.nextInt(26);
            char Letter = (char)(Number + 'A');
            System.out.println(Letter);
            System.out.println("Enter a word starting with the letter " + Letter);
            String Word = NewScanner.nextLine().toUpperCase();
            char FirstLetter = Word.charAt(0);
    
            if (FirstLetter == Letter) {
                int WordPointCounter = 0;
                for (int i = 0; i < Word.length(); i = i + 1) {
                    char LetterPoint = Word.charAt(i);
                    int Charvalue = (int)(LetterPoint);
                    WordPointCounter = Charvalue + WordPointCounter;
                }
                char[] characters = Word.toCharArray();
                Arrays.sort(characters);
                String joinedSorted = new String(characters); 
                if(joinedSorted.equals(Word)){
                    WordPointCounter = WordPointCounter *3;
                }
                PointCounter = PointCounter + WordPointCounter;
                System.out.println(WordPointCounter + " points");
    
            } else {
                System.out.println("0 points");
                PointCounter = PointCounter + 0;
            } 

            System.out.println("Enter Y to continue playing");
            String PlayingAgain = NewScanner.nextLine() .toUpperCase();

            if ( PlayingAgain.equals ("Y")){

            }
        else {
            break;
        }
    }
    }
}