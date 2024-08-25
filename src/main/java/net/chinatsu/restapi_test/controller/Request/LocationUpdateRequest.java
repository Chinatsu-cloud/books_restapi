package net.chinatsu.restapi_test.controller.Request;

public class LocationUpdateRequest {
    private int ID;
    private String Title;
    private String Category;
    private String Author;
    private int PublicationYear;
    private String Location;

    public LocationUpdateRequest(int ID, String title, String category, String author, int publicationYear, String location) {
        this.ID = ID;
        Title = title;
        Category = category;
        Author = author;
        PublicationYear = publicationYear;
        Location = location;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public String getLocation() {
        return Location;
    }
}
