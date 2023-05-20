import java.util.*;

class Dumplings extends Thread{
    
    int dumplings = 9000;
    int quantity;
    String name;
    Random ran = new Random();
    public int numbers = ran.nextInt((42) + 10);
    Dumplings(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public synchronized void run() {
        for (int i = 0 ; i < 9000 ; i++) {
            try {
                dumplings -= numbers;
                sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}
class Order {
    
    int dumplings = 9000;
    Dumplings Dumpling = new Dumplings(null, dumplings);
    public synchronized void order() {
        if (dumplings == 0) {
            System.out.println("水餃已售完");
            System.exit(0);
        } else {
            Dumpling.run();
            System.out.println(dumplings);
        }
    }
    public void Ordering() {
        Dumplings pork = new Dumplings("pork" , 5000);
        pork.start();
        Dumplings beef = new Dumplings("beef" , 3000);
        beef.start();
        Dumplings vegetable = new Dumplings("vegetable" , 1000);
        vegetable.start();
    }
}
public class A1103356_0512_1 {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        System.out.print("輸入顧客數量:");
        int customer = input.nextInt();
        Order a = new Order();
        a.Ordering();
    }
}