package WEEK3.manageworker.view;

public class Menu {
    DataInput data = new DataInput();
    public int Menu(int min , int max) {
            int choice;
            while (true) {
                System.out.println("======== Worker Management ========= \r\n" + //
                                        "1. Add Worker \r\n" + //
                                        "2. Up salary \r\n" + //
                                        "3. Down salary \r\n" + //
                                        "4. Display Information salary \r\n" + //
                                        "5. Exit");
                                        System.out.print("Enter your choice : ");
                                        choice =data.inputIntLimit(min, max);
                                        return choice;
            }
    }
}
