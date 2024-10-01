package WEEK3.manageworker.view;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ManageWorker manage = new ManageWorker();
       
        while (true) {
            int choice = menu.Menu(1, 5);
            switch (choice) {
                case 1:
                    manage.addWorker();
                    break;
                case 2 : 
                    manage.increaseWorkerSalary();
                    break;    
                case 3 : 
                    manage.decreaseWorkerSalary();
                    break;
                case 4 : 
                    manage.displayInformationSalary();
                    break;
                case 5 : 
                    System.exit(0);
                    break;       
            }
        }
        
    }
}
