import java.util.*;

public class A1103356_0421_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入email:");
        String email = input.nextLine();

        if(email.matches("[a-z]+.[a-z]+.[a-z]+")){
            System.out.println("正確格式");
        }else{
            System.out.println("錯誤格式。");
        }
    }
}
