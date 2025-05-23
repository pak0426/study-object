package io.studyobject.example.playlist;

public class PersonPlaylist extends Playlist {
    public void remove(Song song) {
        getTracks().remove(song);
    }
}
