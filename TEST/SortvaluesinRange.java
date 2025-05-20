import java.util.*;

public class SortValuesInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        int start = Math.min(X, Y);
        int end = Math.max(X, Y);
        
        int[] array = new int[N];
        List<Integer> valuesInRange = new ArrayList<>();
        List<Integer> positions = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
            if (array[i] >= start && array[i] <= end) {
                valuesInRange.add(array[i]);
                positions.add(i);
            }
        }
        
        Collections.sort(valuesInRange);
        
        for (int i = 0; i < positions.size(); i++) {
            array[positions.get(i)] = valuesInRange.get(i);
        }
        
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
