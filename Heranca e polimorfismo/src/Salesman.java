public non-sealed class Salesman extends Employee{

    private double Percentpersold;

    private double soldAmount;

    public Salesman(
            String code,
            String name,
            String adress,
            double salary,
            double Percentpersold,
            double soldAmount) {
        super(code, name, adress, salary);
        this.Percentpersold = Percentpersold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        return "SL" + super.getCode();
    }

    @Override
    public double getFullSalary() {
        return this.salary + (this.soldAmount * this.Percentpersold)/100;
    }




    public Salesman() {
    }

    public double getPercentpersold() {

        return Percentpersold;
    }

    public void setPercentpersold(double percentpersale) {

        Percentpersold = percentpersale;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
}
