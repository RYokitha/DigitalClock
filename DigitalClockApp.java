 import java.util.Date;

class DigitalClock extends Thread {

    @Override
    public void run() {

        while (true) {
            Date date = new Date();

            // Extract hours, minutes, seconds
            int hours = date.getHours();
            int minutes = date.getMinutes();
            int seconds = date.getSeconds();

            // Format time as HH:MM:SS
            System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);

            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted");
            }
        }
    }
}

public class DigitalClockApp {

    public static void main(String[] args) {
        DigitalClock clock = new DigitalClock();
        clock.start();  // Start thread
    }
}
