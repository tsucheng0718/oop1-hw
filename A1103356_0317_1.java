import java.util.*;

public class A1103356_0317_1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("輸入n:");
        int n = input.nextInt();
        System.out.print("輸入m:");
        int m = input.nextInt();
        
        int[][] a = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (i+1) * (j+1);
            }
        }

        for (int[] b : a) {
            for (int c : b) {
                System.out.print(c + ",");
            }
            System.out.println();
        }
    }
}
