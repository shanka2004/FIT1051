public class test1
{
    /**
     *  This is a method for performing simple calculation and printing out the result
     **/
    public void calculationMethod()
    {
        // let's do some calculation here
        int a = 0;
        int b = 10;
        int c = a + b;
        
        System.out.println("The result of c is " + c);
    }

    /**
     *  This is the main method which runs the entire programs
     *  @param  args     A String array to pass any parameters to the main method
     **/
    public static void main(String[] args)
    {
        // let's try printing out Hello world!
        System.out.println("Hello world!");

        // let's try something more advanced (creating an object)
        test1 helloObj = new test1();
        
        // now we can run the calculation method, relying on the object
        helloObj.calculationMethod(); 
        //hello hello
    }

}
