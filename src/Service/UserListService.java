package Service;

import Model.Song;
import Model.UserAccount;

import java.sql.Connection;
import java.util.List;

public interface UserListService {
    public Connection getConnection();

    public List<UserAccount> findAllUser();

    public UserAccount findUserById(int id);

    public void changeInfoUser(int idUser);

    public void addSongToFavoriteList(Song song);

    public void deleteFavoriteSongById(int idSong);
};

