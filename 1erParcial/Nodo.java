public class Nodo
{
    //Atributos
    int codigo;
    String nombre;
    int edad;
    //Constructores
    public Nodo()
    {
        codigo=FM.pedirNumero("Ingrese el Codigo del Alumno");
        nombre=FM.pedirCadena("Ingrese el Nombre del Alumno");
        edad=FM.pedirNumero("Ingrese la Edad del Alumno");
    }
    public Nodo(int codigo, String nombre, int edad)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.edad=edad;
    }
    public String toString()
    {
        return "Codigo: "+codigo+" Nombre: "+nombre+" Edad: "+edad;
    }
    public static void main(String args[])
    {
        Nodo n=new Nodo();
        FM.mostrarMensaje(n.toString());
    }
    
    
}