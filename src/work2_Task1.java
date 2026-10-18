public class work2_Task1 {
    public static void main(String[] args) {
        for (int x = 0; x <= 90; x += 5) {
            double y = Math.sin(Math.toRadians(x));
            System.out.println("sin(" + x + ")=" + y);
        }
    }
}

