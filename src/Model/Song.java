package Model;

public class Song {
    public int id;
    public String name;
    public String author;
    public String singer;
    public int modelYear;
    public String category;
    public String pathStorage;
    public int view;

    //constructor
    public Song() {
    }

    //Get Set Method
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getYear() {
        return modelYear;
    }

    public void setYear(int year) {
        this.modelYear = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPathStorage() {
        return pathStorage;
    }

    public void setPathStorage(String pathStorage) {
        this.pathStorage = pathStorage;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}
