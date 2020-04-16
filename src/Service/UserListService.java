package Service;

import Model.Song;

public interface UserListService {
    public void displayUserList();

    public void changeName(String name);

    public void changeUserName(String userName);

    public void changePassword(String password);

    public void changeId(int newId);

    public void changeGender(String gender);

    public void changeEmail(String email);

    public void changeAccess(boolean status);

    public void addSongToFavoriteList(Song song);

    public void deleteFavoriteSongById(int idSong);

    public void displayFavoriteList();
};

