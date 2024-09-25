class Song {
    String title;
    Song prev;
    Song next;

    Song(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}

class PlayList {
    private Song firstSongOfPlaylist = null;
    private Song LastSongOfPlaylist = null;

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (firstSongOfPlaylist == null) {
            firstSongOfPlaylist = LastSongOfPlaylist = newSong;
            firstSongOfPlaylist.next = firstSongOfPlaylist;
            firstSongOfPlaylist.prev = firstSongOfPlaylist;
        } else {
            LastSongOfPlaylist.next = newSong;
            newSong.prev = LastSongOfPlaylist;
            newSong.next = firstSongOfPlaylist;
            firstSongOfPlaylist.prev = newSong;
            LastSongOfPlaylist = newSong;
        }
    }

    public void deleteSong(String title) {
        if (firstSongOfPlaylist.title == title) {
            if (firstSongOfPlaylist == LastSongOfPlaylist) {
                firstSongOfPlaylist = LastSongOfPlaylist = null;
            } else {
                firstSongOfPlaylist = firstSongOfPlaylist.next;
                firstSongOfPlaylist.prev = LastSongOfPlaylist;
                LastSongOfPlaylist.next = firstSongOfPlaylist;
            }
            return;
        } else if (LastSongOfPlaylist.title == title) {
            LastSongOfPlaylist = LastSongOfPlaylist.prev;
            LastSongOfPlaylist.next = firstSongOfPlaylist;
            firstSongOfPlaylist.prev = LastSongOfPlaylist;
            return;
        }
        Song temp = firstSongOfPlaylist;
        while (temp.next != firstSongOfPlaylist) {
            if (temp.title.equals(title)) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    public void display() {
        if (firstSongOfPlaylist == null)
            return;
        Song temp = firstSongOfPlaylist;
        while (temp.next != firstSongOfPlaylist) {
            System.out.println(temp.title + " ");
            temp = temp.next;
        }
        System.out.print(temp.title + " ");
        System.out.println();
    }

    public int getPlayListSize() {
        if (firstSongOfPlaylist == null)
            return 0;
        else if (firstSongOfPlaylist == LastSongOfPlaylist)
            return 1;
        else {
            Song temp = firstSongOfPlaylist;
            int count = 0;
            do {
                count++;
                temp = temp.next;
            } while (temp != firstSongOfPlaylist);
            return count;
        }
    }

    public void shufflePlayList() {
        int n = getPlayListSize();
        if (n <= 1)
            return;
        Song[] songArr = new Song[n];
        Song temp = firstSongOfPlaylist;
        for (int i = 0; i < n; i++) {
            songArr[i] = temp;
            temp = temp.next;
        }
        for (int i = n - 1; i > 0; i--) {
            int k = (int) (Math.random() * (i + 1));
            Song songTemp = songArr[k];
            songArr[k] = songArr[i];
            songArr[i] = songTemp;
        }

        firstSongOfPlaylist = songArr[0];
        LastSongOfPlaylist = songArr[n - 1];
        LastSongOfPlaylist.next = firstSongOfPlaylist;
        firstSongOfPlaylist.prev = LastSongOfPlaylist;
        for (int i = 0; i < n; i++) {
            songArr[i].next = songArr[(i + 1) % n];
           
            songArr[i].prev = songArr[(i - 1 + n) % n];
           
        }
    }
}
public class L13B3 {
    public static void main(String[] args) {
        PlayList playList = new PlayList();

        playList.addSong("Song 1");
        playList.addSong("Song 2");
        playList.addSong("Song 3");
        playList.addSong("Song 4");
        
        System.out.println("Playlist before shuffle:");
        playList.display();
        
        playList.shufflePlayList();
        
        System.out.println("Playlist after shuffle:");
        playList.display();
        
        playList.deleteSong("Song 2");
        
        System.out.println("Playlist after deleting 'Song 2':");
        playList.display();
    }
}