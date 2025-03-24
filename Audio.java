package br.com.alura.minhasmusicas;

public class Audio {

    private String titulo;
    private int duracao;
    private double totalDeReproducoes;
    private double totalCurtidas;
    private int classificacao;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public double getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public double getCurtidas() {
        return totalCurtidas;
    }
    public double getDuracao() {
        return duracao;
    }
    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalDeReproducoes++;
    }
}








