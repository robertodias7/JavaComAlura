package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PricipalComArrayList {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var filmeDoPaulo = new Filme("Cidade dos Cães", 2003);
        filmeDoPaulo.avalia(10);

        Series perdido = new Series("Perdido", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(perdido);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //instanceof pergunta se o item é realmente do filme
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        System.out.println();

        List<String>buscaPorArtista = new LinkedList<>(); //
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Bob Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        System.out.println();

        Collections.sort(buscaPorArtista);// Lista ordenada por ordem alfabética implementando Comparable ao Titulo
        System.out.println("Depois da Ordenação -- Usando o Collections.sort - Ordem afabética");
        System.out.println(buscaPorArtista);
        System.out.println();

        //Lista de títulos ordenadas com CompareTo
        System.out.println("Lista de Títulos Ordenados com o == ComparatorTo ==");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println();

        //Ordenando a lista por ano com sort e Comparator.comparing()
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));// Vai pegar o ano de lançamento de cada título
        System.out.println("Ordenando Por Ano com o == Comparator.comparing()");
        System.out.println(lista);
    }
}
