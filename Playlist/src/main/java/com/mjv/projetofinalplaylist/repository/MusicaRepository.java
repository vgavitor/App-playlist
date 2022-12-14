package com.mjv.projetofinalplaylist.repository;

import com.mjv.projetofinalplaylist.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Integer> {
}
