import java.util.Scanner;
        class Count{
            public static void main(String[] args)
            {
                int count=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number:");
         int num=sc.nextInt();
        while(num>0)
            {
                num=num/10;
                count=count+1;
            }
                System.out.println("number of digits:"+count);
        }
    }
    
