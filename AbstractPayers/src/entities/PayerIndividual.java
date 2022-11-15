package entities;

public class PayerIndividual extends Payer{

    private Double healthExpenditures;

    public PayerIndividual() {

    }

    public PayerIndividual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (anualIncome < 20000){
            return anualIncome * 0.15 - healthExpenditures * 0.5;
        }else {
            return anualIncome * 0.25 - healthExpenditures * 0.5;
        }
    }
}