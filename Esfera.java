package Atividades;
import java.util.Scanner;

    public class Esfera {
    private float radius;

    public Esfera(){

    }

    public Esfera(float radius) {
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float calcularVolume(){
        return (float) ((4/3) * Math.PI * Math.pow(radius, 3));
    }

    public float calcularArea(){
        return (float) (4 * Math.PI * Math.pow(radius, 2));
    }
}



