package basics.datatypes.primitives_and_objects;

import org.w3c.dom.ls.LSOutput;

public class CastingAndObjects {
    /*
        We have looked into primitive data types that have direct access to memory
        primitives have no methods as they are not an Object. However each data type
        does have a corresponding Object also known as a wrapper class.
     */

    public Integer anIntegerObject = 4;
    // if you uncomment the below code and use a full stop afterwards you will see
    // when using a full stop directly afterwards
    //***Uncomment section 1 below for an example***

    // CASTING
    // There may be times when you need to 'cast' a particular data type into another

    // Widening casting as when you take a smaller data type into a larger data type
    // below we are taking a 32 bit int and casting to a 64 bit double
    public int anInt = 5;
    public double aDouble = anInt;

    // narrow casting is the reverse in taking a larger data type into a smaller
    // you will see when narrow casting we ust manually add the type in the parenthesis below
    public double anotherDouble = 43.324324235;
    public byte aByte = (byte) anotherDouble;

    // you must be EXTREMELY careful when casting, especially narrow casting as it can change the
    // size of your data. uncomment the print statement in section 2 to see how
    // taking a double number to a byte will round down...

    public static void main(String[] args) {
        CastingAndObjects castingAndObjects = new CastingAndObjects();
//        ***section 1***
//        System.out.println(castingAndObjects.anIntegerObject.byteValue());
//
//        ***section 2***
//        System.out.println(castingAndObjects.aByte);



    }


}
