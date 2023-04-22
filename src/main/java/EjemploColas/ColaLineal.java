package EjemploColas;

public class ColaLineal {

    protected int fin;

    private static int MAXTAMQ = 39;

    protected int frente;

    protected Object[] listaCola;

    public ColaLineal(){
        frente = 0;
        fin = -1;
        listaCola = new Object[MAXTAMQ];
    }
    public boolean colaLlena(){
        return  fin == MAXTAMQ - 1;
    }

    public boolean colaVacia(){
        return  frente > fin;
    }

    public void insertar(Object elemento) throws Exception{
        if (!colaLlena()){
            listaCola[++fin] = elemento;
        }else {
            throw new Exception("La cola esta llena ");
        }
    }

    public void borrarCola() {
        frente = 0;
        fin = -1;
    }

    public Object frenteCola() throws Exception{
        if (!colaVacia()){
            return listaCola[frente];
        }else{
            throw new Exception("cola empty");
        }
    }

    public Object Quita() throws Exception{
        if (!colaVacia()){
            return listaCola[frente++];
        }else{
            throw new Exception("cola empty");
        }    }
}
