import java.io.IOException;

public class ExceptionHandleParentWithRuntimeException {

    public void myMethod1() throws IOException {
        System.out.println("hey parent 1");
    }

    public void myMethod2() throws RuntimeException{
        System.out.println("hey parent 2");
    }

    public void myMethod3() throws RuntimeException{
        System.out.println("hey parent 3");
    }

    static class ChildClass{
        public void myMethod1() throws RuntimeException{
            System.out.println("hey child1");
        }

        public void myMethod2() throws Exception{
            System.out.println("hey child2");
        }

        public void myMethod3() throws ArithmeticException{
            System.out.println("hey child3");
        }
    }
}
