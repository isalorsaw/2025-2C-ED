public class TestNodo
{
    public static void main(String args[])
    {
        Nodo n[]=new Nodo[5];
        int ultimo=0;
        
        String menu="Menu\n1.Ingresar Info\n2.Buscar por Codigo\n3.Ver todos(Imprimir)\n4.Modificar\n0.Salir";
        
        int opcion=FM.pedirNumero(menu);
        while(opcion!=0)
        {
            switch(opcion)
            {
                case 1:
                    n[ultimo]=new Nodo();
                    ultimo++;
                break;
                
                case 2:
                    int codigo=FM.pedirNumero("Ingrese un Codigo a Buscar en el Array de Nodos");
                    Nodo nn=buscar(n,ultimo,codigo);
                    if(nn==null)FM.mostrarMensaje("No existe el codigo "+codigo);
                    else FM.mostrarMensaje("Si existe\n"+nn.toString());
                break;
                
                case 3:
                    imprimirNodos(n,ultimo);
                break;
                
                case 4:
                    codigo=FM.pedirNumero("Ingrese un Codigo a Buscar en el Array de Nodos");
                    nn=buscar(n,ultimo,codigo);
                    if(nn==null)FM.mostrarMensaje("No existe el codigo "+codigo);
                    else nn.editar();
                break;
            }
            opcion=FM.pedirNumero(menu);
        }
        if(opcion==0)FM.mostrarMensaje("Adios");
    }
    public static Nodo buscar(Nodo n[], int u, int codigo)
    {
        Nodo tmp=null;
        for(int i=0;i<u;i++)
        {
            if(n[i].equals(codigo))tmp=n[i];
        }
        return tmp;
    }
    public static void imprimirNodos(Nodo n[], int u)
    {
        String cad="Informacion de Alumnos\n";
        for(int i=0;i<u;i++)
        {
            cad+=n[i].toString()+"\n";
        }
        FM.mostrarMensaje(cad);
    }
}