package Entitie;

public class TaxPayer {
    private Double salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending;

    public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(Double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public Double getServicesIncome() {
        return servicesIncome;
    }

    public void setServicesIncome(Double servicesIncome) {
        this.servicesIncome = servicesIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(Double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(Double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public Double salaryTax(){
        Double salary = salaryIncome/12;
        Double tax;
        if(salary>=5000){
            tax = salaryIncome * 0.2;
        }else if(salary >=3000){
            tax = salaryIncome * 0.1;
        }else{
            tax = 0.0;
        }
        return tax;

    }

    public Double serviceTax(){
        return servicesIncome * 0.15;

    }

    public Double capitalTax(){
        return capitalIncome * 0.2;

    }

    public Double grossTax(){
        return salaryTax() + serviceTax() + capitalTax();

    }

    public Double taxRebate(){
        Double tax = grossTax() * 0.3;
        Double aux = healthSpending + educationSpending;
        if (aux >= tax){
            return tax;
        }else{
            return aux;
        }

    }

    public Double netTax(){
        return grossTax() - taxRebate();

    }


}
