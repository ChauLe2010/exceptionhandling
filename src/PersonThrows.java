import sun.awt.windows.WPrinterJob;

public class PersonThrows {
    public static void print() throws ArrayIndexOutOfBoundsException{
        int[] numbers = {1,2};
        System.out.println(numbers[2]);
    }
    public static void main(String[] args) {
        try {
            print();
        }catch(Exception ex){
            System.out.println("Loi");
        }

    }
}
