package Main;

import Entitie.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();
        List<TaxPayer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.println("Digite os dados do " + (i+1) + " contribuinte:" );
            System.out.println("Renda anual com salário: ");
            Double salaryIncome = sc.nextDouble();
            System.out.println("Renda anual com prestação de serviço: ");
            Double serviceIncome = sc.nextDouble();
            System.out.println("Renda anual com ganho de capital: ");
            Double capitalIncome = sc.nextDouble();
            System.out.println("Gastos médicos: ");
            Double healthSpending = sc.nextDouble();
            System.out.println("Gastos educacionais: ");
            Double educationSpending = sc.nextDouble();

            list.add(new TaxPayer(salaryIncome, serviceIncome, capitalIncome, healthSpending, educationSpending));
        }

        for(TaxPayer taxPayer: list){
            System.out.printf("Resumo do %d contribuinte:\n", (list.indexOf(taxPayer)+1) );
            System.out.printf("Imposto bruto total:  %.2f\n", taxPayer.grossTax());
            System.out.printf("Abatimento: %.2f\n", taxPayer.taxRebate());
            System.out.printf("Renda anual com ganho de capital: %.2f\n", taxPayer.netTax());
            System.out.println("");
        }

        sc.close();
    }
}
