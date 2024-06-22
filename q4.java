//4. Music Playlist Organizer:

//o Create a class named Song with attributes for title, artist, genre, and duration (in
//seconds).
class Song {
    String title , artist , genre ;
    int duration ;

    //constuct 
    public Song (String title , String artist , String genre , int duration ){
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.genre = genre;


    }
    //maybe get funcs 

}


//o Design a class named MusicPlayer that maintains a playlist using an array of
//Song objects.

class MusicPlayer {
    static private Song [] playlist ;

    // contrsuct ? 
    public MusicPlayer(Song [] playlist  ){
        this.playlist = playlist;
    }
 

   // Add a song to the playlist, avoiding duplicates.
   public static void add_song (Song s ){
    for (int i = 0 ; i < playlist.length ; i++){
        if ( s.title != playlist[i].title){
            // how to add song ?? 
        }

    }
   }
   // Remove a song by title.
   public static void remove_song (Song s ){
    for (int i = 0 ; i < playlist.length ; i++){
        if ( s.title == playlist[i].title){
            // how to remove song ?? 
        }

    }
   }
   // Shuffle the playlist (randomly reorder songs).
   public static void shuffle (){
    for ( int i = 0 ; i < playlist.length; i++){
        int ran = 0 ; // have to do somethin so it generate a random bw 0 to range pf songs in plylst


    }
   }
     // Create playlists based on genre and add relevant songs from the main
   //playlist. 
   // Print the playlist with song titles, artists, and durations. (Bonus: Simulate
   //basic playback using system commands if possible)

   /// *** tired and bored *** 🥲
}

public class q4 {

    
}
