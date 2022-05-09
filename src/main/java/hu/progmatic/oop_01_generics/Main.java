package hu.progmatic;

public class Main {
    public static void main(String[] args) {
        Document document = new Document(1, "Gyűrű Ura");
        Document document2 = new Document(2, "Harry Potter");
        ChangeTracker favoriteBook = new ChangeTracker();
        favoriteBook.addVersion(document);
        favoriteBook.addVersion(document);
        favoriteBook.addVersion(document2);
        favoriteBook.addVersion(document);

        System.out.println(favoriteBook.getChanges());
        System.out.println(favoriteBook.getLastVersion());
    }
}
