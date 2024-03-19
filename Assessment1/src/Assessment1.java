import java.util.Scanner;
import java.lang.Math;
// Name: Sri Shanka
// version 1
// Assignment A1 main class
public class Assessment1
{

    public static void main(String[] args)
    {

        Assessment1 a1 = new Assessment1();
        // Instruction: To run your respective task, uncomment below individually
        // a1.task1();
        // a1.task2();
        // a1.task3();
        // a1.task4();

    }

    // code your task 1(a) as a method here
    // method for calculating the area of a circle
    private static double areaOfCircle(double radius)
    {

        double area;
        area = Math.pow(radius,2)*Math.PI;
        return area;

    }

    //task 1
    public void task1()
    {

        double radius = 5.0, area;
        area = areaOfCircle(radius);
        System.out.println(area);

    }

    //task 2
    public void task2()
    {

        //instantiate the Monster object as monster1
        String newName = "Mattasaur";
        int attackValue = 8;
        int defenceValue = 3;
        int healthValue = 60;
        Monster Monster1 = new Monster(newName,attackValue,defenceValue,healthValue);
        Monster1.setHealthVal(45);
        System.out.println("New Health value of Monster1 is: " + Monster1.getHealthVal());

    }


    // code your task 3(a) as a method here
    // method to validate if a value is between the given minimum and maximum
    private static Boolean numberValidator(int numberToCheck, int minimum, int maximum)
    {

        return (numberToCheck > minimum) && (numberToCheck < maximum);

    }

    //task 3
    public void task3()
    {

        Scanner takeIn = new Scanner(System.in);
        System.out.println("Please enter an integer:");

        int value = takeIn.nextInt();
        int minimum = 0;
        int maximum = 100;

        Boolean validation = numberValidator(value,minimum,maximum);
        if (validation){
            System.out.println("The number is valid.");
        } else {
            System.out.println("The number is not valid.");
        }

    }

    // code your task 4(a) as a method here
    // method to validate the input date
    private static boolean dateValidator(int day, int month, int year)
    {
        // array with all dates
        int[] datesList = {31,28,31,30,31,30,31,31,30,31,30,31};

        //checking month
        if (month < 1 || month >12)
        {
            return false;
        }

        //checking day
        for (int k = 0; k < datesList.length; k++)
        {

            if ((month == k + 1) && (day <= datesList[k]))
            {
                return true;
            }

        }

        //leap years
        if ((month == 2 && day <= 29) && ((year % 4 == 0 && year % 100 != 0)
                || (year % 100 == 0 && year % 400 == 0)))
        {
            return true;
        }

        return false;

    }

    //task 4
    public void task4()
    {

        Scanner takeIn = new Scanner(System.in);
        System.out.println("Please enter a day, month and year:");
        int day = takeIn.nextInt();
        int month = takeIn.nextInt();
        int year = takeIn.nextInt();
        boolean validation = dateValidator(day,month,year);
        if (validation){
            System.out.println("The date is valid.");
        } else {
            System.out.println("The date is not valid.");
        }

    }
}