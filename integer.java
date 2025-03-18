import java.util.Scanner;
public class integer {

    //to find the given no. integer or not
    public static void main(String[] args){
        System.out.println("enter an integer");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
