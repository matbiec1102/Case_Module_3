package Service;

import Model.Song;
import Model.UserAccount;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserListServiceImpl implements UserListService {
    private String userSql = "root";
    private String passSql = "abc@123";
    private String jdbcUrl = "jdbcUrl:mysql://localhost:3306/musicProject";
    private String getAllUser = "select * from User_List";
    private String findUserWithId = "select * from User_list where id = ? ";

    @Override
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, userSql, passSql);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    @Override
    public List<UserAccount> findAllUser() {
        List<UserAccount> userList = new ArrayList<>();
        try (
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(getAllUser);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String userName = resultSet.getString("UserName");
                String password = resultSet.getString("PassWord");
                String name = resultSet.getString("Name");
                String gender = resultSet.getString("Gender");
                String email = resultSet.getString("Email");
                boolean accessAdmin = resultSet.getBoolean("Access_admin");
                UserAccount user = new UserAccount(id, userName, password, name, gender, email, accessAdmin);
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public UserAccount findUserById(int id) {
        UserAccount user = null;
        try (
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(findUserWithId);
        ) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String userName = resultSet.getString("UserName");
                String password = resultSet.getString("PassWord");
                String name = resultSet.getString("Name");
                String gender = resultSet.getString("Gender");
                String email = resultSet.getString("Email");
                boolean accessAdmin = resultSet.getBoolean("Access_admin");
                user = new UserAccount(id, userName, password, name, gender, email, accessAdmin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void changeInfoUser(int idUser) {

    }


    @Override
    public void addSongToFavoriteList(Song song) {

    }

    @Override
    public void deleteFavoriteSongById(int idSong) {

    }

}
