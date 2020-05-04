import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static Console c = new Console("ÁRVORE BINÁRIA");
    public static void main(String[] args) {


        AtomicReference<ÁrvoreBinaria> abv = new AtomicReference<>(new ÁrvoreBinaria());

        System.out.println(abv);
        abv.get().inserir_elemento( 12);
        System.out.println(abv);
        abv.get().inserir_elemento( 4);
        System.out.println(abv);
        abv.get().inserir_elemento( 2);
        System.out.println(abv);
        abv.get().inserir_elemento( 8);
        System.out.println(abv);
        abv.get().inserir_elemento( 6);
        System.out.println(abv);
        abv.get().inserir_elemento( 16);
        System.out.println(abv);


        c.println(abv.get().imprime_preordem());

        c.println(abv.get().imprime_inordem());

        c.println(abv.get().imprime_posordem());

        c.println(abv.get().existe_elemento(4));

        c.println(abv.get().existe_elemento( 25));

        c.println(abv.get().contar());

        c.println(abv.get().somar());

        c.println(abv.get().imprime_altura());

        c.println(abv.get().imprime_maior());

        c.println(abv.get().remove_elemento(16));

        c.println(abv.get().imprime_preordem());



    }
}
