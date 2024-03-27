import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph: ");
        String paragraph = scanner.nextLine();
         int wordCount = countWordsLoop(paragraph);

        System.out.println("Number of words: " + wordCount);
    }

    //  Using a loop 
    public static int countWordsLoop(String paragraph) {
        int count = 0;
        boolean inWord = false;

        for (char ch : paragraph.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                inWord = false;
            } else if (!inWord) {
                count++;
                inWord = true;
            }
        }

        return count;
    }
}
