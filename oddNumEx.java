import java.util.Scanner;
public class oddNumEx extends RuntimeException {
    oddNumEx(){
        super("The number is odd...");
    }
}
class checkNumberodd{
    void numcheck(int num){
        try{
            if(num%2!=0){
                throw new oddNumEx();
            }
            else{
                System.out.println("The number is even...");
            }
        }
        catch(oddNumEx e){
            e.printStackTrace();
        }
    }
}
class check{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        checkNumberodd ob=new checkNumberodd();
        System.out.println("Please enter a number");
        int num=sc.nextInt();
        ob.numcheck(num);
    }
}