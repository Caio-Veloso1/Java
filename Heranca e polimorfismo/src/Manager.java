public non-sealed /*final, a classe pode ser instanciada com sealead, non-selaed e final*/ class Manager extends Employee{

    private String login;

    private String password;

    private double comission;

    public Manager(
            String code,
            String name,
            String adress,
            double salary,
            String login,
            String password,
            double comission) {
        super(code, name, adress, salary);
         this.login = login;
         this.password = password;
         this.comission = comission;
    }

    @Override
    public String getCode() {
        return "MN" + super.getCode();
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.comission;
    }

    public  double getFullSalary(double extra){
        return this.getFullSalary() + extra;
    }

    public Manager() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passoword) {
        this.password = passoword;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }


}
