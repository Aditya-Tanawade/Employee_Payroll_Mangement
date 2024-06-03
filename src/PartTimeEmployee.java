 class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(int empId,String empName, double hourlyRate,int  hoursWorked){
        super(empId,empName);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
     public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
}
