import javax.swing.JOptionPane;
public class FM
{
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
    public static String pedirCadena(String msg)
    {
        return "";
    }
    //Metodo que recibe una cadena y lo muestra
    public static void mostrarMensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
}