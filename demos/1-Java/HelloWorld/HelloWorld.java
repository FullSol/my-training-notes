public class HelloWorld {
    
    /**
     * 
     * The main method is the entry point that JVM will read our code
     * method = function used to execute behavior in objects
     * paramerter = arguments/inputs that we add to out methods
     */
    public static void main(String[] args) {
        int num = 100;
        System.out.println("Hello World! My secrect number is: " + addNumbers(1, 2) + ".");
        spyName(num);
    }

    /**
     * 
     * void = returns nothing
     * int method return integer    
     */
    public static int addNumbers(int x, int y) {
        return x + y;
    }

    public static void spyName(int x) {
        while (x != 0) {
             System.out.println("Bob");
        }
    }

    /**
     * Primative Datatypes:
     * 
     * boolean <- true, false - either 0, or 1
     * byte <- smallest unit of measurement <- 8 bits make a byte
     * int <- integer, whole numbers = 1, 2, 3, etc.
     * short <- 
     * long
     * double <- decimal numbers
     * float <- decimals
     * char <- single character
     * 
     * Non-primative:
     * 
     * arrays
     * collections
     * strings
     * objects
     */
}