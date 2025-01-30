import java.util.Scanner;

public class nested {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("adult");
        }
        else if(age<18)
        {
            System.out.println("not adult");
        }
        else
        {
            System.out.println("exit");
        }


    }
    
}

    

