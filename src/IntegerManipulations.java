import java.util.Random;

public class IntegerManipulations {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println("a + b = " + c);
        c = c + 5;
        System.out.println("c =" + c);
        System.out.println("c = c + 5 можно сократить до с += 5");
        c = c * 10;
        System.out.println("c = " + c);
        System.out.println("c = c * 10 можно сократить до с *= 10");
        a = 10;
        b = 3;
        c = a / b;
        System.out.println("c = " + c);
        a = 10;
        b = 3;
        c = a % b;
        System.out.println("c = " + c);
        Random random = new Random();
        System.out.println("Случайное число: " + random.nextInt(100));
    }
}
