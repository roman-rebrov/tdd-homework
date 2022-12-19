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

}
