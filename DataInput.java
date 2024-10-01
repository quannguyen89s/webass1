package WEEK3.manageworker.view;

import java.util.Scanner;

public class DataInput {
    public static Scanner scanner = new Scanner(System.in);
    final String regex = "^[W]\\s\\d+$";
    public int IntInput()  {
    int number;
        while (true) {
            
            try {
                    
                    number = Integer.parseInt(scanner.nextLine());
                        if (number > 0) {
                            return number;
                        }
                    else {
                        System.err.println("Negative number !!!! Input mut be positive number");
                    }
                    
            }catch(Exception  e ) {
                System.err.println("Wrong format. Must be integer!!!!!");
            }
        }
    
    }
    public String InpuString() {

        String word;
        while (true) {
            try {
            word = scanner.nextLine(); 
            if(!word.isEmpty() && !word.startsWith(" ")) {
                    return word; 
            }
            else {
                  System.out.print("Not be empty!! Enter again : ");
                    }
            }catch (Exception e) {
                System.out.println("Must be string !!!");
            }
         
        }
    }

    
    public int inputIntLimit(int min , int max) {
        int number;
        while (true) {
        
            try { 
                number = Integer.parseInt(scanner.nextLine());
                if (number>= min && number <= max) {
                    return number;
                }
                else {
                    System.out.println("Out of range. From " + min + " to " + max);
                }
               
            }catch(Exception e) {
                System.out.println("Must be integer and in range from " + min + " to " + max + " !!");
            }
           
        }
    }
    public boolean YN() {
        String input;
        while (true) {
            System.out.print("Do you want to continue (yes/no): ");
            input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("yes")) {
                return true; 
            } else {
                return false;
            }
              
        }
       
    }
    public String inputCode() {
        while (true) {
            String code;
            code = scanner.nextLine();
            if(!code.isEmpty() && code.matches(regex)) {
                return code;
            }
            else {
                System.out.println("Code must be string and follow this form : W number ");
                System.out.print("Enter again : ");
            }
        }
    }
    public float InputSalary () {
            float salary;
            while (true) {
                
                try{
                    salary = Float.parseFloat(scanner.nextLine());
                    if(salary > 0) {
                        return salary;
                    } 
                    else{
                        System.out.println("Salary must be > 0 !!!!");
                    }
                } catch(Exception e) {
                    System.out.println("Salary must be float and greater than 0 !!!!!!");
                }
               
            }
    }
    
    }

