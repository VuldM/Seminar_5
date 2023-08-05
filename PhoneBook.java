// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook{
    public static void main(String[] args) {
        Map<String, LinkedList<String>> phoneDirect = new HashMap<>();
        addPhone("Косолапов", "8912123456", phoneDirect);
        addPhone("Корычев", "8908325641", phoneDirect);
        addPhone("Оплеснин", "8922546213", phoneDirect);
        addPhone("Ципелев", "8904562134", phoneDirect);
        addPhone("Косолапов", "8956231524", phoneDirect);
        addPhone("Оплеснин", "8904562315", phoneDirect);
        addPhone("Ципелев", "8650213548", phoneDirect);
        addPhone("Красильников", "8904455426", phoneDirect);
        addPhone("Косолапов", "8956254236", phoneDirect);
        addPhone("Оплеснин", "890458542", phoneDirect);
        addPhone("Ципелев", "8650216523", phoneDirect);
        addPhone("Косолапов", "8854123652", phoneDirect);
        addPhone("Красильников", "8904452365", phoneDirect);
        printPhoneDirect(phoneDirect);
    }

    public static void addPhone(String key, String value, Map<String, LinkedList<String>> dict){
        LinkedList<String> list = new LinkedList<>();
        if (dict.containsKey(key)) {
            dict.get(key).add(value);

        } else {
            list.add(value);
            dict.put(key, list);

        }

    }
    public static void printPhoneDirect(Map<String, LinkedList<String>> dict){
        for (var item : dict.entrySet()) {
            String nums = "";
            for(var el: item.getValue()){
                nums = nums + el + ", ";
            }
            System.out.printf(""+item.getKey()+": " +nums+"\n");
        }
    }

}
