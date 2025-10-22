public class RunnableLambdaExample {

    static void main() {

        // Before Java 8.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java 8");
            }
        };
        new Thread(runnable).start();

        // After Java 8.
        Runnable runnableLambda = () -> System.out.println("After Java 8");
        new Thread(runnableLambda).start();

        new Thread(() -> System.out.println("After Java 8")).start();
    }
}
