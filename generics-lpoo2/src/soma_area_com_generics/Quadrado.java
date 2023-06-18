package soma_area_com_generics;

public class Quadrado implements Superficie {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double area() {
        return lado * lado;
    }

}
