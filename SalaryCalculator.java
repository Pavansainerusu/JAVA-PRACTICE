public class SalaryCalculator {
    public static void main(String[] args) {
        double basicSalary = 20000; // Hardcoded basic salary
        double dearnessAllowancePercentage = 40.0; // 40% dearness allowance
        double houseRentAllowancePercentage = 20.0; // 20% house rent allowance

        // Calculate allowances
        double dearnessAllowance = (dearnessAllowancePercentage / 100) * basicSalary;
        double houseRentAllowance = (houseRentAllowancePercentage / 100) * basicSalary;

        // Calculate total salary
        double totalSalary = basicSalary + dearnessAllowance + houseRentAllowance;

        // Display results
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Dearness Allowance (" + dearnessAllowancePercentage + "%): " + dearnessAllowance);
        System.out.println("House Rent Allowance (" + houseRentAllowancePercentage + "%): " + houseRentAllowance);
        System.out.println("Total Salary: " + totalSalary);
    }
}
