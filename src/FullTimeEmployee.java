class FullTimeEmployee extends Employee {
    private double monthsalary;



    public FullTimeEmployee(int empId, String empName,double monthsalary) {
        super(empId, empName);
        this.monthsalary=monthsalary;
    }

    @Override
    public double calculateSalary() {
        return monthsalary;
    }


}
