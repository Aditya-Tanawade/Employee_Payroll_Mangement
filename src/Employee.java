abstract class Employee {

    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId=empId;
         this.empName = empName;
    }

    public String getEmpName (){
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {


        return "Employee [ Name=" +empName +", id ="+empId +",Salary="+calculateSalary()+"]";
    }
}
