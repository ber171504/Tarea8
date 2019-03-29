/*
 *Andres Berthet 171504
 * Hoja de Trabajo 8
 * 29 de Marzo de 2019
 * Algoritmos y estructura de deatos
 * */
import java.io.IOException;
import java.util.Scanner ;
import java.io.*;
public class main {
    public static void main(String [] args) throws IOException {
        VectorHeap vectorHeap = new VectorHeap();
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese donde se localiza el archivo con los pacientes: ");// bufferReader codigo basado de los ejemplos encontrados en la pagina : https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
        String fileName = input.next();
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            //process the line
            String[] parts = line.split(",");// se separa el string que da el buffer reader
            Paciente pac = new Paciente(parts[0],parts[1],parts[2]);
            vectorHeap.add((Comparable) pac);
        }
        
    }
}
