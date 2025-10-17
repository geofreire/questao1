public class Celula {
    public Contato contato;
    public Celula anterior;
    public Celula proximo;

    public Celula(Contato contato) {
        this.contato = contato;
        this.anterior = null;
        this.proximo = null;
    }

    public Celula() {
    }
}