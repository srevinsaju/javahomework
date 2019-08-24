import java.util.Scanner;
class Example {
    public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    int number;
    for (int i = 1; i<=5; i+=1){
        for (int j = i; j<=i && j!=0; j-=1){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}