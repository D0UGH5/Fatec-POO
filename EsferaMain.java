package Atividades;
import java.util.Scanner;

public class EsferaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do Raio: ");
        float radius = sc.nextFloat();
        Esfera esfera = new Esfera(radius);
        System.out.println("volume: " + esfera.calcularVolume() + "\nArea: " + esfera.calcularArea());
        sc.close();
    }
}
