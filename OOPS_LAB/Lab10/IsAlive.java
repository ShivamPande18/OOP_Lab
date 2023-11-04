public class Main {
    public static void main(String[] args) {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(data);

        Thread t1 = new DisplayMatrixThread(matrix);
        Thread t2 = new DisplayTransposeThread(matrix);
        Thread t3 = new DisplayMaxValueThread(matrix);
        Thread t4 = new DisplayPrincipalDiagonalThread(matrix);
        Thread t5 = new DisplayNonDiagonalElementsThread(matrix);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Check if threads are alive
        System.out.println("\nChecking thread status using isAlive():");
        System.out.println("Thread t1 is alive: " + t1.isAlive());
        System.out.println("Thread t2 is alive: " + t2.isAlive());
        System.out.println("Thread t3 is alive: " + t3.isAlive());
        System.out.println("Thread t4 is alive: " + t4.isAlive());
        System.out.println("Thread t5 is alive: " + t5.isAlive());

        try {
            // Wait for threads to finish using join()
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();

            // Check thread status again after join
            System.out.println("\nChecking thread status after join():");
            System.out.println("Thread t1 is alive: " + t1.isAlive());
            System.out.println("Thread t2 is alive: " + t2.isAlive());
            System.out.println("Thread t3 is alive: " + t3.isAlive());
            System.out.println("Thread t4 is alive: " + t4.isAlive());
            System.out.println("Thread t5 is alive: " + t5.isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
