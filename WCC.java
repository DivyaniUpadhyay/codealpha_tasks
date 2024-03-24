import java.util.Scanner;

public class WCC {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a sentence: ");
    String sentence = scanner.nextLine();

    // Split the sentence into words using whitespace as delimiters
    String[] words = sentence.split("\\s+");

    // Count the number of words
    int wordCount = words.length;

    System.out.println("The sentence has " + wordCount + " words.");
  }
}