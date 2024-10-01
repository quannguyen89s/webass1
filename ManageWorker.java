package WEEK3.manageworker.view;


import java.util.ArrayList;
import java.util.Scanner;

import WEEK3.manageworker.model.Salary;
import WEEK3.manageworker.model.Worker;
import WEEK3.manageworker.model.WorkerList;

/**
 * ManageWorker
 */
public class ManageWorker {
    WorkerList worker = new WorkerList();
    DataInput data = new DataInput();
    Scanner scanner = new Scanner(System.in);
   
    public void addWorker() {
        while (true) {
            System.out.print("Enter code : ");
            String code = data.inputCode();
            
            Worker exist = worker.searchWorkerById(code);
            if (exist != null) {
            System.out.println("Error: Worker with ID " + code + " already exists.");
            continue;
            }

            System.out.print("Enter name : ");
            String name  = data.InpuString();
            System.out.print("Enter age : ");
            int age = data.inputIntLimit(18, 50);
            System.out.print("Enter salary : ");
            float salary = data.InputSalary();
            System.out.print("Enter work location :");
            String workLocation = data.InpuString();
            Worker w = new Worker(code, name, age, salary, workLocation);
            worker.addWorker(w);
            System.out.println("Successful");
            if(!data.YN()) {
                return;
            }
            
        }
    }
    public void increaseWorkerSalary() {
         
                
            
            String date = java.time.LocalDate.now().toString();
            System.out.print("Enter code : ");
            String code = data.inputCode();
            Worker w = worker.searchWorkerById(code);
            if (w == null) {
                System.out.println("Not found !!!!");
                return;
        }
            System.out.print("Enter salary want to increase : ");
            float salary = data.InputSalary();
            
            worker.increaseSalary(code, salary);
            Salary s = new Salary(code, w.getName(), w.getAge(), w.getSalary(), w.getWorkLocation(), "UP", date);
            worker.addSalaryHistory(s);
            System.out.println("Increase salary successful");
              
        
    }
    public void decreaseWorkerSalary() {
        
            
            String date = java.time.LocalDate.now().toString();
            System.out.print("Enter code : ");
            String code = data.inputCode();
            
            Worker w = worker.searchWorkerById(code);
            if (w == null) {
                    System.out.println("Not found !!!!");
                    return;
            }
            System.out.print("Enter salary want to decrease : ");
            float salary = data.InputSalary();
            worker.decreaseSalary(code, salary);
            
            Salary s = new Salary(code, w.getName(), w.getAge(), w.getSalary(), w.getWorkLocation(), "DOWN", date);
            worker.addSalaryHistory(s);
            System.out.println("Decrease salary successful");
    
        
    }
        public void displayInformationSalary() {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Code","Name", "Age" , "Salary" ,  "Status" , "Date");
            ArrayList<Salary> salaryHisory = worker.showInformationSalary();
            for(Salary s : salaryHisory) {
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n" + //
                                        "", s.getId(),s.getName(),s.getAge(),s.getSalary(),s.getStatus(),s.getDate());
            }

        }
    


    
}