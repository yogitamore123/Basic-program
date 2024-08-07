import java.util.Scanner;
public class _2program {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator : ");
        char op = sc.next().charAt(0);
        if(op=='+')

      {
          System.out.println(num1+num2);
    }
     else 
     {
        if(op=='-')




        

      {
          System.out.println(num1-num2);
    }
    else 
     {
        if(op=='*')

      {
          System.out.println(num1*num2);
    }
    else 
     {
        if(op=='/')

      {
          System.out.println(num1/num2);
    }
    else 
    {
        System.out.println(num1%num2);
    }
     }
     }
     }

    // Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter first number : ");
    //     int num1 = sc.nextInt();
    //     System.out.println("Enter second number : ");
    //     int num2 = sc.nextInt();
    //     System.out.println(1='+');
    //     System.out.println(2=='-');
    //     System.out.println(3=='*');
    //     System.out.println(4=='/');
    //     int op = sc.nextInt();
    //     if(op==1)

    //       {
    //           System.out.println(num1+num2);
    //     }
    //      else 
    //      {
    //         if(op==2)
    
    //       {
    //           System.out.println(num1+num2);
    //     }
    //     else 
    //      {
    //         if(op==3)
    
    //       {
    //           System.out.println(num1*num2);
    //     }
    //     else 
    //      {
    //         if(op==4)
    
    //       {
    //           System.out.println(num1/num2);
    //     }
    //     else 
    //     {
    //         System.out.println(num1%num2);
    //     }
    //      }
    //      }
    //      }
        

    }
}
