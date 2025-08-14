public sealed abstract class  Employee permits Manager, Salesman/*Develop*/ {

    protected String code; //o publico iria querbrar nosso encapsulamento e o private somente da acesso dentro da classe,
    //protected não permite acesso de fora da classe ao menos que a classe que tente fazer acesso esteja herdando a classe

    protected String name;

    protected String adress;

    protected double salary;

    public Employee(String code,
                    String name,
                    String adress,
                    double salary) {
        this.code = code;
        this.name = name;
        this.adress = adress;
        this.salary = salary;
    }

    protected Employee() {
    }

    public String  getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getFullSalary();

}
