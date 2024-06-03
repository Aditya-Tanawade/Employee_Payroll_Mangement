
public class Main {
    public static void main(String[] args) {

    Payrolls_system payrollsSystem=new Payrolls_system();
    FullTimeEmployee fullTimeEMP1=new FullTimeEmployee(1,"Aditya",200000);
    PartTimeEmployee partTimeEMP2=new PartTimeEmployee(2,"RAJ",1000,50);


    payrollsSystem.addEmployee(fullTimeEMP1);
    payrollsSystem.addEmployee(partTimeEMP2);

        System.out.println("Initial Employee Detail");
        payrollsSystem.displayEmployees();

        System.out.println("Removing Employee");
        payrollsSystem.removeEmployee(1);


        System.out.println("Reamaianing EMployee details");
        payrollsSystem.displayEmployees();

    }
}