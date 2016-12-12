package childconstructorcallsparentconstructor;

/**
 *
 * @author rajeshpatkar
 */
public class ChildConstructorCallsParentConstructor {

    public static void main(String[] args) {
        System.out.println("Assertion ::");
        System.out.println("Child Constructor always calls Parent Constructor\n");
        System.out.println("Creating Parent Object");
        C1 obj1 = new C1();
        System.out.println("Creation of Object with hash code "
                + obj1.hashCode() + " completed\n");
        System.out.println("Creating Child Object");
        C2 obj2 = new C2();
        System.out.println("Creation of Object with hash code "
                + obj2.hashCode() + " completed");
    }

}

class C1 /* Parent */ {

    C1() {
        System.out.println("Entering Constructor of Class C1");
        System.out.println("Object with hashcode "
                + this.hashCode() + " being initialized by Constructor C1");
        System.out.println("Leaving Constructor of Class C1");
    }
}

class C2 /* Child Class */ extends C1 {

    C2() {
        System.out.println("Entering Constructor of Class C2");
        System.out.println("Object with hashcode "
                + this.hashCode() + " being initialized by Constructor C2");
        System.out.println("Leaving Constructor of Class C2");
    }
}
