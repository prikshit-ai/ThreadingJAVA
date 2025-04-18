public class PrintAlphabets implements Runnable {

    @Override
    public void run() {
        try {
            for (char ch = 'A'; ch <= 'J'; ch++) {
                System.out.println("Alphabet: " + ch);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("PrintAlphabets thread interrupted.");
        } catch (Exception e) {
            System.out.println("Unexpected error in PrintAlphabets: " + e.getMessage());
        }
    }
}
