package basics.datatypes.strings;

public class StringBasics {

    // There are two was to create a string
    // first by using the 'new' keyword like below
    String newString = new String("I am a new string object");
    // and secondly a string literal
    String literalString = "I am a string literal";

    /*
    We will mostly be using string literals as they are managed in a particular way by the JVM.

    This special area of memory is responsible for storing strings created using a string literal. This is known as interning.

    When a new string is created using a literal, the pool is checked to see if an identical string already exists. If it does, then the new variable points to the string already in the pool, hence saving memory.
    */




}
