import java.util.ArrayList;
import java.util.HashMap;

// Define the Song class with attributes for title, artist, genre, and ratings
class Song {
    private String title, artist, genre;
    private int ratings;

    // Constructor to initialize a Song object
    public Song(String title, String artist, String genre, int ratings) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.ratings = ratings;
    }

    // Getter methods to access private fields
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getRatings() {
        return ratings;
    }

    // Setter method to modify the ratings
    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}

// Define the MusicRecommender class that utilizes an array of Song objects
class MusicRecommender {
    private ArrayList<Song> songs;

    // Constructor to initialize MusicRecommender with a list of songs
    public MusicRecommender(ArrayList<Song> songs) {
        this.songs = songs;
    }

    // Functionality to analyze user ratings and identify user preferences
    public void analyzeUserPreferences() {
        HashMap<String, Integer> genreCount = new HashMap<>();
        for (Song song : songs) {
            genreCount.put(song.getGenre(), genreCount.getOrDefault(song.getGenre(), 0) + song.getRatings());
        }

        // Find the favorite genre based on ratings
        String favoriteGenre = null;
        int maxRatings = 0;
        for (String genre : genreCount.keySet()) {
            if (genreCount.get(genre) > maxRatings) {
                maxRatings = genreCount.get(genre);
                favoriteGenre = genre;
            }
        }
        System.out.println("Favorite Genre: " + favoriteGenre);
    }

    // Functionality to recommend songs based on user preferences
    public void recommendSongs() {
        System.out.println("Recommended Songs:");
        for (Song song : songs) {
            if (song.getRatings() >= 4) { // Recommend songs with ratings 4 or higher
                System.out.println(song.getTitle() + " by " + song.getArtist());
            }
        }
    }

    // Functionality to allow users to provide feedback on recommendations
    public void provideFeedback(String songTitle, int newRating) {
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                song.setRatings(newRating);
                System.out.println("Updated rating for " + songTitle + ": " + newRating);
                break;
            }
        }
    }

    // Integrate basic collaborative filtering techniques to recommend songs
    public void collaborativeFiltering() {
        // Simple example: recommend songs by the same artist as the highest-rated song
        Song topRatedSong = null;
        for (Song song : songs) {
            if (topRatedSong == null || song.getRatings() > topRatedSong.getRatings()) {
                topRatedSong = song;
            }
        }

        if (topRatedSong != null) {
            System.out.println("Songs by " + topRatedSong.getArtist() + ":");
            for (Song song : songs) {
                if (song.getArtist().equals(topRatedSong.getArtist()) && !song.equals(topRatedSong)) {
                    System.out.println(song.getTitle());
                }
            }
        }
    }
}

// Main class to test the functionality
public class q10 {
    public static void main(String[] args) {
        // Create some Song objects
        Song song1 = new Song("Song 1", "Artist 1", "Pop", 5);
        Song song2 = new Song("Song 2", "Artist 2", "Rock", 4);
        Song song3 = new Song("Song 3", "Artist 1", "Pop", 3);

        // Add the songs to a list
        ArrayList<Song> songList = new ArrayList<>();
        songList.add(song1);
        songList.add(song2);
        songList.add(song3);

        // Initialize the MusicRecommender with the list of songs
        MusicRecommender recommender = new MusicRecommender(songList);

        // Analyze user preferences
        recommender.analyzeUserPreferences();

        // Recommend songs
        recommender.recommendSongs();

        // Provide feedback
        recommender.provideFeedback("Song 1", 4);

        // Perform collaborative filtering
        recommender.collaborativeFiltering();
    }
}
