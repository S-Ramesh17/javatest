import java.util.Scanner;

public class AddKToMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        int K = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            if (array[i] % K == 0) {
                array[i] += K;
            }
        }
        
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
