import java.util.HashMap;
import java.util.Map;

class HashMapDemo {
  public static void main(String[] args) {
    // Creating hashmap
    Map<String, String> langMap = new HashMap<>();    
    // Strong (key, value) pair to HashMap
    langMap.put("ENG", "English");
    langMap.put("NLD", "Dutch");
    langMap.put("ZHO", "Chinese");
    langMap.put("BEN", "Bengali");
    langMap.put("ZUL", "Zulu");
    // Retrieving value using key
    String language = langMap.get("BEN");
    System.out.println("Language- " + language);

    // Iterating using "entrySet" method
    for (Map.Entry<String, String> lang : langMap.entrySet()) {
      System.out.println("Key- " + lang.getKey() + " Vaue- " + lang.getValue());
    }

    /*
     * Output: 
     *  Language- Bengali 
     *  -- Map Elements -- 
     *  Key- ZHO Value- Chinese 
     *  Key- ZUL Value- Zulu 
     *  Key- NLD Value- Dutch 
     *  Key- BEN Value- Bengali 
     *  Key- ENG Value- English
     */
  }
}