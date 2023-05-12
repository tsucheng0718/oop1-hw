import java.util.*;
import java.io.*;

public class A1103356_0505_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] prize = {1, 3, 5, 7, 9, 11};
        int[] arr = new int[6];

        for (int i = 0 ; i < 6 ; i++) {
            System.out.println("enter numbers:");
            int j = input.nextInt();
            if (j == prize[i]) {
                System.out.println("中獎");
            } else if ((j > 49) || (j < 1)) {
                throw new IllegalArgumentException("超過範圍");                   
            } else {
                System.out.println("未中獎");
            }
        }
    }
}
