
import java.util.*;
public class InputTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("what is your name?");
        String name = in.nextLine();

        System.out.print("how old are you?");
        int age = in.nextInt();
        System.out .println("hello,"+name+"Next year,you'll be "+(age+1));

    }
}
