package soma_area_sem_generics;

public class Circunferencia implements Superficie {

    public double raio; 

    public Circunferencia (double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
    
}
