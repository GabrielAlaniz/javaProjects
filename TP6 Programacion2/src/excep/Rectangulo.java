/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Silvia
 */
public class Rectangulo implements java.io.Serializable{
    private int ancho ;
    private int alto ;

    public Rectangulo() { }

    public Rectangulo(int an, int al){
    ancho = an;
    alto = al;
    }
//  GUARDA EN EL TXT:
    public void guardaRect() throws FileNotFoundException, IOException {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("figura.txt"));
            System.out.println("se guardó un objeto compuesto\n");
            salida.writeObject(this);//writeUnshared(this);     // this representa al obj rectangulo que va a ingresar al metodo
            salida.close(); }
        catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo");
            e.getMessage(); }
        catch(IOException e){
            System.out.println("Hubo un error al guardar");
            e.getMessage(); } 
    }
//  RECUPERA EL TXT:
    public Rectangulo consultaRect() throws FileNotFoundException, IOException, ClassNotFoundException,EOFException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("figura.txt"));
        Rectangulo obj1 = (Rectangulo)entrada.readObject();     // CASTEO a objeto rectangulo (la JVM lee un objeto pero no sabe de que tipo es)
        System.out.println("------------------------------");
        System.out.println("Recuperados: ancho: "+obj1.ancho+" alto: "+obj1.alto);
        System.out.println("------------------------------");
        entrada.close();
    return obj1;
    }

    public int calcularArea(){
        int area = this.alto*this.ancho;
    return area;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String pregunta = JOptionPane.showInputDialog("1.guarda el objeto? \n0.Recupera el objetos?");
        Rectangulo r = new Rectangulo();
        
        if (pregunta.trim().equals("1")) {
            String anchura = JOptionPane.showInputDialog("Ingrese el ancho:");
                r.ancho= Integer.parseInt(anchura);
            String altura=JOptionPane.showInputDialog("Ingrese el alto:");
                r.alto= Integer.parseInt(altura);
            System.out.println("ancho: "+r.ancho+" alto: "+r.alto+"\nel área es "+r.calcularArea());
                r.guardaRect();}
        else {
            r=r.consultaRect();
            System.out.println("ancho: "+r.ancho+" alto: "+r.alto+"\nel área1 es "+r.calcularArea());
        } 
    } 
}