package phonecatalog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



public class PhoneBookTest {

    @Test
    @DisplayName("Test for adding subscriber to catalog")
    public void addTest() {
        final PhoneBook book = new PhoneBook();

        Assertions.assertEquals(true,  book.add(79215554849L, Mockito.anyString()), "Тест на равенство не проходит");
        Assertions.assertNotNull(book.add(79215554849L, Mockito.anyString()), "Тест на Null не проходит");
    }

    @Test
    @DisplayName("Test for finding subscriber by number")
    public void findByNumberTest() {
        final PhoneBook book = new PhoneBook();
        book.add(79215554849L, Mockito.anyString());

        String result = book.findByNumber(79215554849L);

        Assertions.assertNotNull(result, "Тест на Null не проходит");
        Assertions.assertInstanceOf(String.class, result);
    }

    @Test
    @DisplayName("Test for finding number of subscriber by name")
    public void findByNameTest() {
        final PhoneBook book = new PhoneBook();
        final String name = "Roman";
        final long number = 79215554849L;
        book.add(number, name);

        long result = book.findByName(name);

        Assertions.assertEquals(number, result);
    }

    @Test
    @DisplayName("Test for printing all names")
    public void printAllNamesTest() {
        final PhoneBook book = new PhoneBook();
        book.add(79215554849L, "c");
        book.add(79215554848L, "b");
        book.add(79215554845L, "a");

        final String result = book.printAllNames();


        Assertions.assertNotNull(result, "Тест на Null не проходит");
        Assertions.assertEquals("[a, b, c]", result);
    }

}
