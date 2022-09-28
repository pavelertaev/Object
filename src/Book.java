public class Book {
     private String title;
    private int yearPublishing;
     private String authors ;

    Book(String title, int yearPublishing , String authors) {
        this.yearPublishing = yearPublishing;
        this.title = title;
        this.authors = authors;
    }
    public String toString(){
        return "Название " + this.title + " год публикации " + this.yearPublishing + " автор " + this.authors;
    }
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book book1 = (Book) other;
        return title.equals(book1.title);
    }
    public int hashCode() {
        return java.util.Objects.hash(title,yearPublishing,authors);
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