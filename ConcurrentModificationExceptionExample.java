public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));

        for (String item : list) {
            if (item.equals("b")) {
                list.remove(item);
            }
        }
        System.out.println(list); // ConcurrentModificationException
    }
}