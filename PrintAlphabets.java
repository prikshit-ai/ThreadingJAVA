// Class to print alphabets using a separate thread
public class PrintAlphabets implements Runnable {

    @Override
    public void run() {
        try {
            // Loop to print alphabets from A to J
            for (char ch = 'A'; ch <= 'J'; ch++) {
                System.out.println("Alphabet: " + ch);
                Thread.sleep(500); // Pause thread for 0.5 second
            }
        } catch (InterruptedException e) {
            // Handle thread interruption
            System.out.println("PrintAlphabets thread was interrupted.");
        } catch (Exception e) {
            // Catch all other unexpected exceptions
            System.out.println("Unexpected error in PrintAlphabets: " + e.getMessage());
        }
    }
}
