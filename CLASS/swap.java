package CLASS;

public class swap {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        // Swap the values of a and b
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    public static void swap(Integer a, Integer b) {
        // Swap logic using a temporary variable
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
    }
}
