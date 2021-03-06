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
        VectorHeap<Paciente> vectorHeap= new VectorHeap<>();// crea el vector heap
        Scanner input = new Scanner(System.in);// crea el scanner
        System.out.println("Uso de Vector heap \n ingrese donde se localiza el archivo con los pacientes: ");// bufferReader codigo basado de los ejemplos encontrados en la pagina : https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
        String fileName = input.next();// se pide el ingreso de la direccion del file con el texto ejemplo: C:\Users\ticoa\OneDrive\Desktop\Cosas\EstructuraDeDatos\Tarea8\Pacientes.txt
        File file = new File(fileName);// crea el file
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) { //crea while donde se agregan los pacientes al vector heap
            //process the line
            String[] parts = line.split(",");// se separa el string que da el buffer reader
            Paciente pac = new Paciente(parts[0],parts[1],parts[2]); // crea al paciente con sus 3 atributos
            vectorHeap.add(pac); // agrega al paciente al vector heap

        }
        System.out.println("Lo siguiente son los pacientes ordenados con Vector Heap");
        while (!vectorHeap.isEmpty()){ // while que continua hasta que el vector heap este vacio
            System.out.println(vectorHeap.getFirst().Nombre+" tiene una Severidad"+vectorHeap.getFirst().Severidad+" sufre de "+ vectorHeap.getFirst().Problema);
            vectorHeap.remove(); // imprime y quita elementos del vector heap en orden
        }
        //Priority Queue
        PriorityQueue<Paciente> pq= new VectorHeap<>();// crea el priority
        System.out.println("Usando priority Queue \ningrese donde se localiza el archivo con los pacientes: ");// bufferReader codigo basado de los ejemplos encontrados en la pagina : https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
        String fileName2 = input.next();// se pide el ingreso de la direccion del file con el texto ejemplo: C:\Users\ticoa\OneDrive\Desktop\Cosas\EstructuraDeDatos\Tarea8\Pacientes.txt
        File file2 = new File(fileName2);// crea el file
        FileReader fr2 = new FileReader(file2);
        BufferedReader br2 = new BufferedReader(fr2);
        String line2;
        while ((line2 = br2.readLine()) != null) { //crea while donde se agregan los pacientes al Priority Queue
            //process the line
            String[] parts = line2.split(",");// se separa el string que da el buffer reader
            Paciente pac = new Paciente(parts[0],parts[1],parts[2]); // crea al paciente con sus 3 atributos
            pq.add(pac); // agrega al paciente al priority queue

        }
        System.out.println("Lo siguiente son los pacientes ordenados con priority Queue");
        while (!pq.isEmpty()){ // while que continua hasta que el priority queue este vacio
            System.out.println(pq.getFirst().Nombre+" tiene una Severidad"+pq.getFirst().Severidad+" sufre de "+ pq.getFirst().Problema);
            pq.remove(); // imprime y quita elementos del vector heap en orden
        }
    }
}
