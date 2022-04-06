public class Seconds {
    public static void main(String[] args) {
        int seconds = 300000;
        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondInDays = secondsInHours * 24;
        System.out.println("Известно, что:");
        System.out.println("В одном дне " + secondInDays + " секунд");
        System.out.println("В одном часе " + secondsInHours + " секунд");
        System.out.println("В одной минуте " + secondsInMinutes + " секунд");
        System.out.println("Задача: вычислить сколько дней, часов, минут и секунд в " + seconds + " секунд");
        System.out.println(" ");
        System.out.println("Решение:");
        int days = seconds / secondInDays;
        int hours = (seconds % secondInDays) / secondsInHours;
        int minutes = ((seconds % secondInDays) % secondsInHours) / secondsInMinutes;
        int leftSeconds = seconds - (days * secondInDays) - (hours * secondsInHours) - (minutes * secondsInMinutes);
        System.out.println("Общее количество секунд " + seconds);
        System.out.println("Дни: " + days);
        System.out.println("Часы: " + hours);
        System.out.println("Минуты: " + minutes);
        System.out.println("Секунды: " + leftSeconds);
    }
}
