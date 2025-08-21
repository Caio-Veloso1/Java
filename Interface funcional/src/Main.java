import java.util.List;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<User> users = List.of(new User("caio", 21), new User("Maria", 39));
        //users.forEach(user -> System.out.println(user)); uso do lambda
        //printStringValue(user -> user.toString(), users); pode ser usado assim ou abaixos
        printStringValue(Record::toString, users);
    }
    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}