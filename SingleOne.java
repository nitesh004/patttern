import java.util.Scanner;
public class SingleOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter the smallest k digit number");
        int k;
        k=sc.nextInt();
        System.out.println("Enter the x divisible number");
         int x;
        x= sc.nextInt();

        double i = Math.pow(10,k-1);
        double n = Math.pow(10,k);
        double ans;
//        System.out.println(i);
//        System.out.println(n);
        for(double j =i ;j<n;j++)
        {
             if(j%x==0)
             {
                 System.out.println(j);
                 break;
            }}
    }
}
