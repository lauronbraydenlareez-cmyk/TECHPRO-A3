import java.util.Timer;
import java.util.TimerTask;

public class SeatWork9Task5 {

    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed!");
                timer.cancel(); // stop timer
            }
        };

        System.out.println("Task scheduled...");
        timer.schedule(task, 3000); // 3000 ms = 3 seconds
    }
}
