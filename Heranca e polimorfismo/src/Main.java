//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager()); // é possivel o construtor
        printEmployee(new Salesman()); // porem se colocar construtor precisamos criar construtor em todas as classes

    }

    public static void printEmployee(Employee employee ) {

        System.out.printf("========%s=======\n", employee.getClass().getCanonicalName());
        /*if (employee instanceof Manager manager) { ///// O if vai ser util em poucos casos, em muitos casos é melhorar usar o switch case
            employee.setName("Caio");
            ((Manager) employee).setLogin("caio"); //////è possivel fazer o cast da classe ou utilizar o instanceof
            manager.setPassword("123"); //com o instanceof fica mais limpo o codigo

            System.out.println(employee.getName());
            System.out.println(((Manager) employee).getLogin());
            System.out.println(manager.getPassword());

        }*/
        switch (employee){
            case Manager manager ->{
                manager.setName("Caio");
                manager.setCode("123");
                manager.setSalary(5000);
                manager.setLogin("caio");
                manager.setPassword("123");
                manager.setComission(1200);

                System.out.println(manager.getName());
                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
                System.out.println(manager.getFullSalary(500));
            }
            case Salesman salesman ->{
                salesman.setName("Joao");
                salesman.setCode("321");
                salesman.setSalary(2800);
                salesman.setPercentpersold(10);
                salesman.setSoldAmount(2000);

                System.out.println(salesman.getName());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getSoldAmount());
                System.out.println(salesman.getPercentpersold());
            }
        }
        System.out.println("===============");
        System.out.println(employee.getFullSalary());
    }

}