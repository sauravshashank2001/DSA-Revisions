
import java.util.Scanner;

class Main{

    //take input in loops

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "";
        for(int i=0;i<5;i++){
            System.out.print("enter number"+ i);
            int a = sc.nextInt();
            st+=a+",";

        }

        int i=0;
        while(i<5){
            System.out.print("enter number"+ i);
             int a = sc.nextInt();
             st+=a+",";
             i++;
        }

        System.out.print(st);
    }



}