import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class SeatWork9Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.println("⏰ Welcome to Java Alarm Clock!");
        System.out.println("Set the alarm time in seconds from now.");

        System.out.print("Enter time (in seconds): ");
        int seconds = scanner.nextInt();

        TimerTask alarmTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("\n⏰⏰ ALARM! Time's up! ⏰⏰");
                timer.cancel();
            }
        };

        System.out.println("Alarm set for " + seconds + " seconds from now...");
        timer.schedule(alarmTask, seconds * 1000L);

        // Optional: show countdown
        for (int i = seconds; i > 0; i--) {
            System.out.print("Time left: " + i + "s\r");
            try {
                Thread.sleep(1000); // wait 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
