import java.util.Scanner;
import java.lang.Math;

public class Assessment1
{
    public static void main(String[] args)
    {

        Assessment1 a1 = new Assessment1();
        // Instruction: To run your respective task, uncomment below individually
    //    a1.task1();
      //  a1.task2();
     //   a1.task3();
        a1.task4();
    }

    // code your task 1(a) as a method here
    private static double areaOfCircle(double r)
    {
        double area;
        area = Math.pow(r,2)*Math.PI;
        return area;
    }

    private static Boolean numberValidator(int numToCheck, int min, int max)
    {
        return (numToCheck > min) && (numToCheck < max);
    }

    private static boolean dateValidator(int day, int month, int year)
    {
        int[] array1 = {31,28,31,30,31,30,31,31,30,31,30,31};

        boolean check = false;
        for (int k = 0; k < array1.length; k++)
        {
            if (((month == k+1) && (day <= array1[k])) || ((month == 2 && day<=29) && ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)))) {
                check =  true;
                break;
            }
        }
        return check;
    }
    public void task1()
    {
        double radius = 5.0, area;
        area = areaOfCircle(radius);
        System.out.println(area);
    }

    public void task2()
    {
        Monster Monster1 = new Monster("Mattasaur",8,3,60);
        Monster1.setHealthVal(45);
        System.out.println("New Health value of Monster1 is: " + Monster1.getHealthVal());
    }

    // code your task 3(a) as a method here

    public void task3()
    {
        Scanner takeIn = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int value = takeIn.nextInt();
        Boolean validation = numberValidator(value,0,100);
        if (validation){
            System.out.println("The number is valid.");
        } else {
            System.out.println("The number is not valid.");
        }
    }

    // code your task 4(a) as a method here
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