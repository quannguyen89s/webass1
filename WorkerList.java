package WEEK3.manageworker.model;

import java.util.ArrayList;
import java.util.Collections;

public class WorkerList {
    ArrayList<Worker> workerList = new ArrayList<>();
    ArrayList<Salary> salaryHistory = new ArrayList<>();
    
    public void addWorker(Worker worker) {
        Worker w = searchWorkerById(worker.getId());
        if(w == null) {
            workerList.add(worker);
            return;
        }
        else {
            System.out.println("ID already exist!!!!!");
        }
      
        
    }
    public void addSalaryHistory(Salary salary) {
        salaryHistory.add(salary);
    }
 
    public Worker searchWorkerById(String id) {
            
            for(Worker worker : workerList) {
                if(worker.getId().equals(id)) { 
                    return worker;
                }
               
                
            }
            
          return null;  
        
            
    }
    public void increaseSalary(String code, float amount) {
        Worker w = searchWorkerById(code);
        if(w != null) {
            float currentSalary = w.getSalary();
            w.setSalary(currentSalary + amount);
        }
        else {
            System.out.println("Not found !!!!");
        }
    }
    
        public void decreaseSalary(String code, float amount) {
            Worker w = searchWorkerById(code);
            if (w != null) {
                float currentSalary = w.getSalary();
                if (currentSalary - amount >= 0) {
                    w.setSalary(currentSalary - amount);
                } else {
                    System.out.println("Error: Salary cannot be negative.");
                }
            } else {
                System.out.println("Worker not found.");
            }
        }

    public ArrayList<Salary> showInformationSalary() {
        ArrayList<Salary> sala = salaryHistory;
        Collections.sort(sala, (o1,o2) -> o1.getId().compareTo(o2.getId()));
        return sala;
    }
    
    
    

}
