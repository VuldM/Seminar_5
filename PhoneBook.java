
import java.util.LinkedList;
import java.util.Comparator;
//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class PhoneBook{
    public static void main(String[] args) {
        Map<String, LinkedList<Integer>> phoneDirect = new TreeMap<>(Comparator.reverseOrder());
        addPhone("Косолапов", 891212345, phoneDirect);
        addPhone("Корычев", 890832564, phoneDirect);
        addPhone("Оплеснин", 892254621, phoneDirect);
        addPhone("Ципелев", 890456213, phoneDirect);
        addPhone("Косолапов", 895623152, phoneDirect);
        addPhone("Оплеснин", 890456231, phoneDirect);
        addPhone("Ципелев", 865021354, phoneDirect);
        addPhone("Красильников", 890445426, phoneDirect);
        addPhone("Оплеснин", 89045852, phoneDirect);
        addPhone("Ципелев", 865021653, phoneDirect);
        addPhone("Красильников", 890442365, phoneDirect);
        printPhoneDirect(phoneDirect);
    }

    public static void addPhone(String key, Integer value, Map<String, LinkedList<Integer>> dict){
        LinkedList<Integer> list = new LinkedList<>();
        if (dict.containsKey(key)) {
            dict.get(key).add(value);

        } else {
            list.add(value);
            dict.put(key, list);

        }

    }
    public static void printPhoneDirect(Map<String, LinkedList<Integer>> dict){
        for (var item : dict.entrySet()) {
            String nums = "";
            for(var el: item.getValue()){
                nums = nums + el + ", ";
            }
            System.out.printf(""+item.getKey()+": " +nums+"\n");
        }
    }

}
