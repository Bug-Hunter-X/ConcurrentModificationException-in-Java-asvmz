import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("b")) {
                iterator.remove();
            }
        }
        System.out.println(list); // Output: [a, c]
    }
}