//2.29
public class CharIntegerValues {
    public static void main(String[] args) {
        char[] characters = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};

        for (char ch : characters) {
            System.out.printf("The character '%c' has the integer value %d%n", ch, (int) ch);
        }
    }
}
