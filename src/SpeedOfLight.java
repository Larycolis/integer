public class SpeedOfLight {
    public static void main(String[] args) {
        int days = 10;
        int speed = 300000;
        long sec = days * 24 * 60 * 60;
        long distance = speed * sec;
        System.out.println("Свет пройдет " + distance + " километров за " + days + " дней");
    }
}
