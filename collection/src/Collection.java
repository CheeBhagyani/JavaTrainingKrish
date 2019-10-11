import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Chee");
        arrayList.add("Dasuni");
        arrayList.add("Limesha");
        arrayList.add("Bhagyani");

        System.out.println("before" + arrayList);

        Collections.sort(arrayList);
        System.out.println("after sorting" + arrayList);
    }
}
