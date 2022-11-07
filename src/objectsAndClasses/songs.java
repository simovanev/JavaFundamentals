package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {
    static class Song {
        private String album;
        private String name;
        private String time;

        public String getAlbum() {
            return this.album;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }

        public Song(String album, String name, String time) {
            this.album = album;
            this.name = name;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> currentList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String[] songArr = scanner.nextLine().split("_");
            Song song = new Song(songArr[0], songArr[1], songArr[2]);
            currentList.add(song);

        }
        String albumName= scanner.nextLine();
        if (albumName.equals("all")){
            for (Song item: currentList){
                System.out.println(item.getName());
            }

        }else for (Song item:currentList){
            if (albumName.equals(item.getAlbum())){
                System.out.println(item.getName());
            }
        }
    }
}
