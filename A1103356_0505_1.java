import java.util.*;
import java.io.*;
import java.util.Arrays;

public class A1103356_0505_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] prize = {1, 3, 5, 7, 9, 11};
        int[] arr = new int[6];

        for (int i = 0 ; i < 6 ; i++) {
            System.out.println("enter numbers:");
            int j = input.nextInt();
            arr[i] = j;
            if ((j > 49) || (j < 1)) {
                throw new IllegalArgumentException("超過範圍");                   
            } 
        }
        boolean bool = Arrays.equals(prize, arr);
        if (bool == true) {
            System.out.println("我就知道是你，又是你，你最棒");
        } else {
            System.out.println("我就知道是你，又是你，你最爛");
        }       
    }
}
