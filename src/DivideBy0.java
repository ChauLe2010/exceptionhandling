public class DivideBy0 {
        public static void main(String[] args) {
            try {
                int zero = 0;
                int average = 10 / zero;
                System.out.println("Average = " + average);
            } catch (ArithmeticException ex) {
                System.out.println("Khong duoc chia cho 0 - "+ex.getMessage());
            }
            System.out.println("Finished!");
        }


}
