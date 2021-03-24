package leveltwonumberthree;
/*1)Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

2)Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
 номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
(в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны. Желательно
не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
 через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("two");
        words.add("one");
        words.add("three");
        words.add("one");
        words.add("one");
        words.add("two");
        words.add("five");
        words.add("one");
        words.add("one");
        words.add("three");
        words.add("five");
        words.add("one");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Integer count;
        for(String i : words){
            count = map.get(i);пп
            map.put( i, count == null ? 1 : count + 1);
        }
        System.out.println(map);


        Contakt contakt = new Contakt();

        contakt.add("8-495-555-55-55", "Lavrov");
        contakt.add("8-495-666-66-66", "Navalnyi");
        contakt.add("8-495-777-77-77", "Medvedev");
        contakt.add("(8442) 43-00-43", "Navalnyi");
        contakt.get("Navalnyi");
    }
}
