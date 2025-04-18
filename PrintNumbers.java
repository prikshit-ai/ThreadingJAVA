// Class to print numbers using a separate thread
public class PrintNumbers implements Runnable {

    @Override
    public void run() {
        try {
            // Loop to print numbers 1 to 10
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i);
                Thread.sleep(500); // Pause thread for 0.5 second to simulate delay
            }
        } catch (InterruptedException e) {
            // Handle thread interruption (e.g., if another thread interrupts it)
            System.out.println("PrintNumbers thread was interrupted.");
        } catch (Exception e) {
            // Catch all other unexpected exceptions
            System.out.println("Unexpected error in PrintNumbers: " + e.getMessage());
        }
    }
}
