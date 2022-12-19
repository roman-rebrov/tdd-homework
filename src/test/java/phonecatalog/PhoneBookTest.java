package phonecatalog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    @DisplayName("Test for adding subscriber to catalog")
    public void addTest() {
        final PhoneBook book = new PhoneBook();

        Assertions.assertEquals(true,  book.add(79215554849L, "Roman"), "Тест не проходит");
        Assertions.assertNotNull(book.add(79215554849L, "Roman"));
    }

}
