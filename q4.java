// importin libs 
import java.util.ArrayList;
import java.util.Collections; 

// song class 
class Song {
    // properties 
    String title, artist, genre;
    int duration;
    // constructor
    public Song(String title, String artist, String genre, int duration) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }
    // some getters funs 
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String getGenre() {
        return genre;
    }
    public int getDuration() {
        return duration;
    }
}
// class musicplayer ( another )
class MusicPlayer {
    //pro perties 
    ArrayList<Song> playlist;
    // con structor
    public MusicPlayer() {
        this.playlist = new ArrayList<>();
    }
    /// add method or fun whatever ya call
    public void addSong(Song song) {
        if (!playlist.contains(song)) {
            playlist.add(song);
            System.out.println("Song '" + song.getTitle() + "' added to the playlist.");
        } else {
            System.out.println("Song '" + song.getTitle() + "' already exists in the playlist.");
        }
    }
    // remove fun or method 
    public void removeSong(String title) {
        boolean removed = false;
        for (Song song : playlist) {
            if (song.getTitle().equals(title)) {
                playlist.remove(song);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Song '" + title + "' removed from the playlist.");
        } else {
            System.out.println("Song '" + title + "' not found in the playlist.");
        }
    }
    // shufflin fun or method ( whatever ya call )
    public void shuffle() {
        Collections.shuffle(playlist);
        System.out.println("Playlist shuffled.");
    }
    // prinrin method 
    public void printPlaylist() {
        System.out.println("Playlist:");
        for (Song song : playlist) {
            System.out.println("Title: " + song.getTitle() + " | Artist: " + song.getArtist()
                    + " | Duration: " + song.getDuration() + " seconds");
        }
    }
}
// main class 
public class q4 {
    // main function 
    public static void main(String[] args) {
        // creating some songs and adding to playlist 
        Song song1 = new Song("Song 1", "Artist A", "Pop", 240);
        Song song2 = new Song("Song 2", "Artist B", "Rock", 200);
        Song song3 = new Song("Song 3", "Artist C", "Pop", 180);
        MusicPlayer player = new MusicPlayer();
        player.addSong(song1);
        player.addSong(song2);
        player.addSong(song3);
        player.printPlaylist();
        player.shuffle();
        player.printPlaylist();
        player.removeSong("Song 2");
        player.printPlaylist();
    }
}
