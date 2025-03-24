//2.31
public class SquaresAndCubes {
    public static void main(String[] args) {
        System.out.printf("%-5s %-8s %-8s%n", "Num", "Square", "Cube");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%-5d %-8d %-8d%n", i, i * i, i * i * i);
        }
    }
}
