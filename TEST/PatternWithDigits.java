import java.util.Scanner;
public class PatternWithDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String P = sc.nextLine();
        int D = sc.nextInt();
        int count = 0;
        int i = 0;
        int lenS = S.length();
        int lenP = P.length();
        while (i <= lenS - lenP) {
            int j = i;
            int k = 0;
            int digitCount = 0;
            while (j < lenS && k < lenP) {
                char ch = S.charAt(j);

                if (Character.isDigit(ch)) {
                    digitCount++;
                } else if (ch == P.charAt(k)) {
                    k++;
                } else {
                    break;
                }
                j++;
            }
            if (k == lenP && digitCount >= D) {
                count++;
                i = j;
            } else {
                i++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}