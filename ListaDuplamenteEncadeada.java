public class ListaDuplamenteEncadeada {
    private Celula primeira;
    private Celula ultima;
    private int tamanho;

    public void adicionar(Contato contato) {
        Celula nova = new Celula(contato);
        if (primeira == null) {
            primeira = ultima = nova;
        } else {
            ultima.proximo = nova;
            nova.anterior = ultima;
            ultima = nova;
        }
        tamanho++;
    }

    public void removerPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("posição inválida!");
            return;
        }

        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        if (atual.anterior != null)
            atual.anterior.proximo = atual.proximo;
        else
            primeira = atual.proximo;

        if (atual.proximo != null)
            atual.proximo.anterior = atual.anterior;
        else
            ultima = atual.anterior;

        tamanho--;
    }

    public void removerPorNome(String nome) {
        Celula atual = primeira;
        while (atual != null) {
            if (atual.contato.getNome().equalsIgnoreCase(nome)) {
                if (atual.anterior != null)
                    atual.anterior.proximo = atual.proximo;
                else
                    primeira = atual.proximo;

                if (atual.proximo != null)
                    atual.proximo.anterior = atual.anterior;
                else
                    ultima = atual.anterior;

                tamanho--;
                System.out.println("contato removido: " + nome);
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("contato não encontrado!");
    }

    public Contato pesquisarPorNome(String nome) {
        Celula atual = primeira;
        while (atual != null) {
            if (atual.contato.getNome().equalsIgnoreCase(nome)) {
                return atual.contato;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void listarContatos() {
        if (primeira == null) {
            System.out.println("a lista está vazia!");
            return;
        }
        Celula atual = primeira;
        while (atual != null) {
            System.out.println(atual.contato);
            atual = atual.proximo;
        }
    }

    public int getTamanho() {
        return tamanho;
    }
}