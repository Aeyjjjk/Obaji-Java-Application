//2.27

public class Checkerboard {
    public static void main(String[] args) {
        int rows = 8;
        int cols = 18;
        for (int i = 0; i < rows; i++) {
            // For every row, determine whether to start with a star or space.
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("~");
                } else {
                    System.out.print("¬");
                }
            }
            System.out.println();
        }
    }
}
