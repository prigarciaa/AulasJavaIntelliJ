package academy.prigarcia.aulaprojetojava;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {

            System.out.println("Autorizado a comprar bebida alcólica. ");
        }else{
            System.out.println("Não autorizado a comprar bebida alcólica. ");

        }


        if (!isAutorizadoComprarBebida) {

            System.out.println("Não autorizado a comprar bebida alcólica. ");

        }
    }
}
