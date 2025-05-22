package io.studyobject.example.playlist;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Playlist {
    private List<Song> tracks = new ArrayList<>();

    public void append(Song song) {
        getTracks().add(song);
    }
}
