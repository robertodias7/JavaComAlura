package br.com.alura.screenmatch.modelos;

public class Series extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporadas;
    private int minutosPorEpisodio;

    public Series(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporadas() {
        return episodioPorTemporadas;
    }

    public void setEpisodioPorTemporadas(int episodioPorTemporadas) {
        this.episodioPorTemporadas = episodioPorTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTemporadas * minutosPorEpisodio ;
    }

    @Override
    public String toString() {
        return "Série: " +  getNome() + " (Ano de Lançamento: " + getAnoDeLancamento() + ")";
    }
}
