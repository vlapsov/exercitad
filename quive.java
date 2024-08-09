public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = j * i;
                String formatted = String.format("%02d x %02d = %02d", j, i, result);
                System.out.println(formatted);
            }
        }
    }
}
