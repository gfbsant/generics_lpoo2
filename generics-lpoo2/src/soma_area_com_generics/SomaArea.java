package soma_area_com_generics;


public class SomaArea <T>{
    public <T extends Superficie> double calculaArea(T[] arr){
        double soma = 0;
        for (T t : arr) {
            soma += t.area();
        }
        return soma;
    }
}
