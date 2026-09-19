import java.util.Arrays;

public class HelloArrays {

    public static void main(String[] args) {


        int[] numbers = new int[4]; // 0,0,0,0

        numbers[0] = 63;


        int[] numbersFull = {1,2,3,67}; // 1,2,3,4

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbersFull));

        System.out.println(numbersFull[0]);

        numbersFull[0] = 42;

        System.out.println(Arrays.toString(numbersFull));

//        System.out.println( numbersFull[4]);

        System.out.println(numbersFull[0]);

        System.out.println(numbersFull.length);

        System.out.println(numbersFull[numbersFull.length -1]);


        String[] students = {"Alice", "Bob", "Charlie", "David"};

        System.out.println(students[2]);






    }
}
