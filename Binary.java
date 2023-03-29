import java.util.Scanner;
import java.util.Arrays;
public class Binary {
    void prrint(int arr[])
    {
        System.out.println("The sorted aaray");
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

    public static void main(String[] args) {
        Binary b= new Binary();
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        size = sc.nextInt();
        int array[];
        array = new int[size];
        System.out.println("Enter the Elemets of array");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }

        Arrays.sort(array);
        b.prrint(array);
        int key;
        System.out.println("Enter the key element");
        key= sc.nextByte();
        int last = array.length-1;
        b.binarySearch(array,0,last,key);

    }
}