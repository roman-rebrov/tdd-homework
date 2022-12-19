package phonecatalog;

public class PhoneCatalogService {

    public void start() {
        PhoneBook book  = new PhoneBook();
        book.add(1L, "c");
        book.add(2L, "b");
        book.add(3L, "a");

        System.out.println(book.findByName("b"));
        System.out.println(book.findByNumber(3L));
        System.out.println(book.printAllNames());
    }
}
