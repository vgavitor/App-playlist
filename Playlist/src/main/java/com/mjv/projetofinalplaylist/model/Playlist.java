package com.mjv.projetofinalplaylist.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "playlist")

public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlaylist;

    @Column(length = 20)
    private String nomePlaylist;

    @OneToMany(cascade = CascadeType.ALL) //mostrando ao jpa o relacionamento entre entidades, nesse caso, um parA MUITOS
    @JoinColumn(name = "playlist_id")
    private List<Musica> musicas;

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public Integer getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(Integer idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }
}
