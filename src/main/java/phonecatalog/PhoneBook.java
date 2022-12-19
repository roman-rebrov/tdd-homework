package phonecatalog;

import java.util.Map;
import java.util.Set;
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

    public String findByNumber(long number) {
        if (this.numberCatalog.containsKey(number)){
            return this.numberCatalog.get(number);
        }
        return null;
    }

    public long findByName(String name) {
        if (subscriberCatalog.containsKey(name)){
            return subscriberCatalog.get(name);
        }
        return -1;
    }

    public String printAllNames() {
        return null;
    }
}
