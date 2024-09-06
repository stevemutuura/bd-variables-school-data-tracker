package variables;

public class School {
   //Instance variables ...>> classes upcoming.

   /* type varName = firstValue; --> declaring on the left, initialize on the right.
   instance variables --> Class area. Defaults to it's version of 0 if mot initialized.
   Local variables --> method area. Do not automatically get a default value if you don't initialize
   The value the variables default to in the Class area is due to a hidden constructor.
   ints = 0, doubles = 0.0, strings = null, boolean = false (default values).
   Strings are objects, objects don't have normal default values.
   It's best practice to always set something to a value.
   alt + shift + cursor --> Multiple cursors.
     */

    private int classroomAmount = 10;
    private int studentAmount = 86;
    private int teacherAmount = 14;
    private double teacherAverageSalary = 70_000.0;
    private double totalAnnualExpenditure = 1_206_724.86;
    private double totalBudget = 1_500_000.0;
    private String name = "Red Mountain High School";
    private boolean hasBeenAccredited = true;
    //Use is and has when using booleans, more readable and is better syntax.

     //Methods
    /* void/int/string | type methodName(input parameters/arguments - declared variables) */
    public int studentsPerClassroom() {
        return Math.round ((float) studentAmount / classroomAmount);
    }

    public double costPerStudent() {
         return Math.round((double) (totalAnnualExpenditure - teacherAmount * teacherAverageSalary) / studentAmount);
    }

    public double costPerClassroom() {
        return (double) (studentsPerClassroom() * costPerStudent());
    }

    public boolean isWithinBudget() {
        return totalBudget > (teacherAmount * teacherAverageSalary) + (studentAmount * costPerStudent());
    }

    public double roundtoNearestCent(double value) {
        return ((int) value * 100) / 100.0;
    }


    public void main() {
/* method area --> Local variables (Do not automatically get a default value if not initialized)
method is an action/function. Every method has a return type associated with it.
Methods also store information in that they have a calculated output thus they have a return value(type) or a void
 .......
 Multiplication & Division are usually faster than addition & subtraction.
 ......
 Methods can go anywhere but they usually come after your instance variables up top in the Class area.
 We will often have constructors(setters and getters), and then we will have regular methods....
 */


          System.out.println("Students per classroom: " + studentsPerClassroom());
          System.out.println("Cost per student: " + roundtoNearestCent(costPerStudent()));
          System.out.println("Cost per classroom: " + roundtoNearestCent(costPerClassroom()));
    }
}

  //TODO
