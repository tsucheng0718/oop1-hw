import java.util.*;
class animal {
    String name;
    float height;
    int weight;
    int speed;
    void show() {
        System.out.println("name:" + name + " " + "height:" + height + " " + "weight:" + weight + " " + "speed:" + speed);
    }
    double distance(double x) {
        return x * this.speed;
    }
    double distance(int x, double y) {
        return x * y * this.speed;
    }
}
public class A1103356_0324_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        animal[] animals = new animal[4];
        animals[0] = new animal();
        animals[1] = new animal();
        animals[2] = new animal();
        animals[3] = new animal();

        animals[0].name = "雪寶";
        animals[0].height = 1.1f;
        animals[0].weight = 52;
        animals[0].speed = 100;
        animals[0].show();
        
        animals[1].name = "驢子";
        animals[1].height = 1.5f;
        animals[1].weight = 99;
        animals[1].speed = 200;
        animals[1].show();

        animals[2].name = "安那";
        animals[2].height = 1.7f;
        animals[2].weight = 48;
        animals[2].speed = 120;
        animals[2].show();

        animals[3].name = "愛沙";
        animals[3].height = 1.7f;
        animals[3].weight = 50;
        animals[3].speed = 120;
        animals[3].show();

        for (int i = 0 ; i < animals.length ; i++) {
            System.out.print("enter x:");
            int num1 = input.nextInt();
            System.out.print("enter y or not (y/n):");
            String a = input.next();
            if (a.equals("y")){
                System.out.print("enter y:");
                double num2 = input.nextFloat();
                System.out.println(animals[i].name + "速度為" + animals[i].distance(num1, num2));
            } else {
                System.out.println(animals[i].name + "速度為" + animals[i].distance(num1));
            }
        }

        input.close();
    }
}