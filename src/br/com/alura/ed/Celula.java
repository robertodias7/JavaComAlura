package br.com.alura.ed;

public class Celula {
    private Object elemento;
    private Celula proximo;
    private Celula anterior;

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }


    public Celula( Object elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public Celula getProximo() {
        return (Celula) proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public Celula setAnterior(Celula anterior) {
        this.anterior = anterior;
        return anterior;
    }

}
