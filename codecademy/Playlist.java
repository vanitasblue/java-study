package codecademy;

import java.util.ArrayList;

// Desert Island Playlist
public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("17");
        desertIslandPlaylist.add("ain't afraid to die");
        desertIslandPlaylist.add("LOTUS");
        desertIslandPlaylist.add("Dead Tree");
        desertIslandPlaylist.add("Dead Star");
        desertIslandPlaylist.add("Cassis");
        desertIslandPlaylist.add("RAD");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove("RAD");
        desertIslandPlaylist.remove(1);

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        int indexOfSongA = desertIslandPlaylist.indexOf("17");
        int indexOfSongB = desertIslandPlaylist.indexOf("Dead Star");

        String valueOfSongA = desertIslandPlaylist.get(indexOfSongA);
        String valueOfSongB = desertIslandPlaylist.get(indexOfSongB);

        desertIslandPlaylist.set(indexOfSongA, valueOfSongB);
        desertIslandPlaylist.set(indexOfSongB, valueOfSongA);

        System.out.println(desertIslandPlaylist);
    }
}
