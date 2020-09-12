package tp8_programacion2;

import controlador.Controlador_ej7;
import modelo.Modelo_ej7;
import vista.Vista_ej7;

public class TP8_Programacion2 {
    public static void main(String[] args) {
        Vista_ej7 view = new Vista_ej7();
        Modelo_ej7 model = new Modelo_ej7();
        Controlador_ej7 ctrl = new Controlador_ej7(model,view);
            ctrl.iniciar();
            view.setVisible(true);
    }
}