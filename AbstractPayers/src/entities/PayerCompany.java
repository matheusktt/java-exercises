package entities;

public class PayerCompany extends Payer{

    private Integer numberEmployees;

    public PayerCompany() {

    }

    public PayerCompany(String name, Double anualIncome, Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double tax() {
        if (numberEmployees > 10){
            return anualIncome * 0.14;
        }else {
            return anualIncome * 0.16;
        }
    }
}