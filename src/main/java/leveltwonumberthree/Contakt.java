package leveltwonumberthree;

import java.util.*;

public class Contakt {

    private Map<String, String> contact;
    Contakt() {
        contact = new HashMap<String, String>();
    }
    public void add(String number, String name) {
        contact.put(number, name);
    }
    public void get(String name){
        if(contact.containsValue(name)) {
            Set<Map.Entry<String, String>> set = contact.entrySet();
            for (Map.Entry<String, String> entry : set) {
                if(entry.getValue().equals(name)) {
                    System.out.println(entry.getValue() + " : " + entry.getKey());
                }
            }
        } else {
            System.out.println("Контакт не найденю");
        }
    }
}
