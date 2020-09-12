package excepciones;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        try{
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
            
            ExaminaNum(num);
            
        }catch(NoNegativosException e){
            System.out.println("ERROR!! No es posible procesar un numero negativo");
            System.out.println("Tipo de error --> "+e.getClass());
        }
    }
    
    // Creo la clase de la excepcion y sus constructores
    static class NoNegativosException extends Exception {
        public NoNegativosException(){}
        public NoNegativosException(String msjError){
            super(msjError);    // llamo al constructor de la clase exception y le paso el parametro
        }
    }
    
    // Método que evalua si el numero cumple con la excepcion y la lanza
    static void ExaminaNum(int num) throws NoNegativosException{
        if (num>=0){
            System.out.println("El numero ingresado: "+num+", es correcto");
        }
        else{
            throw new NoNegativosException();
        }

    }
}
