package com.mjv.projetofinalplaylist.model;

import javax.persistence.*;

@Entity
@Table(name = "musica")

public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMusica;

    @Column(length = 20)
    private String Titulo;

    private Double Duração;

    @Column(length = 40)
    private String Autores;

    @Enumerated(EnumType.STRING) //salvando o proprio valor literal, se o generoMusical for Pop, vai ter uma coluna do tipo genero e vai salvar pop
    private GeneroMusical genero;

    public Integer getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Integer idMusica) {
        this.idMusica = idMusica;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Double getDuração() {
        return Duração;
    }

    public void setDuração(Double duração) {
        Duração = duração;
    }

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String autores) {
        Autores = autores;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }
}
