public class Book implements Comparable<Book> {
    int numberOfPages;
    String title;
    String author;

    public int compareTo(Book specifiedBook) {
        // First check the page count is different
        if (this.numberOfPages != specifiedBook.numberOfPages) {
            // this will return a negative value if this < specified but will return a positive value if this > specified
            return this.numberOfPages - specifiedBook.numberOfPages;
        }

        // If page counts are identical then check if the titles are different
        if (!this.title.equals(specifiedBook.title)) {
            return this.title.compareTo(specifiedBook.title);
        }

        // If page titles are also identical then return the comparison of the authors
        return this.author.compareTo(specifiedBook.author);
    }
}
