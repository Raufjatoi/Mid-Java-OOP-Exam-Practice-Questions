class Song {
    private String title, artist, genre;
    private int duration; 

    public Song(String title, String artist, String genre, int duration) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

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


class MusicPlayer {
    private Song[] playlist; 

    public MusicPlayer(Song[] playlist) {
        this.playlist = playlist;
    }

   
    public void addSong(Song song) {
        for (Song s : playlist) {
            if (s.getTitle().equals(song.getTitle())) {
                System.out.println("Song '" + song.getTitle() + "' already exists in the playlist.");
                return;
            }
        }

        Song[] newPlaylist = new Song[playlist.length + 1];
        System.arraycopy(playlist, 0, newPlaylist, 0, playlist.length);
        newPlaylist[playlist.length] = song;
        playlist = newPlaylist;
        System.out.println("Song '" + song.getTitle() + "' added to the playlist.");
    }

    public void removeSong(String title) {
        boolean found = false;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i].getTitle().equals(title)) {
                System.arraycopy(playlist, i + 1, playlist, i, playlist.length - 1 - i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Song '" + title + "' removed from the playlist.");
        } else {
            System.out.println("Song '" + title + "' not found in the playlist.");
        }
    }


    public void shuffle() {
        for (int i = 0; i < playlist.length; i++) {
            int randomIndex = (int) (Math.random() * playlist.length);
            Song temp = playlist[i];
            playlist[i] = playlist[randomIndex];
            playlist[randomIndex] = temp;
        }
        System.out.println("Playlist shuffled.");
    }


    public void printPlaylist() {
        System.out.println("Playlist:");
        for (Song song : playlist) {
            System.out.println("Title: " + song.getTitle() + " | Artist: " + song.getArtist()
                    + " | Duration: " + song.getDuration() + " seconds");
        }
    }
}


public class q4 {
    public static void main(String[] args) {
        // Creating songs
        Song song1 = new Song("Song 1", "Artist A", "Pop", 240);
        Song song2 = new Song("Song 2", "Artist B", "Rock", 200);
        Song song3 = new Song("Song 3", "Artist C", "Pop", 180);

        // Creating a playlist
        Song[] initialPlaylist = { song1, song2 };

        MusicPlayer player = new MusicPlayer(initialPlaylist);

        player.addSong(song3);
        player.addSong(song1); 

        
        player.printPlaylist();

    
        player.shuffle();
        player.printPlaylist();
        
        player.removeSong("Song 2");
        player.printPlaylist();
    }
}
