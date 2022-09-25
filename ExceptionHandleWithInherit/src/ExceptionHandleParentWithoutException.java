/*
If parent class does not have any exception declared
then
Child class can only declare unchecked/Runtime exceptions
 */

public class ExceptionHandleParentWithoutException {
    public void myMethod(){
        System.out.println("Hey Parent");
    }
    static class ChildClass extends ExceptionHandleParentWithoutException {
   /*

   public void myMethod() throws FileNotFoundException {
        System.out.println("Hey child class");
    }

    */

    public void myMethod() throws ArithmeticException{
        System.out.println("Hey child class 2");
    }


    }

}

