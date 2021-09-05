package basics.datatypes.equality;

public class Equality {
    private final String name = "bob";

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        /*
        There are two keu equality operators within Java and they are the '==' operator and
        the equals() method.
        */

        // when using the '==' with primitives it compares their values

        int x = 4;
        int y = 4;
        System.out.println(x == y); // this will always be true

        // when using the '==' operator on objects we get a different outcome
        Equality a = new Equality();
        Equality b = new Equality();
        System.out.println(a == b); // this will be false
        // The reason this is false is that both equality object a and b are having there memory references
        // compared and not there contents
        // as an example we can reference a new equality object by using one already in place
        // which will return true as they're using the same object

        Equality c = a;
        System.out.println(c == a); // this will return true as they will have the same reference

        // However, if we use the equals() method as it will compare the values not the reference
        System.out.println(a.equals(b)); // this will still return false... and that may seem weird
        /*
        This is because the equals() method simply compares what it is asked to compare and defaults to
        checking the object.... which by their memory location... are not the same...
         */

        /*
         SO! why use equals() at all??? predominantly we would use it for Strings due to the string pool
         remember that in the string pool if we find a string of the same value we reference if compared them

         however, if they're a string object
         */
        String string1 = new String("test");
        String string2 = new String("test");
        System.out.println(string1 == string2); // this will return false as they're being checked for their reference value not their actual value
        System.out.println(string1.equals(string2)); // this is true as we're checking their values

    }
}