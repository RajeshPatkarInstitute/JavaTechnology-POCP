package javatechnologypocp;

/**
 *
 * @author rajeshpatkar
 */
public class ConstructorOverloadingPermittedinJava {

    public static void main(String[] args) {
        System.out.println("Assertion ::");
        System.out.println("Constructor Overloading Permitted in Java\n");
        System.out.println("Creating Object using default Constructor");
        C1 obj1 = new C1();
        System.out.println("Creation of Object with hash code "
                + obj1.hashCode() + " completed");
        System.out.println("Printing Content of Object with hash code "
                + obj1.hashCode());
        obj1.print();
         System.out.println("Printing Content of Object with hash code "
                + obj1.hashCode() + " completed\n");
        System.out.println("Creating Object using parameterized Constructor");
        C1 obj2 = new C1(10,20);
        System.out.println("Creation of Object with hash code "
                + obj2.hashCode() + " completed");
        System.out.println("Printing Content of Object with hash code "
                + obj2.hashCode());
        obj2.print();
        System.out.println("Printing Content of Object with hash code "
                + obj2.hashCode()+" completed\n");
        
        System.out.println("\n Conclusion :: \n The above execution and it's corresponding source code"+
                " proves that multiple constructors can be written in a Java Class"+
                " Hence Java supports Constructor Overloading\n");
    }
}

class C1 {
    
    private int a;
    private int b;

    C1() {
        System.out.println("Entering default Constructor of Class C1");
        System.out.println("Object with hashcode "
                + this.hashCode() + " being initialized by Constructor C1");
        a = 1;
        b = 2;
        System.out.println("Leaving default Constructor of Class C1");
    }
    
    C1(int a, int b) {
        System.out.println("Entering parameterized Constructor of Class C1");
        System.out.println("Object with hashcode "
                + this.hashCode() + " being initialized by parameterized Constructor C1");
        this.a = a;
        this.b = b;
        System.out.println("Leaving parameterized Constructor of Class C1");
    }
    
    void print(){
        System.out.println("Execution Entering print of C1");
        System.out.println("a = "+a);
        System.out.println("a = "+b);
        System.out.println("Execution Leaving print of C1");
    }
}
