package airplane.reservation;
import java.util.*;
import java.util.Scanner;

public class AirplaneReservation {
         static class Flight {
        String flightClass;
        double price;

        Flight(String flightClass, double price) {
            this.flightClass = flightClass;
            this.price = price;
        }
    }
 public static void main(String[] args) {
Scanner IN=new Scanner(System.in);
Hashtable <String , Integer> Countries =new Hashtable <>();
Stack <String> flights =new Stack <String>();
 
//Countries

System.out.println("Welcome. Please enter the appropriate number for the country you want");
Countries.put("Jordan",1 );
Countries.put("Qatar", 2);
Countries.put("Oman", 3);
Countries.put("Kuwait",4);
System.out.println(Countries);
 int CNo=IN.nextInt();
 String name = null;


 //Flights
flights.push("Take off: 8am   Landing: 10:10am");  //0 Jordan
flights.push("Take off: 9pm   Landing: 11:10pm"); //1  Jordan
flights.push("Take off: 8am   Landing: 9:10am");   //2  Qatar
flights.push("Take off: 9pm   Landing: 10:10pm"); //3  Qatar
flights.push("Take off: 8am   Landing: 10am");      //4  Oman
flights.push("Take off: 9pm   Landing: 11pm");      //5  Oman
flights.push("Take off: 8am   Landing: 9:10am");   //6  Kuwait
flights.push("Take off: 9pm   Landing: 10:10pm"); //7  Kuwait
 

if(CNo==Countries.get("Jordan")){
  name="Jordan";
  System.out.println("Thank you, the country of Jordan has been chosen");
  System.out.println( "Choose one of these flights\n 1-"+flights.get(0)+"\n 2-"+flights.get(1));}

else if (CNo==Countries.get("Qatar")){
  name="Qatar";
   System.out.println("Thank you, the country of Qatar has been chosen");
    System.out.println("Choose one of these flights\n 1-"+flights.get(2)+"\n 2-"+flights.get(3));}

else if(CNo==Countries.get("Oman")){
  name="Oman";
  System.out.println("Thank you, the country of Oman has been chosen");
    System.out.println("Choose one of these flights\n 1-"+flights.get(4)+"\n 2-"+flights.get(5));}

else if(CNo==Countries.get("Kuwait")){
  name="Kuwait";
   System.out.println("Thank you, the country of Kuwait has been chosen");
    System.out.println("Choose one of these flights\n 1-"+flights.get(6)+"\n 2-"+flights.get(7));}

else  
 System.out.println("The correct number was not entered");
 
 
 int FNo=IN.nextInt();
String SF="";
if(CNo==1 && FNo==1){SF=flights.get(0);}
else if(CNo==1 && FNo==2){SF=flights.get(1);}
else if(CNo==2 && FNo==1){SF=flights.get(2);}
else if(CNo==2 && FNo==2){SF=flights.get(3);}
else if(CNo==3 && FNo==1){SF=flights.get(4);}
else if(CNo==3 && FNo==2){SF=flights.get(5);}
else if(CNo==4 && FNo==1){SF=flights.get(6);}
else {SF=flights.get(7);}
System.out.println(" your flight is: "+SF); 
 
        LinkedList<Flight> flightClass = new LinkedList<>();
        flightClass.add(new Flight("Premium Economy class", 1000.0));
        flightClass.add(new Flight("First Class", 3000.0));

        System.out.println("Available flight classes and prices:");
        for (int i = 0; i < flightClass.size(); i++) {
            Flight flight = flightClass.get(i);
            System.out.println("[" + (i + 1) + "] Class: " + flight.flightClass +
                    ", Price: " + flight.price + "SR");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of the desired flight class: ");
        int flightNumber = scanner.nextInt();

        if (flightNumber >= 1 && flightNumber <= flights.size()) {
            Flight selectedFlight = flightClass.get(flightNumber - 1);
            System.out.println("Selected Flight Class: " + selectedFlight.flightClass);
            System.out.println("Price: " + selectedFlight.price + "SR");
        } else {
            System.out.println("Invalid flight number!");
        }
    
        LinkedList<String> meal = new LinkedList<>();
        meal.add( "Breakfast: PANCAKES, FRUIT, COFFEE");
        meal.add("Dinner: STEW, CANDY, PEPSI");
        meal.add( "Breakfast: BAKED POTATO, TOFFEE APPLE, TEA");
        meal.add( "Dinner: SCAMPI, SALAD, FRUIT JUICE");

        System.out.println("Breakfast,and dinner for each class:");
        int i = 1;
        for (String mealsDescription : meal) {
            System.out.println("Meal " + i + ":");
            System.out.println(mealsDescription);
            i++;
        }
    System.out.print("Please enter the desired meal number: ");
    int mealNumber = scanner.nextInt();
        
    String selectedMeal = null;
    String selectedFlightClass = null;
    String selectedFlightprice = null;
    if (mealNumber >= 1 && mealNumber <= meal.size()) {
        selectedMeal = meal.get(mealNumber - 1);
        System.out.println();
    
    if (mealNumber <= 3) {
        selectedFlightClass = "Premium Economy class";
        selectedFlightprice ="1000,0";
    } else {
        selectedFlightClass = "First Class";
        selectedFlightprice ="3000,0";
            }
    System.out.println(" Countries : "+name);
    System.out.println(" Time : "+SF);
    System.out.println(" Flight Class: " + selectedFlightClass );
    System.out.println(" price : " + selectedFlightprice + " SR");
    System.out.println(" Meal: " + selectedMeal);
} else {
    System.out.println("Invalid meal number!");
}
System.out.println("\n*Thanks you for Choosing our company*");
    }
} 