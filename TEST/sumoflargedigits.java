import java.util.Scanner;

public class SumOfTwoLargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            System.out.print(computeSumOfTwoLargestDigits(num) + " ");
        }
    }
    
    public static int computeSumOfTwoLargestDigits(int num) {
        int largest = -1;
        int secondLargest = -1;
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
            temp /= 10;
        }
        
        if (secondLargest == -1) {
            return largest;
        } else {
            return largest + secondLargest;
        }
    }
}
