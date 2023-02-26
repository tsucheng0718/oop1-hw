import java.util.*;
public class A1103356_0224_2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入攝氏溫度");
        float degreeC = input.nextFloat();
        float degreeF = ((float)9/(float)5)*degreeC+(float)32;
        System.out.println("華氏溫度為:"+ degreeF);
    }
}