package com.mjv.projetofinalplaylist.repository;

import com.mjv.projetofinalplaylist.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//o spring tem uma classe chamada jpa repositoria que precisa da classe que a gente quer usar + o id dela para
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
