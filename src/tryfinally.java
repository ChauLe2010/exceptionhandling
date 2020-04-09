public class tryfinally {
    public static void main(String[] args) {
        try {
            int res = 10/2;
            System.out.println("10/2 = " + res);
        } finally {
            System.out.println("Khối lệnh finally luôn được thực thi");
        }

        System.out.println("Finished!");
    }
}
