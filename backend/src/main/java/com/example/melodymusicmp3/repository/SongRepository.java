package com.example.melodymusicmp3.repository;
import com.example.melodymusicmp3.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
