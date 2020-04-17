package Service;

import Model.Song;

public interface MusicListService {

    public void uploadSong(Song Song);

    public void findSongWithId(int id);

    public void changeInfoSongById(int idSong, String nameSong, String author, String singer, String modelYear, String category, int view);

    public void deleteSong(int idSong);

    public void sortByName();

    public void sortByView();
}
