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
            switch(opcion)
            {
                case 1:
                    int num1=pedirNumero("Ingrese un Numero Entero");
                    int num2=pedirNumero("Ingrese un 2do Numero Entero");
                    int suma=num1+num2;
                    mostrarMensaje("La suma de "+num1+" y "+num2+" es "+suma);
                break;
                
                case 2:
                    num1=pedirNumero("Ingrese un Numero Entero");
                    num2=pedirNumero("Ingrese un 2do Numero Entero");
                    int resta=num1-num2;
                    mostrarMensaje("La Resta de "+num1+" y "+num2+" es "+resta);
                break;
                
                case 3:
                    num1=pedirNumero("Ingrese un Numero Entero");
                    num2=pedirNumero("Ingrese un 2do Numero Entero");
                    int mult=num1*num2;
                    mostrarMensaje("La Multiplicacion de "+num1+" y "+num2+" es "+mult);
                break;
                
                case 4:
                    mostrarMensaje("Adios");
                break;
            }
        }while(opcion!=4);
    }
    //Metodo que recibe una cadena y lo muestra
    public static void mostrarMensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    //Funcion que pide y valida un numero y lo retorna
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