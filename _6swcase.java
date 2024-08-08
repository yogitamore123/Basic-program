import java.util.Scanner;
public class _6swcase {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no for day(1-7)");
        int var = sc. nextInt();
        switch(var){
       case 1:
        System.out.println("Its a monday");
        break;
        case 2:
        System.out.println("Its a tuesday");
        break;
        case 3:
        System.out.println("Its a wednesday");
        break;
        case 4:
        System.out.println("Its a thursday");
        break;
        case 5:
        System.out.println("Its a friday");
        break;
        case 6:
        System.out.println("Its a saturday");
        break;
        case 7:
        System.out.println(" Its a sunday");
        break;
        default:
        System.out.println(" invelid day ");
        break;
        }
    }



}  
}
