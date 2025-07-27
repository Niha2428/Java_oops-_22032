import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your CGPA: ");
        float gpa = scan.nextFloat();
        scan.nextLine();
        System.out.print("Enter your register number: ");
        String register_number = scan.nextLine();
        System.out.print("Enter your phone number: ");
        long phone_no = scan.nextLong();
        System.out.print("Your details"+"\n");
        System.out.print("Name: " + name+"\n");
        System.out.print("CGPA: " + gpa+"\n");
        System.out.print("Register Number: "+ register_number+"\n");
        System.out.print("Phone Number: " + phone_no+"\n");
        scan.close();
    }
}

