public class PersonThrow {
    public static void exampleThrow(){
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        try {
            exampleThrow();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Loi");
        }

    }
}
