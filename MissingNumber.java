import java.util.Scanner;
public class MissingNumber {
        public static int missing(int [] arr)
        {
            int xor=0;
            for(int i :arr)
            {
                xor=xor^i;
            }
            for(int i=1;i<arr.length+1;i++)
            {
                xor=xor^i;
            }
            return xor;
        }
    public static void main(String[] args) {
                    int a[] = new int[10];
        System.out.println("Enter the no of elements in the array");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
            System.out.println("The missing number is "+missing(a));
        }
    }
}
