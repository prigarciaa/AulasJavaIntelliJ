package academy.prigarcia.aulaprojetojava;

public class Aula05EstruturasCondicionais04 {
    //Dado um determinado sálario anual eu quero saber o valor que eu ou ter que pagar de impostos.
    //€ 0 €      34,712  9.70%
    //€ 34,713 € 68,507  37.35%
    //€ 68,508           49.50%
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100; //porcentagem /
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if(salarioAnual <= 34712) {
            valorImposto= salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);

    }

}
