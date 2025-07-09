package academy.prigarcia.aulaprojetojava;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >=18 categoria adulto

        // cód mais limpo
        int idade = 20;
        String categoria;

        if(idade < 15) {
          categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
          categoria = "Categoria Juvenil";
        } else {
          categoria = "Categoria Adulta";
    }
        System.out.println(categoria);
    }
       // segunda opção de cód.

        /*int idade = 20;
        if(idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade > 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }
    }*/
}
