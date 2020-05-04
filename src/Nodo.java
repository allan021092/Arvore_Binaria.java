public class Nodo
{
    public int dado;
    public Nodo esquerdo;
    public Nodo direito;

    public Nodo(int dado)
    {
        this.dado = dado;
        this.esquerdo = null;
        this.direito = null;
    }


    public int getDado() {
        return dado;
    }
    public int setDado() {
        return dado;
    }

    public Nodo getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Nodo esquerdo) {
        this.esquerdo = esquerdo;
    }

    public Nodo getDireito() {
        return direito;
    }

    public void setDireito(Nodo direito) {
        this.direito = direito;
    }

}
