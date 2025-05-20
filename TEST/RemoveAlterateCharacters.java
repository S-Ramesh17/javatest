import java.util.Scanner;

public class RemoveAlternateRepeatedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        
        if (S.length() == 0) {
            System.out.println("");
            return;
        }
        
        char prevChar = S.charAt(0);
        result.append(prevChar);
        int consecutiveCount = 1; // Count of consecutive repeated characters
        
        for (int i = 1; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (currentChar == prevChar) {
                consecutiveCount++;
                if (consecutiveCount % 2 == 1) {
                    result.append(currentChar);
                }
            } else {
                consecutiveCount = 1;
                result.append(currentChar);
                prevChar = currentChar;
            }
        }
        
        System.out.println(result.toString());
    }
}
