package Special_Code_Snippets;
public class MultiThreading extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        MultiThreading thread = new MultiThreading();
        thread.start();
        while (thread.isAlive()) {
            System.out.println("Op");
        }
        //  This code will work after the thread finish the code.
        System.out.println(amount);
        amount++;
        System.out.println(amount);
        System.out.println("BhargavOP");
    }

    public void run() {
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
}
