package WEEK3.manageworker.model;



/**
 * SalaryHistory
 */
public class Salary {
        private String id;
        private String name;
        private int age;
        private float salary;
        private String workLocation;
        private String status;
        private String date;
        
       
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
      
        
       
        
        public String getDate() {
            return date;
        }
        public void setDate(String date) {
            this.date = date;
        }
        public Salary() {}
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public float getSalary() {
            return salary;
        }
        public void setSalary(float salary) {
            this.salary = salary;
        }
        public String getWorkLocation() {
            return workLocation;
        }
        public void setWorkLocation(String workLocation) {
            this.workLocation = workLocation;
        }
        public Salary(String id, String name, int age, float salary, String workLocation, String status, String date) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.workLocation = workLocation;
            this.status = status;
            this.date = date;
        }
       
        

        

        



       
    
}