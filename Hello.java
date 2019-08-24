import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Hello{

    private static void printm(String string) {
        System.out.println(string);
    }
    public static String input() {
        Scanner somescanner = new Scanner(System.in);
        String sth = somescanner.next();
        somescanner.close();
        return sth;
    }
    public static void main(String[] args) throws IOException{
        printm("hello my function");
        System.out.println("Hello!");
        System.out.println("Welcome to expert calculator!. My first extensively tested Java"
        +"program");
        printm("Enter your number 1");
        Scanner newsc = new Scanner(System.in);
        Double numberr0;
        try{
            numberr0 = newsc.nextDouble();
            
        }catch (java.util.InputMismatchException e){
            printm("Sorry! Invalid input!, try again!");
            numberr0 = 0.0;
            System.exit(0);
        }
        
        printm("Enter your modee of calculation");
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char name = reader.readLine().charAt(0);
        System.out.println(name);
        char el = name;
        newsc.close();
        System.out.println("OK Num 2 ");

        Double numberr1 = newsc.nextDouble();
        Double sum;
    
        switch (el) {
            case '+':
                sum = numberr0 + numberr1;
                break;
            case '-':
                sum = numberr0 - numberr1;
                break;
            case '*':
                sum = numberr0*numberr1;
                break;
            case '/':
                sum = numberr0/numberr1;
                break;
            default:
                sum = 0.0;
                printm("Error!");
                break;
        }
        printm("YOUR FINAL RESULT IS : "+sum);
        
    }
}