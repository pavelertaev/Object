import javax.print.attribute.standard.MediaSize;

public class Authors {
    private String authorsName;

    Authors(String authorsName) {
        this.authorsName = authorsName;
    }

    public String toString() {
        return "Имя автора " + this.authorsName;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Authors author1 = (Authors) other;
        return authorsName.equals(author1.authorsName);
    }
    public int hashCode() {
        return java.util.Objects.hash(authorsName);
    }

    String getAuthorsName() {
        return authorsName;
    }

}
