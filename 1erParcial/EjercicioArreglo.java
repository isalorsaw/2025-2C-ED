import javax.swing.JOptionPane;
public class EjercicioArreglo
{
    public static void main(String args[])
    {
        String menu="Menu\n1.Rellenar\n2.Llenar x Usuario\n"+
        "3.LlenarAleatorio\n4.Imprimir\n0.Salir\nSeleccione una Opcion:";
        
        //Pedir el tam que tendra el arreglo
        //int tam=pedirNumero("Ingrese el Tam del Arreglo");
        
        //Generar el tam del arreglo de un aleatorio de 5 a 10
        int tam=generaAleatorio(5,10);
        mostrarMensaje("El tam del arreglo es: "+tam);
        
        //crear el arreglo con el tam ingresado por el usuario
        int a[]=new int[tam];
        
        //String result=imprimir(a);
        //mostrarMensaje(result);
        
        int opcion=pedirNumero(menu);
        while(opcion!=0)
        {
            if(opcion==0)
            {
                mostrarMensaje("Adios");
            }
            else if(opcion==1)
            {
               int num=pedirNumero("Ingrese el Numero para rellenar en el arreglo");
               rellenar(a,num);
            }
            else if(opcion==2)
            {
                llenarXusuario(a);
            }
            else if(opcion==3)
            {
                int desde=pedirNumero("Ingrese el Desde del Rango");
                int hasta=pedirNumero("Ingrese el Hasta del Rango");
                llenarAleatorio(a,desde,hasta);
            }
            else if(opcion==4)
            {
                String result=imprimir(a);
                mostrarMensaje(result);
            }
            opcion=pedirNumero(menu);
        }
    }
    //Metodo que llena un arreglo de un rango de aleatorio
    public static void llenarAleatorio(int a[], int d, int h)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=generaAleatorio(d,h);
        }
    }
    public static int generaAleatorio(int d, int h)
    {
        return ((int)(Math.random()*(h-d+1)+d));
    }
    //Metodo que llena un arreglo pidiendo cada dato al usuario
    public static void llenarXusuario(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int p=i+1;
            a[i]=pedirNumero("Ingrese el Numero para la posicion "+p);
        }
    }
    //Metodo que recibe el arreglo y el numero para rellenar
    public static void rellenar(int a[], int n)
    {
        int i=0;
        while(i<a.length)
        {
            a[i]=n;
            i++;
        }
    }
    //Funcion que retorna el resultado de un arreglo en una cadena
    public static String imprimir(int a[])
    {
        String cadena="Informacion del Arreglo\n";
        for(int i=0;i<a.length;i++)
        {
            //cadena+=a[i]+" ";
            cadena+=" "+i+" -> "+a[i]+"\n";
        }
        return cadena;
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
    //Metodo que recibe una cadena y lo muestra
    public static void mostrarMensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
}