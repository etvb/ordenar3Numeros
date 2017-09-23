//Ejercicio7: Pedir 3 numeros y mostrarlos ordenados de mayor a menor.

package ordenar3numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class Ordenar3Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        short num1, num2, num3;
        
        num1 = Short.parseShort(JOptionPane.showInputDialog("Ingresa el PRIMER número"));
        num2 = Short.parseShort(JOptionPane.showInputDialog("Ingresa el SEGUNDO número"));
        num3 = Short.parseShort(JOptionPane.showInputDialog("Ingresa el TERCER número"));
        
        //cuando usamos if else if, si cualquiera de ellos es verdadero, omite los demas que siguen.
        //Si usuamos if separados, evalua cada if 
        if(num1 > num2 && num1 > num3) {
            if(num2 > num3 ){
                JOptionPane.showMessageDialog(null, num1 +" "+ num2 +" "+ num3);
            } else{
                JOptionPane.showMessageDialog(null, num1 +" "+ num3 +" "+ num2);  
            }
        }else if(num2 > num1 && num2 > num3){
                if(num1 > num3){
                    JOptionPane.showMessageDialog(null, num2+" "+num1+" "+num3);            
                }else{
                    JOptionPane.showMessageDialog(null, num2+" "+num3+" "+num1);
                }
        }else if(num1 > num2){
                JOptionPane.showMessageDialog(null, num3+" "+num1+" "+num2);
            }else{
                JOptionPane.showMessageDialog(null, num3+" "+num2+" "+num1);  
        }         
    }
}
