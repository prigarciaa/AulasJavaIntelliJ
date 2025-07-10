package academy.prigarcia.aulaprojetojava;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 1 a 1000000
        for(int i = 1; i < 1000000; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
