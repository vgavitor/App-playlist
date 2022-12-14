package com.mjv.projetofinalplaylist.controller;

import com.mjv.projetofinalplaylist.model.Playlist;
import com.mjv.projetofinalplaylist.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistRepository repository;

    @PostMapping
    public void gravar(@RequestBody Playlist playlist) {
        repository.save(playlist);
    }

    @GetMapping
    public List<Playlist> listar() {
        return repository.findAll();
    }

    @DeleteMapping
    public void removerPlaylist(Integer idPlaylist) {
        repository.deleteById(idPlaylist);
    }

}
