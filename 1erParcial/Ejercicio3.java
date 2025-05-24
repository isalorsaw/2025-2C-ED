import javax.swing.JOptionPane;
public class Ejercicio3
{
    public static void main(String args[])
    {
        String cadena=FM.pedirCadena("Ingrese una Cadena");
        int tam=cadena.length();
        FM.mostrarMensaje(cadena+" tiene "+tam+" caracteres");
    }
}