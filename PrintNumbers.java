public class PrintNumbers implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i);
                Thread.sleep(500); // Pause for half a second
            }
        } catch (InterruptedException e) {
            System.out.println("PrintNumbers thread interrupted.");
        } catch (Exception e) {
            System.out.println("Unexpected error in PrintNumbers: " + e.getMessage());
        }
    }
}
