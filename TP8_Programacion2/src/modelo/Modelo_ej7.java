package modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Modelo_ej7 {
    private ArrayList<String> inputApellido = new ArrayList();

    public ArrayList<String> getInputApellido() {
        return inputApellido;
    }

    public void setInputApellido(ArrayList<String> inputApellido) {
        this.inputApellido = inputApellido;
    }
    
    public void guardaAp() throws FileNotFoundException,IOException{
        try{
            FileOutputStream fichero = new FileOutputStream("apellidos.txt");
            ObjectOutputStream escribir = new ObjectOutputStream(fichero);
            escribir.writeObject(inputApellido);
            System.out.println("Apellido Ingresado");
            escribir.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado");
            e.getMessage();
        }
        catch(IOException e){
            System.out.println("Error al guardar");
            e.getMessage();
        }
    }
    
    public void recuperaAp() throws FileNotFoundException, IOException,
ClassNotFoundException,EOFException{
        FileInputStream archivo = new FileInputStream("apellidos.txt");
        ObjectInputStream lector = new ObjectInputStream(archivo);
       
        ArrayList <String> leeAp = (ArrayList <String>)lector.readObject();
        
        System.out.println("\nApellidos:");
        Iterator it = leeAp.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        lector.close();
    }
}
