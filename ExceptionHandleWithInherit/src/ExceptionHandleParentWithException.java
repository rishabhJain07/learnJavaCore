import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;

/*

If Parent class method is declared with an exception
then
Child class method can only declare equalto to child exception or leave it blank

 */

class ExceptionHandleParentWithCheckedException {
    public void myMethod1() throws SocketException {
        System.out.println("Hey Parent class M1");
    }

    public void myMethod2() throws SocketException {
        System.out.println("Hey Parent class M2");
    }

    public void myMethod3() throws SocketException {
        System.out.println("Hey Parent class M3");
    }

    static class ChildClass extends ExceptionHandleParentWithCheckedException{
        public void myMethod1(){
            System.out.println("Hey child class method with out exception mentioned");
        }

        public void myMethod2() throws ConnectException {
            System.out.println("Hey child class method with child exception mentioned");
        }

       /*

        public void myMethod3() throws FileNotFoundException {
            System.out.println("Hey child class method with parent exception mentioned");
        }


        */
    }


}
