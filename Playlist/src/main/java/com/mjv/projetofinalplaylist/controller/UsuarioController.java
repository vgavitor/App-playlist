package com.mjv.projetofinalplaylist.controller;

import com.mjv.projetofinalplaylist.model.Usuario;
import com.mjv.projetofinalplaylist.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //é uma especialização da anotação @Controller, simplesmente retorna o objeto e os dados do objeto são gravados diretamente na resposta HTTP como JSON.
@RequestMapping("/usuario")//é a anotação utilizada tradicionalmente para implementar URL handler, ela suporta os métodos Post, Get, Put, Delete e Pacth. "Toda vez que alguem quiser algo de usuarios, vai ter funcionalidades desse usuario
public class UsuarioController {

    @Autowired //fornece controle sobre onde e como a ligação entre os beans deve ser realizada. Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários e ou vários argumentos.
    private UsuarioRepository repository;

    @PostMapping //vai receber requisições post direcionada a esse usuario. É uma maneira mais simples de implementar URL handler da anotação @RequestMapping
    public void gravar(@RequestBody Usuario usuario) { //a anotaçãos serve para enviar e receber informaçõesda API
        repository.save(usuario);
    }

    @GetMapping//vai pegar requisicoes do usuario
    public List<Usuario> listar(){
        return repository.findAll();
    }

    @DeleteMapping //vai deletar, quando solicitado, requisicoes desse usuario
    public void removerUsuario(Integer idUsuario) {
        repository.deleteById(idUsuario);
    }
}
