import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {


        //whenever you see 'new' keyword it means you are creating an object
        Scanner input = new Scanner(System.in);


        int[] myArray = {1, 2, 3, 4, 5};
        int[] anotherArray = new int[1];
        String[] gender = {"Female", "Male"};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 13) {
                System.out.println("Found it");
                break;
            }




            for (int k = 0; k < anotherArray.length; k++) {
                System.out.println("Insert Item at:" + k + " is ");
                anotherArray[k] = input.nextInt();
            }

            for (int a = 0; a < anotherArray.length; a++) {
                System.out.println("Item at: " + a + " is " + anotherArray[a]);
            }

            for (int o = 0; i < myArray.length; o++) {// to iterate all values in the array
                System.out.println("Item at: " + o + " is " + myArray[i]);

            }
            int sum = 0;
            for(int t =0; t < myArray.length; t++){

                sum= sum + myArray[t];
                System.out.println("This is the sum" + sum);
            }


        }
    }
}