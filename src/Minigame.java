import java.util.Scanner;

public class Minigame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your first word: ");
        String word = scan.nextLine();
        int score = 0;
        String wordPrevious;
        int numWords = 1;
        System.out.println();
        while (score < 50) {
            wordPrevious = word;
            System.out.print("Please enter your next word: ");
            word = scan.nextLine();
            if (word.compareTo(wordPrevious) > 0) {
                score += 2;
            } else if (word.compareTo(wordPrevious) < 0) {
                score -= 5;
            } else {
                score -= 10;
            }
            if (wordPrevious.substring(wordPrevious.length()-2).equals(word.substring(0, 2))) {
                score += 5;
            }
            if (word.indexOf(wordPrevious.substring(0,1)) != -1) {
                score += 3;
            }
            if (word.indexOf(wordPrevious.substring(0, 1)) <= 1 || word.indexOf(wordPrevious.substring(1, 2)) <= 1) {
                score -= 3;
            }
            System.out.println("Your score is now " + score);
            System.out.println();
            numWords++;
         }
        System.out.println("Congratulations! You win!");
        System.out.println("It took you " + numWords + " words to win.");
    }
}