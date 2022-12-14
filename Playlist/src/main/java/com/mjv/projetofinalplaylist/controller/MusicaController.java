package com.mjv.projetofinalplaylist.controller;

import com.mjv.projetofinalplaylist.model.Musica;
import com.mjv.projetofinalplaylist.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musica")
public class MusicaController {

    @Autowired
    private MusicaRepository repository;

    @PostMapping
    public void gravar(@RequestBody Musica musica) {
        repository.save(musica);
    }

    @GetMapping
    public List<Musica> listar(){
        return repository.findAll();
    }

    @DeleteMapping
    public void removerMusica(Integer idMusica) {
        repository.deleteById(idMusica);
    }

}
