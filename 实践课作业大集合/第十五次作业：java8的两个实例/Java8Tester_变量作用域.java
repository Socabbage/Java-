public class Java8Tester_变量作用域 {

    final static String salution = "Hello! ";

    public static void main(String[] args) {
        GreetingService greetService1 = message ->
                System.out.println(salution + message);
        greetService1.sayMessage("Runoob");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
