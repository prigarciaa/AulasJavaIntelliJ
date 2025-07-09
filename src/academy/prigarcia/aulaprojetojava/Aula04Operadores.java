package academy.prigarcia.aulaprojetojava;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +, -, /, *
        int numero1 = 20;
        int numero2 = 10;
        int resultado = numero1 * numero2;
        System.out.println(resultado);
        //System.out.println(numero1 - numero2);

        // %
        int resto =  21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMenorIgualAVinte = 10 <= 20;
        boolean isDezMaiorIgualAVinte = 10 >= 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte );
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezMenorIgualAVinte " + isDezMenorIgualAVinte);
        System.out.println("isDezMaiorIgualAVinte " + isDezMaiorIgualAVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);

        // && (and) "e" || (or) "ou" ! (negação)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // =  +=  -=  *=  /=  %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %=2;
        System.out.println(bonus);

        // incrementador
        int contador = 0;
        contador += 1; //contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);




    }
}
