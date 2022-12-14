package com.mjv.projetofinalplaylist.repository;

import com.mjv.projetofinalplaylist.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist,Integer> {
}
