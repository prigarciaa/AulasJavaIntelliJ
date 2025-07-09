package academy.prigarcia.aulaprojetojava;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        //cód mais limpo

        //Doar se salario > 6000
        double salario = 1000;
        //("condição") ? verdadeiro : falso
        String resultado = salario > 6000 ? "Eu vou doar 500 reais par a Pri." : "Ainda não tenho condições, mas vou ter!"; //com operador ternário


        // segunda opção de cód
        /*String mensagemDoar = "Eu vou doar 500 reais para a Pri.";
        String mensagemNaoDoar = "Ainda não tenho condições, mas ainda vou ter!";
        //("condição") ? verdadeiro : falso
        String resultado = salario > 6000 ? mensagemDoar : mensagemNaoDoar; //com operador ternário
*/
        System.out.println(resultado);
    }
}




        // sem operador ternário

        /*if(salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }*/

