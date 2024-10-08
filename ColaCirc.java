package ColasCircular;

public class ColaCirc {
    private String[] cola;
    private int frente;
    private int colaFinal;
    private int tamanio;
    public ColaCirc(int tamanio) {
        this.tamanio = tamanio;
        cola = new String[tamanio];
        frente = -1;
        colaFinal = -1;
    }

    public boolean vacia(){
        return frente == -1;
    }

    public boolean llena(){
        return ((colaFinal+1)%tamanio == frente);
    }

    public void encolar(String elemento){
        if (llena()){
            System.out.println("Cola llena. No se puede insertar");
            return;
        }
        if (vacia()){
            frente = 0;
        }
        colaFinal = (colaFinal+1)%tamanio;
        cola[colaFinal] = elemento;
        System.out.println("Elemento insertado: " + elemento);
    }

    public void desencolar(){
        if (vacia()){
            System.out.println("Cola vacia. No se puede eliminar");
        }
        String elemento = cola[frente];
        if (frente==colaFinal){
            frente = -1;
            colaFinal = -1;
        } else {
            frente = (frente+1)%tamanio;
        }
        System.out.print("El archivo " + elemento + " se ha eliminado el cola");
    }

    public void frente (){
        if (vacia()){
            System.out.println("Cola vacia");
        }
        System.out.println("Frente: " + cola[frente]);
    }
}