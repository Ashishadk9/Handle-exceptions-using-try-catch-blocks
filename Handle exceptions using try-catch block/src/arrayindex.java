public class arrayindex {
    public static void main(String[] args) {
        int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};
        try {
            System.out.println(age[9]); // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: Index 9 is out of range.");
        }
    }
}
