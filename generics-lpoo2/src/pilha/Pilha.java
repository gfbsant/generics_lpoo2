package pilha;
import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
    private List<T> objetos;

    public Pilha() {
        this.objetos = new ArrayList<T>();
    }

    public void empilha(T t) {
        objetos.add(t);
    }

    public T desempilha() {
        if (vazia()) {
            return null;
        }
        return objetos.remove(objetos.size() - 1);
    }

    public boolean vazia() {
        return objetos.size() == 0;
    }

    @Override
    public String toString() {
        String s = "[ ";
        for (int i = objetos.size() -1; i >= 0; i--) {
            if (i < 1)
                s += objetos.get(i);
            else
                s += objetos.get(i) + " , ";
        }
        return s += " ]";
    }
}