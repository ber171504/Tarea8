import java.util.Comparator;
public class Paciente implements Comparator {
    String Nombre;
    String Problema;
    String Severidad;

    Paciente(String n, String p, String s){
        this.Nombre = n;
        this.Problema = p;
        this.Severidad = s;
    }
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

}
