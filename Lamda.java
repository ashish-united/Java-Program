public class Lamda {

    public static void main(String[] args) {

        // 1. Simple lambda with Runnable
        Runnable task = () -> System.out.println("Hello from Lambda!");
        task.run();

        // 2. Lambda with one parameter (no return)
        java.util.function.Consumer<String> print = (msg) -> System.out.println("Message: " + msg);
        print.accept("Easy lambda example!");

        // 3. Lambda with one parameter (returns square)
        java.util.function.Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 4 = " + square.apply(4));
    }
}