import java.util.Scanner;

class Flights {
    static String name;
    static int age;
    static String destination;
    public static int TicketNumber = (int)(Math.random() * 1000) + 1;
    static void Booked(){
        System.out.println("----------------------------------");
        System.out.println("Your Ticket Number:"+TicketNumber);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Destination: "+destination);
        System.out.println("Status: Flight Booked...");
        System.out.println("----------------------------------");
    }
    static void Canceld(){
        System.out.println("----------------------------------");
        System.out.println("Your Ticket Number:"+TicketNumber);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Destination: "+destination);
        System.out.println("Status: Ticket Has Been Canceled...");
        System.out.println("----------------------------------");
    }
}
class Hotels {
    static int randomNumber = (int)(Math.random() * 100) + 1;
    static String name;
    static int age;
    static int Number;
    static String ac;
    static int ReceiptNumber = (int)(Math.random()*1000 + 1);
    static void Booked() {
        System.out.println("----------------------------------");
        System.out.println("Receipt Number:"+ReceiptNumber);
        System.out.println("Your Room Number Is: "+randomNumber);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Number of Persons: "+Number);
        System.out.println("Type: "+ac);
        System.out.println("Status: Hotel Booked...");
        System.out.println("----------------------------------");
    }
    static void Canceled() {
        System.out.println("Your Booking Has Been Canceled...");
    }
}
public class FlightHotelBooking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose The Booking Options [1]Flight [2]Hotel: ");
        String choice1 = sc.nextLine();
        //sc.nextLine();
        if(choice1.equalsIgnoreCase("Flight")){
            System.out.print("Enter Your Name: ");
            Flights.name = sc.nextLine();
            System.out.print("Enter Your Age: ");
            Flights.age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Your Destination: ");
            Flights.destination = sc.nextLine();
            Flights.Booked();
            System.out.print("Do You Want Cancel a Ticket: ");
        String cancel = sc.nextLine();
        switch (cancel) {
            case "yes":
            case "Yes":
            case "YES":
            System.out.print("Enter a Ticket Number: ");
            int TicketNum =sc.nextInt();
            if (TicketNum == Flights.TicketNumber) {
                Flights.Canceld();
            }
            else{
                System.out.println("Invalid Ticket Number..");
            }
            break;
            case "no":
            case "No":
            case "NO":
            System.out.println("Enjoy The Journey With us......\nThank You");
            Flights.Booked();
            break;
            default:
            System.out.println("Please wait....");
            break;
        }
        }
        else if(choice1.equalsIgnoreCase("Hotel")){
            System.out.print("Enter Your Name: ");
            Hotels.name = sc.nextLine();
            System.out.print("Enter Your Age: ");
            Hotels.age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Number of Persons: ");
            Hotels.Number = sc.nextInt(); 
            sc.nextLine();
            System.out.print("Choose Ac or Non-Ac: ");
            Hotels.ac = sc.nextLine();
            Hotels.Booked();
            System.out.print("Do Your Want Cancel Your Hotel Booking? ");
        String CancelHotel =sc.nextLine();
        switch (CancelHotel) {
            case "Yes":
            case "yes":
            case "YES":
            System.out.print("Enter a Receipt Number: ");
            int ReceiptNum = sc.nextInt();
            if(ReceiptNum == Hotels.ReceiptNumber){
                Hotels.Canceled();
            }
            else{
                System.out.println("Invalid Receipt Number: ");
            }
            break;
            case "No":
            case "no":
            case "NO":
            System.out.println("Enjoy The Journey With us......\nThank You");
            Hotels.Booked();
            break;
        }
        }
        else{
            System.out.println("Come Back Later....");
        }
    }
}


//note:--> Its My Own Way Developed Console Based Simple Java Application..
//Copyright@2025 Vijayakrishna.R
