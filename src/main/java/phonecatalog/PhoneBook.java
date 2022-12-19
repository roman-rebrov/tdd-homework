package phonecatalog;

import java.util.Map;
import java.util.TreeMap;

class PhoneBook {

    private Map<String, Long> subscriberCatalog = new TreeMap<>();
    private Map<Long, String> numberCatalog = new TreeMap<>();

    public boolean add(long number, String name) {
        if (number > 99999999999L || numberCatalog.containsKey(number)){
            return false;
        }

        this.numberCatalog.put(number, name);
        this.subscriberCatalog.put(name, number);

        return true;
    }
}
