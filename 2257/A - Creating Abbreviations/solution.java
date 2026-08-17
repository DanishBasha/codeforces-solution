import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int testCases = input.nextInt();
 
        while (testCases-- > 0) {
            int words = input.nextInt();
            int abbreviations = input.nextInt();
 
            boolean[] available = new boolean[26];
 
            for (int i = 0; i < words; i++) {
                String word = input.next();
                available[word.charAt(0) - 'a'] = true;
            }
 
            boolean possible = true;
 
            for (int i = 0; i < abbreviations; i++) {
                String abbreviation = input.next();
 
                for (int j = 0; j < abbreviation.length(); j++) {
                    if (!available[abbreviation.charAt(j) - 'A']) {
                        possible = false;
                    }
                }
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
    }
}