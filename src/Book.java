public class Book {
    String title;
    int yearPublishing;

    public Book(String title, int yearPublishing) {
        this.yearPublishing = yearPublishing;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

}