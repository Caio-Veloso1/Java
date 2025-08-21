import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String, User> users = new HashMap<>();
        users.put("caio@caio", new User("caio", 33));
        users.put("joao@joao", new User("Joao", 21));
        users.put("maria@maria", new User("maria", 19));
        users.forEach((k, v) -> System.out.printf("Key %s | value %s\n", k ,v));
        System.out.println("=================");
        users.replace( "caio@caio", new User("caio", 20));
        users.forEach((k, v) -> System.out.printf("Key %s | value %s\n", k ,v));

    }

}