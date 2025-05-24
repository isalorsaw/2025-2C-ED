public class Ejercicio2
{
    public static void main(String args[])
    {
        int n1=FM.pedirNumero("Ingrese el Primer Numero");
        int n2=FM.pedirNumero("Ingrese el Segundo Numero");
        int s=n1+n2;
        FM.mostrarMensaje(n1+"+"+n2+"="+s);
    }
}