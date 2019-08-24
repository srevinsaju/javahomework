import java.util.Scanner;

class Mobike{
    public static int bno, phno, days, charge, total;
    public static String name;


    public static void input() {
        System.out.println("Enter your bike number : ");
        Scanner sc = new Scanner (System.in);
        bno = sc.nextInt();
        
        System.out.println("Enter your phone number : ");
        
        phno = sc.nextInt();

        System.out.println("Enter number of days : ");
        
        days = sc.nextInt();
        System.out.println("Enter name: ");
        
        name = sc.nextLine();

    }
    public static void compute() {
        if (days<=5){
            
            charge = 500*days;
        
        }
        if (days>5&&days<=10){
        
            charge = 500*5 + 400*(days-5);
        }
        if(days>10){
            
            charge = 500*5 + 400*5 + 200*(days-10);
        }
        
    }
    public static void display() {
        System.out.println("Bike No: \t Phone nu\t Name \t No:of days \t Charge ");
        System.out.println(bno + "\t"+ phno + "\t" + name + "\t" + days + "\t" + charge);
    }
    public static void main(String[] args) {
        input();
        compute();
        display();
    }
}