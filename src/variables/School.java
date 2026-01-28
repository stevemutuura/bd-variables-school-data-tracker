package variables;

public class School {
    private final int classroomsAmount = 10;
    private final int studentsAmount = 86;
    private final int teacherAmount = 14;
    private final double averageTeacherSalary = 70_000.0;
    private final double annualExpenditure = 1206724.86;
    private final double totalBudget = 1_500_000.0;
    private final String name = "Red Mountain High School";
    private final boolean isAccredited = true;

    /**
     * Calculate how many students are in each classroom (rounded).
     * Returns 0 when there are no classrooms.
     */
    public int studentsPerClassroom() {
        if (classroomsAmount == 0) {
            return 0;
        }
        return Math.round((float) studentsAmount / classroomsAmount);
    }

    /**
     * Calculate the net annual cost per student after teacher salaries.
     * Returns 0.0 when there are no students.
     */
    public double costPerStudent() {
        if (studentsAmount == 0) {
            return 0.0;
        }
        return (annualExpenditure - (teacherAmount * averageTeacherSalary)) /
                studentsAmount;
    }

    /**
     * Calculate the cost per classroom by multiplying students per classroom
     * by the cost per student.
     */
    public double costPerClassroom() {
        return studentsPerClassroom() * costPerStudent();
    }

    /**
     * Returns true when the school's total budget is greater than annual expenditure.
     */
    public boolean isWithinBudget() {
        return totalBudget > annualExpenditure;
    }

    /**
     * Round a monetary value to the nearest cent.
     */
    public double roundToNearest(double value) {
        long numPennies = Math.round(value * 100);
        return numPennies / 100.0;
    }

    /**
     * Simple runner that prints a few computed values for the school.
     */
    public static void main(String[] args) {
        School school = new School();
        System.out.println("School name: " + school.name);
        System.out.println("Students per classroom: " + school.studentsPerClassroom());
        System.out.println("Cost per student: " + school.roundToNearest(school.costPerStudent()));
        System.out.println("Cost per classroom: " + school.roundToNearest(school.costPerClassroom()));
    }
}
