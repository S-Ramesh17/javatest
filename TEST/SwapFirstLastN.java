import java.util.Scanner;

public class SwapFirstLastN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = sc.nextInt();
        int len = S.length();
        String firstN = S.substring(0, N);
        String middle = S.substring(N, len - N);
        String lastN = S.substring(len - N);
        String result = lastN + middle + firstN;
        System.out.println(result);
        sc.close();
    }
}
