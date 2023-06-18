package soma_area_sem_generics;

public class SomaArea {
    public double calculaArea(Superficie[] arr) {
        double area = 0.0;
        for (Superficie s : arr) {
            if (s instanceof Quadrado) {
                area += ((Quadrado) s).area();
            } else if (s instanceof Circunferencia) {
                area += ((Circunferencia) s).area();
            }
        }
        return area;
    }
}
