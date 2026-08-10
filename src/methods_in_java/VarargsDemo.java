package methods_in_java;

/*
 =========================================================================================
                                     VARARGS IN JAVA
 =========================================================================================

 1. WHAT IS VARARGS?
    - Varargs stands for "Variable Arguments".
    - Introduced in Java 5, it allows a method to accept a zero or multiple arguments of the
      same type using a single parameter, eliminating the need for overloaded methods or array creation.
    - Syntax: `dataType... variableName` (e.g., `int... numbers` or `String... names`).
    - Under the Hood: Java compiler automatically translates varargs into an array of that
      type (`dataType[]`) behind the scenes.

 -----------------------------------------------------------------------------------------

 2. RULES & CONSTRAINTS FOR PLACEMENT & INTERVIEWS
    - RULE 1 (Position): Varargs MUST always be the LAST parameter in a method signature.
      - Valid:   `public void display(String msg, int... numbers)`
      - Invalid: `public void display(int... numbers, String msg)` -> Compile-time error!
    - RULE 2 (Count): A method can have AT MOST ONE varargs parameter.
      - Invalid: `public void test(int... a, String... b)` -> Compile-time error!

 -----------------------------------------------------------------------------------------

 3. HOW VARARGS WORKS UNDER THE HOOD (COMPILER MAGIC)
    - When you call a varargs method with discrete values (e.g., `sum(1, 2, 3)`), the compiler
      transparently converts it into an array allocation: `sum(new int[] {1, 2, 3})`.
    - This means you can pass:
      1. Zero arguments: `sum()` (creates an empty array of length 0).
      2. Multiple discrete arguments: `sum(10, 20, 30)`.
      3. An explicit array directly: `sum(new int[] {1, 2, 3})`.

 -----------------------------------------------------------------------------------------

 4. INTERVIEW TRAPS & OVERLOADING AMBIGUITY
    - TRAP 1 (Ambiguity with Overloading):
      If you overload a method with a fixed-argument version and a varargs version, Java
      prioritizes the fixed-argument version for exact matches. However, if multiple varargs
      or loose matching occurs, it can lead to a compiler error due to ambiguity.
    - TRAP 2 (Null Passing):
      Passing `null` to a varargs method can cause ambiguity if multiple overloaded methods
      can accept `null` (e.g., object types vs. varargs).
    - TRAP 3 (Performance):
      Every time a varargs method is invoked with discrete arguments, a new array object is
      implicitly created on the heap. Heavy calls in tight loops can cause unnecessary
      garbage collection overhead.

 =========================================================================================
                                   CODE IMPLEMENTATION
 =========================================================================================
*/

public class VarargsDemo {

    // 1. BASIC VARARGS METHOD
    // Can accept 0, 1, or many integers
    public static void printNumbers(int... numbers) {
        System.out.println("Total arguments passed: " + numbers.length);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 2. MIXING REGULAR PARAMETERS WITH VARARGS
    // Rule check: Varargs 'names' is strictly at the end.
    public static void printDetails(String prefix, String... names) {
        System.out.println("Prefix: " + prefix);
        for (String name : names) {
            System.out.println(" - " + name);
        }
    }

    // 3. OVERLOADING WITH VARARGS (Interview Favorite)
    public static void display(int a) {
        System.out.println("Fixed single argument method called: " + a);
    }

    public static void display(int... a) {
        System.out.println("Varargs method called with length: " + a.length);
    }

    public static void main(String[] args) {

        // Calling basic varargs with different argument counts
        printNumbers();          // 0 arguments (creates empty array)
        printNumbers(5);         // 1 argument
        printNumbers(1, 2, 3, 4); // Multiple arguments

        // Passing an explicit array directly
        int[] explicitArray = {10, 20, 30};
        printNumbers(explicitArray);

        // Calling mixed parameter varargs method
        printDetails("Student Roster:", "Alice", "Bob", "Charlie");

        // Resolution behavior in overloading:
        display(10); // Matches the fixed-argument 'display(int a)' first!
        display(10, 20, 30); // Falls back to varargs version because no fixed-arg matches 2 params.
    }
}