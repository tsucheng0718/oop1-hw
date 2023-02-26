import java.util.*;
public class A1103356_0224_2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入攝氏溫度");
        float tempC = input.nextFloat();
        float tempF = ((float)9/(float)5)*tempC+(float)32;
        System.out.println("華氏溫度為:"+ tempF);
    }
}