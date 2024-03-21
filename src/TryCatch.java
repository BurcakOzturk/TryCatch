package TryCatch;
public class TryCatch {

    import java.util.Scanner;


    public static void main(String[] args) {


        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Index Of Array: ");
        int index = input.nextInt();


        try {

            System.out.print(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {

            e.printStackTrace();
        }


    }
}
