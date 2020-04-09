public class finallyexit {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            System.exit(0); // Khối finally sẽ không được thực thi
        } finally {
            System.out.println("Khối lệnh finally luôn được thực thi");
        }

        System.out.println("Finished!");
    }
}
