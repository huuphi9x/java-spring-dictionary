package service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService {
    private static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
    }

    public String getValue(String word) {
        return dictionary.get(word);
    }

}
