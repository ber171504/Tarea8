
public class Paciente implements Comparable<Paciente> {
    String Nombre;
    String Problema;
    String Severidad;

    Paciente(String n, String p, String s){
        this.Nombre = n;
        this.Problema = p;
        this.Severidad = s;
    }

    @Override
    public int compareTo(Paciente o) {
        return this.Severidad.compareTo(((Paciente)o).Severidad);

    }
}
