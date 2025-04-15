package variables;

public class School {

     private int classroomsAmount = 10;
     private int studentsAmount = 86;
     private int teacherAmount = 14;
     private double averageTeacherSalary = 70_000.0;
     private double annualExpenditure = 1206724.86;
     private double totalBudget = 1_500_000.0;
     private String name = "Red Mountain High School";
     private boolean isAccredited = true;

     //Methods
    public int studentsPerClassroom() {
      return Math.round( (float) studentsAmount / classroomsAmount);
    }

    public double costPerStudent() {
        return (annualExpenditure - (teacherAmount * averageTeacherSalary))
                / studentsAmount;
    }

    public double costPerClassroom() {
        return studentsPerClassroom() * costPerStudent();
    }

    public boolean isWithinBudget() {
        return totalBudget > annualExpenditure;
    }

    public double roundToNearest(double value) {
        double numPennies = (int) (value * 100);
        return numPennies / 100.0;
    }



    public void main() {
        System.out.println("Students per classroom: " + studentsPerClassroom());
        System.out.println("Cost per student: " + roundToNearest(costPerStudent()));
        System.out.println("Cost per classroom: " + roundToNearest(costPerClassroom()));
    }
}
