package academy.prigarcia.aulaprojetojava;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizando switch, dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como Domingo
        byte dia = 10;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
}
