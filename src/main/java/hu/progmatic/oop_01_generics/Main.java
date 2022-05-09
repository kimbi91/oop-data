package hu.progmatic.oop_01_generics;

public class Main {
    public static void main(String[] args) {
        Document document = new Document(1, "Gyűrűk Ura");
        Document document2 = new Document(2, "Harry Potter");
        ChangeTracker favoriteBook = new ChangeTracker();
        favoriteBook.addVersion(document);
        favoriteBook.addVersion(document);
        favoriteBook.addVersion(document2);
        favoriteBook.addVersion(document);

        System.out.println(favoriteBook.getChanges());
        System.out.println(favoriteBook.getLastVersion());

        OperatingSystem os1 = new OperatingSystem(1,"Windows");
        OperatingSystem os2 = new OperatingSystem(2, "Linux");
        ChangeTracker favoriteOS = new ChangeTracker();
        favoriteOS.addVersion(os1);
        favoriteOS.addVersion(os1);
        favoriteOS.addVersion(os2);
        favoriteOS.addVersion(os2);

        System.out.println(favoriteOS.getChanges());
        System.out.println(favoriteOS.getLastVersion());

        OperatingSystem lastFavorite = (OperatingSystem) favoriteOS.getLastVersion();
        lastFavorite.setName(lastFavorite.getName() + " 2.0");
        System.out.println(lastFavorite);
    }
}
