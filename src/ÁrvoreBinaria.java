public class ÁrvoreBinaria {
    private Nodo raiz;

    public ÁrvoreBinaria() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    // MÉTODO PÚBLICO
    public void inserir_elemento(int dado) {
        if (raiz == null) {
            raiz = new Nodo(dado);
        } else {
            Nodo novo = new Nodo(dado);
            inserir_elemento(raiz, novo);
        }
    }

    private void inserir_elemento(Nodo arvore, Nodo novo) {
        if (novo.dado > arvore.dado) {
            if (arvore.direito == null) {
                arvore.direito = novo;
            } else {
                inserir_elemento(arvore.direito, novo);
            }
        } else {
            if (arvore.esquerdo == null) {
                arvore.esquerdo = novo;
            } else {
                inserir_elemento(arvore.esquerdo, novo);
            }
        }
    }

    // MÉTODO PÚBLICO
    public String imprime_preordem() {
        return "PREORDEM: " + imprime_preordem(this.raiz, "");
    }

    // MÉTODO PRIVADO
    public String imprime_preordem(Nodo n, String s) {
        if (n != null) {
            s += "," + n.getDado();
            s = imprime_preordem(n.getEsquerdo(), s);
            s = imprime_preordem(n.getDireito(), s);

        }
        return s;
    }

    // MÉTODO PÚBLICO
    public String imprime_posordem() {
        return "POSORDEM: " + imprime_posordem(this.raiz, "");
    }

    // MÉTODO PRIVADO
    public String imprime_posordem(Nodo n, String s) {
        if (n != null) {

            s = imprime_posordem(n.getEsquerdo(), s);
            s = imprime_posordem(n.getDireito(), s);
            s += "," + n.getDado();

        }
        return s;
    }

    // MÉTODO PÚBLICO
    public String imprime_inordem() {
        return "INORDEM: " + imprime_inordem(this.raiz, "");
    }

    // MÉTODO PRIVADO
    public String imprime_inordem(Nodo n, String s) {
        if (n != null) {

            s = imprime_inordem(n.getEsquerdo(), s);
            s += "," + n.getDado();
            s = imprime_inordem(n.getDireito(), s);


        }
        return s;
    }
    // MÉTODO PÚBLICO
    public String existe_elemento(int nro) {
        if (existe_elemento(this.raiz, nro)) return "Número: " + nro + " Encontrado. ";
        return "Número: " + nro + " Não encontrado.";
    }

    private boolean existe_elemento(Nodo n, int nro) {
        if (n != null) {
            if (n.getDado() == nro) return true;
            boolean ok1 = existe_elemento(n.getEsquerdo(), nro);
            boolean ok2 = existe_elemento(n.getDireito(), nro);
            if (ok1 || ok2) return true;

        }
        return false;
    }
    // MÉTODO PÚBLICO
    public String somar() {
        int cant = somar(this.raiz);
        return "A soma dos nodos é : " + cant;
    }

    private int somar(Nodo n) {
        if (n == null) return 0;
        int q1 = somar(n.getEsquerdo());
        int q2 = somar(n.getDireito());
        int q3 = q1 + q2 + n.getDado();
        return q3;
    }

    // CONTAR OS NODOS DA ARVORE
    public String contar() {
        int cant = contar(this.raiz);
        return "Há árvore tem " + cant + " nodos";
    }

    private int contar(Nodo n) {

        if (n == null) return 0;
        int q1 = contar(n.getEsquerdo());
        int q2 = contar(n.getDireito());
        int q3 = q1 + q2 + 1;
        return q3;

    }

    // Calcular a altura da arvore
    public String imprime_altura() {
        int alt = imprime_altura(this.raiz);
        return "A altura da árvore é: " + alt;
    }

    private int imprime_altura(Nodo n) {
        if (n == null) return 0;
        int h1 = imprime_altura(n.getEsquerdo());
        int h2 = imprime_altura(n.getDireito());
        if (h1 > h2) return h1 + 1;
        return h2 + 1;
    }

    // Calcular o maior valor
    public String imprime_maior() {
        int maior = imprime_maior(this.raiz);
        return "O maior dado é : " + maior;
    }

    private int imprime_maior(Nodo n) {
        if (n == null) return 0;
        int m1 = imprime_maior(n.getEsquerdo());
        int m2 = imprime_maior(n.getDireito());
        int m3 = n.getDado();
        if (m1 >= m2 && m1 >= m3) return m1;
        if (m2 >= m1 && m2 >= m3) return m2;
        return m3;
    }



    private Nodo maiorvalor(Nodo n){
        while (n.getDireito() != null){
            n = n.getDireito();
        }
        return n;
    }

    public String remove_elemento(int dado) {
        Nodo n = remove_elemento(this.raiz,dado);
        return "O número " + dado + " foi removido";
    }

    private Nodo remove_elemento(Nodo n, int dado)
    {
        if (n == null) {
            return n;
        }

        // valor menor, procurar na sub-árvore esquerda.
        if (dado < n.getDado()) {
            n.setEsquerdo(remove_elemento(n.getEsquerdo(), dado));
        } else if (dado > n.getDado()) {
            // valor maior, procurar na sub-árvore direita.
            n.setDireito(remove_elemento(n.getDireito(), dado));
        } else { // valor encontrado
            // nó é uma folha (não tem filhos)
            if (n.getEsquerdo() == null && n.getDireito() == null) {
                // remove-o (seta a "raiz" deste nó para null).
                return null;
            }
        }

        // nó não foi encontrado ou não é folha, retorna o próprio nó.
        return n;
    }



}
