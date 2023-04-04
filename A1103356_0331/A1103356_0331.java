package A1103356_0331;

import java.util.*;
public class A1103356_0331 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        animal.showInfo();
        
        animal[] animals = new animal[2];
        animals[0] = new animal("雪寶", 1.1f, 52, 100);
        animals[1] = new animal("驢子", 1.5f, 99, 200);

        for (int i = 0 ; i < animals.length ; i++) {
            animals[i].show();
            System.out.println();
        }

        human[] humans = new human[3];
        humans[0] = new human("阿克", 1.9f, 80, 150, "男");
        humans[1] = new human("漢斯", 1.8f, 78, 130, "男");
        humans[2] = new human("安那", 1.7f,48, 120, "女");

        for (int i = 0 ; i < humans.length ; i++) {
            humans[i].show();
            System.out.println();
        }

        snow snowQueen = new snow("愛沙", 1.7f, 50, 120, "女", "Yes");
        snowQueen.show();
        System.out.println();

        for (int i = 0 ; i < animals.length ; i++) {
            System.out.println(animals[i].name + "奔跑距離計算:");
            System.out.print("enter x(時間):");
            double time = input.nextFloat();
            System.out.print("enter y(加速度)(若不輸入加速度請輸入0):");
            double a = input.nextFloat();
            if (a == 0) {
                System.out.println(animals[i].name + "奔跑距離" + animals[i].distance(time));
            } else {
                System.out.println(animals[i].name + "奔跑距離" + animals[i].distance(time, a));
            } 
        }

        for (int i = 0 ; i < humans.length ; i++) {
            System.out.println(humans[i].name + "奔跑距離計算:");
            System.out.print("enter x(時間):");
            double time = input.nextFloat();
            System.out.print("enter y(加速度)(若不輸入加速度請輸入0):");
            double a = input.nextFloat();
            if (a == 0) {
                System.out.println(humans[i].name + "奔跑距離" + humans[i].distance(time));
            } else {
                System.out.println(humans[i].name + "奔跑距離" + humans[i].distance(time, a));
            } 
        }       
        
        System.out.println(snowQueen.name + "奔跑距離計算:");
        System.out.print("enter x(時間):");
        double time = input.nextFloat();
        System.out.print("enter y(加速度)(若不輸入加速度請輸入0):");
        double a = input.nextFloat();
        if (a == 0) {
            System.out.println(snowQueen.name + "奔跑距離" + snowQueen.distance(time));
        } else {
            System.out.println(snowQueen.name + "奔跑距離" + snowQueen.distance(time, a));
        }

        input.close();
    }
}