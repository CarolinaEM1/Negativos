/*
 Pedir 10 numeros, y mostrar al final si se ha introducido alguno negativo
 */
package ejercicio20;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        boolean negativos= false;
        
        for (int i=1; i<=10; i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "+i));
            
            if (numero< 0){
                negativos= true;
            }
        }
        if (negativos == true){
            JOptionPane.showMessageDialog(null,"Si existe al menos un número negativo");
        }
        else {
            JOptionPane.showMessageDialog(null,"No existe ningún número negativo");
        }
        
    }
    
}
