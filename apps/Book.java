
public enum Book {
    JHTP("Java How To Program", "2012"),
    CHTP("C How To Program", "2007");

    private final String title;
    private final String copyrightYear;

    Book(String bookTitle, String year) {
        title = bookTitle;
        copyrightYear = year;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return copyrightYear;
    }
}
