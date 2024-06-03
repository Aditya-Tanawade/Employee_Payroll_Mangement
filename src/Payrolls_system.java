import java.util.ArrayList;
import java.util.List;

public class Payrolls_system {

    private ArrayList<Employee> emplist;

   public Payrolls_system() {
       emplist = new ArrayList<>();
      }


      public void addEmployee(Employee employee){
           emplist.add(employee);
       }

       public void removeEmployee(int id){
         Employee employeeToRemove=null;
         for(Employee employee : emplist){
             if(employee.getEmpId()==id){
                 employeeToRemove=employee;
                 break;
             }
         }
         if(employeeToRemove != null){
             emplist.remove(employeeToRemove);
         }
       }


       public void displayEmployees(){
        for(Employee employee1 : emplist){
            System.out.println(employee1);
        }
       }
   }



