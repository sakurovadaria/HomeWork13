import java.util.Objects;

public class Book {
    private String nameBooks;
    private int agePublication;
    private Author author;


    public Book(String nameBooks, Author author, int agePublication) {

        this.nameBooks = nameBooks;
        this.agePublication = agePublication;
        this.author = author;
    }


    public int getAgePublication() {
        return this.agePublication;
    }

    public String getNameBook() {
        return this.nameBooks;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAgePublication(int agePublication) {
        this.agePublication = agePublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return agePublication == book.agePublication && Objects.equals(nameBooks, book.nameBooks) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(agePublication, nameBooks, author);
    }

    @Override
    public String toString() {
        return "Название книги - " + getNameBook() + "\n" + getAuthor() + "\nГод публикации книги - " + getAgePublication();
    }
}


