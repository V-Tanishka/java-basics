import java.util.Scanner;
public class switchh {
    public static void main(String[] args){
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are going to become a audalt");
                break;
            case 17:
                System.out.println("no you are not audalt ");
                break;
            default:
                System.out.println("enjoy your life");


        }

    }
}
