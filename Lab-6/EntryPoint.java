import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) { 
        String chc;
      try (Scanner scan = new Scanner(System.in)) {
        
           do {
            System.out.println("Which service would you like to use? \n " +
             "1: Basic week visualizer \n "+ 
             "2: Advanced week visualizer \n " + 
             "3: Basic calculator \n " + 
             "4: Employee repertoire");
              int choice = Integer.parseInt(scan.nextLine());
           switch(choice){
            case 1 :

            BasicWeek bw = new BasicWeek();
            bw.printDays();
            break;

            case 2 :
            AdvancedWeek aw = new AdvancedWeek();
            aw.printDays();
            break;

            case 3 : 
            Calculator clc = new Calculator();
             break;

            case 4 : 
            Employee emp = new Employee();
            System.out.println(emp);
            break;

            default : 
            System.out.println("Please make sure you pick a number between 1 and 4 ");

        } 
        
        System.out.println("Would you like to perform another operation? (y/n) ");
        
        chc = scan.nextLine();
        
           }
           
           while (chc.equals("y"));
      
        
    
               
        }

    }
}
  