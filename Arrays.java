import java.util.Arrays;
class Main{

    public static void main(String[] args) {
        //basic arrays auto initialization with 0

        int[] arr= new int[10];//[0,0,0,0,....]

        arr[0]=1;

        System.out.println(arr[0]);
        System.out.println(arr[9]);


        //pre filled array
        int [] arr1= {1,2,3};
        System.out.println(arr1[2]);

        //Boolean Array
        boolean[] flags = new boolean[3]; //[false,false,false]

        String[] names = new String[3]; // [null,null,null]

        char[] letters = new char[3]; //['\u0000','\u0000','\u0000']

        //Array Length
        System.err.println(arr.length);


        //loping

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //print entire array
        System.out.println(Arrays.toString(arr));

        //fill array with a value
        int[] arr2 = new int[5];
        Arrays.fill(arr2, 7); 

        //copy array
        int[] copy = Arrays.copyOf(arr, arr.length);

        // Arrays are FIXED SIZE - cannot change length after creation
        int[] arr = new int[3];
        // arr.length is always 3, cannot add more elements

        // Index Out of Bounds Error
        int[] nums = {1, 2, 3};
        // System.out.println(nums[5]);  // ERROR! Index 5 doesn't exist

        // Arrays are objects (passed by reference)
        int[] original = {1, 2, 3};
        int[] reference = original;
        reference[0] = 100;
        System.out.println(original[0]);  // 100 (both point to same array!)




    }



}