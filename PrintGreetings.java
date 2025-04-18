// Class to print greeting messages using a separate thread
public class PrintGreetings implements Runnable {

    @Override
    public void run() {
        try {
            // Loop to print a greeting message 5 times
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from thread!");
                Thread.sleep(1000); // Pause for 1 second
            }
        } catch (InterruptedException e) {
            // Handle interruption if thread is stopped externally
            System.out.println("PrintGreetings thread was interrupted.");
        } catch (Exception e) {
            // Handle any other exception
            System.out.println("Unexpected error in PrintGreetings: " + e.getMessage());
        }
    }
}
