public class Book {
    String title;
    int yearPublishing;
    String authors ;

    Book(String title, int yearPublishing , String authors) {
        this.yearPublishing = yearPublishing;
        this.title = title;
    }

    public String getTitle() {

        return title;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public String getAuthors() {
        return authors;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

}