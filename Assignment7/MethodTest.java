public class MethodTest {
    public static <E> void count(E[] inputElements) {
        System.out.println(inputElements.length);
    }

    public static void main(String[] args) {
        String[] stringArray = {"Cat", "Lion", "Treasure", "Seal", "Lazy"};
        count(stringArray);
        Integer[] intArray = {1, 4, 6, 2, 8, 9};
        count(intArray);
        Double[] doubleArray = {4.1, 1.4, 1.26, 1.322, 1.328, 8.53459, 42.2, 234.3};
        count(doubleArray);
    }
}
