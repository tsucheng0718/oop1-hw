import java.util.*;

public class A1103356_0421_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("輸入日期(YYYY/MM/DD or MM/DD/YYYY)");
        String date = input.nextLine();
        if (date.matches("[0-9]{4}/[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}") || date.matches("[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}/[0-9]{4}")) {
            System.out.println(date);
        } else {
            System.out.println("格式錯誤");
        }
    }
}
