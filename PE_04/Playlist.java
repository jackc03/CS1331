import java.util.Scanner;
public class Playlist {
    private static int countOfCalls = 0;
    /*int numSongs;
    String playlistName;
    */


    public static void addPlaylistInfo(Scanner scn) {
        System.out.print("Enter number of songs in playlist: ");
        int numSongs = scn.nextInt();
        String uselessVar = scn.nextLine();
        System.out.print("Enter a playlist name: ");
        String playlistName = scn.nextLine();


        System.out.printf("Playlist created successfully. Here are the Details:\nNumber of Songs: %d\nName: %s\n", numSongs, playlistName);

    }

    public static int[] genreTally(String[] genreArray, String[] genres) {
        ++countOfCalls;
        //System.out.println("count called = " + countOfCalls);

        int[] genreCount = new int[genres.length]; //values of this array correspond to count of genre from genres[] with same index
        System.out.println("The following types of genres are in your playlist: ");
        for (int i = 0; i < genres.length; ++i) {
            //System.out.println(i);
            for (int j = 0; j < genreArray.length; ++j) {
               //System.out.println(j);

                if (genres[i].compareTo(genreArray[j]) == 0) {
                    ++genreCount[i];
                }
            }
            System.out.println(genres[i] + " " + genreCount[i]);
        }
        return genreCount;
    }

    public static void playlistScores(String[] playlist1, String[] playlist2, String[] genres) {
        int[] p1PopularityArr = genreTally(playlist1, genres);
        int p1FinalPopularity = 0;
        for (int i = 0; i < genres.length; ++i) {
            p1FinalPopularity += p1PopularityArr[i] * i;
        }

        int[] p2PopularityArr = genreTally(playlist2, genres);
        int p2FinalPopularity = 0;
        for (int i = 0; i < genres.length; ++i) {
            p2FinalPopularity += p2PopularityArr[i] * i;
        }

        if (p1FinalPopularity > p2FinalPopularity) {
            System.out.println("The first playlist is more likely to have more listeners than the second.");
        } else if (p1FinalPopularity < p2FinalPopularity) {
            System.out.println("The second playlist is more likely to have more listeners than the first.");
        } else if (p1FinalPopularity == p2FinalPopularity) {
            System.out.println("The two playlists are predicted to perform equally well.");
        }
    }

    public static void main(String[] args) {
        String[] genres = {"Rap", "Pop", "Classical", "Hip Hop", "Rock", "Lo Fi"};
        String[] playlist  = new String[7];
        String[] playlist2 = new String[7];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            playlist[i]  = genres[(int) Math.floor(Math.random() * 6)];
            playlist2[i] = genres[(int) Math.floor(Math.random() * 6)];
        }

        addPlaylistInfo(scan);
        playlistScores(playlist, playlist2, genres);
    }

}
