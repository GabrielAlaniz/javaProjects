package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo_ej7;
import vista.Vista_ej7;

public class Controlador_ej7 implements ActionListener{
    Modelo_ej7 modelo;
    Vista_ej7 vista;
    
    public Controlador_ej7(Modelo_ej7 modelo,Vista_ej7 vista){
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btn_otroAp.addActionListener(this);
        this.vista.btn_terminar.addActionListener(this);
        this.vista.combo_1.addActionListener(this);
        this.vista.btn_verTxt.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setTitle("Apellidos TP8");
        vista.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.btn_otroAp){
            modelo.getInputApellido().add(vista.txt_input.getText());
            vista.txt_input.setText("");
        }
        if(e.getSource() == vista.btn_terminar){
            modelo.getInputApellido().add(vista.txt_input.getText());
            
            for(String ap: modelo.getInputApellido()){
                vista.combo_1.addItem(ap.toString());
            }
            
            try {
                modelo.guardaAp();
            } catch (IOException ex) {
                Logger.getLogger(Controlador_ej7.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            vista.txt_input.setText("");
            vista.txt_input.setEditable(false);
        }
        if(e.getSource() == vista.combo_1){
            vista.txt_output.setText("Usted eligió el apellido: "+vista.combo_1.getSelectedItem().toString());
        }
        if(e.getSource() == vista.btn_verTxt){
            try {
                modelo.recuperaAp();
            } catch (IOException ex) {
                Logger.getLogger(Controlador_ej7.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("IOException");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador_ej7.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ClassNotFoundException");
            }
        }
    }
}
