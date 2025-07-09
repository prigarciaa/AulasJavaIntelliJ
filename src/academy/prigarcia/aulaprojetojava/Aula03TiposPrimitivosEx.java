package academy;
/*
Prática

Crie variáveis para os campos descritos abaixo <> e imprima a seguinte mensagem:

Eu <nome>, morando no endreço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosEx {
    public static void main(String[] args) {
        String nome = "Priscila";
        String endereco = "Rua Michel Alexandre Mutran, 218";
        double salario = 2500;
        String dataRecebimento = "08/07/2025";
        String relatorio = " Eu "+ nome + "," + " morando no endereço " + endereco + "," + " confirmo que recebi o salário de " + salario + "," + " na data " + dataRecebimento + ".";
        System.out.println(relatorio);
        //System.out.println(" Eu "+ nome + "," + " morando no endereço " + endereco + "," + " confirmo que recebi o salário de " + salario + "," + " na data " + dataRecebimento + ".");

}

}