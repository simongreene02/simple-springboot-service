package com.greatworksinc.springboot.controller;

import com.greatworksinc.springboot.model.Song;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/song")
public class SongController {
  @GetMapping
  public List<Song> findAllSongs() {
    return List.of(Song.builder().id(1l).name("AAA").length(60).stars(4).build());
  }

  @PostMapping
  public Song createSong(@RequestBody Song song) {
    return song.toBuilder().id(3l).build();
  }
}
