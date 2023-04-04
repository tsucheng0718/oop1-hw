package A1103356_0331;

public class animal {
    String name;
    float height;
    int weight;
    double speed;
    animal(String name, float height, int weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
    void show() {
        System.out.print("姓名:" + name + " "); 
        System.out.print("身高(m):" + height + " ");
        System.out.print("體重(kg):" + weight + " ");
        System.out.print("速度(m/s):" + speed);
    }

    double distance(double x, double y) {
        return x * y * speed;
    }

    double distance(double x) {
        return x * speed;
    }

    public static void showInfo() {
        System.out.println("歡迎進入冰雪奇緣系統:");
    }
}

class human extends animal {
    String gender;
    human(String name, float height, int weight, double speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }
    void show() {
        super.show();
        System.out.print(" " +"性別:" + gender);

    }
}

class snow extends human {
    String ice;
    snow(String name, float height, int weight, double speed, String gender, String ice) {
        super(name, height, weight, speed, gender);
        this.ice = ice;
    }
    void show() {
        super.show();
        System.out.print(" "+"冰凍技能:" + ice);
    }

    double distance(double x, double y) {
        return 2 * super.distance(x, y);
    }

    double distance(double x) {
        return 2 * super.distance(x);
    }
}