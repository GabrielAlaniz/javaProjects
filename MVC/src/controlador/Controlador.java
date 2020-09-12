/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author gabri
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;
    public Controlador(Vista view,Modelo model){
        this.model = model;
        this.view = view;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        model.setNumUno(Integer.parseInt(view.txt1.getText()));
        model.setNumDos(Integer.parseInt(view.txt2.getText()));
        model.multiplicar();
        view.txtRes.setText(String.valueOf(model.getResultado()));
    }

}
