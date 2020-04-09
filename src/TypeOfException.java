import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TypeOfException {
    public static void A() throws FileNotFoundException {
        FileReader test=new FileReader("abc");

    }
    public static void B(){
        try{
            A();
        }catch (FileNotFoundException ex){
            System.out.println("Loi");
        }
    }
    public  static void C(){
        B();
    }
    public static void main(String[] args) {
        C();

    }

}
