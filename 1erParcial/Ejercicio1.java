/*Crear un menu con las siguientes opciones:
   1. SUmar dos numeros
   2. Restar dos numeros
   3. Multiplicar dos numeros
   4. Salir*/
import javax.swing.JOptionPane;
public class Ejercicio1
{
    public static void main(String args[])
    {
        String menu="Menu\n1. SUmar dos numeros\n2. Restar dos numeros\n"+
        "3. Multiplicar dos numeros\n4. Salir\nSeleccione una Opcion:";
        int opcion=0;
        
        do
        {
            opcion=pedirNumero(menu);    
        }while(opcion!=4);
    }
    public static int pedirNumero(String msg)
    {
        int n=0;
        boolean seguir=true;
        
        do{
            try
            {
                String entrada=JOptionPane.showInputDialog(msg);
                n=Integer.parseInt(entrada);
                seguir=false;
            }
            catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
        }while(seguir);
        return n;
    }
}