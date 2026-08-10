package methods_in_java;

/*
 =========================================================================================
                                METHOD OVERLOADING IN JAVA
 =========================================================================================

 1. WHAT IS METHOD OVERLOADING?
    - Method Overloading occurs when a class has multiple methods with the SAME NAME but
      DIFFERENT PARAMETER LISTS (method signatures).
    - It is a prime example of Compile-Time Polymorphism (Static Polymorphism or Early Binding).
    - Decision on which method to call is made by the compiler at compile time based on
      argument count, types, and sequence.

 -----------------------------------------------------------------------------------------

 2. RULES FOR METHOD OVERLOADING (PLACEMENT & INTERVIEW CRITERIA)
    To successfully overload a method, the method signature MUST change in at least ONE
    of the following ways:

    A. Number of parameters:
       - `add(int a, int b)` vs `add(int a, int b, int c)`
    B. Data types of parameters:
       - `add(int a, int b)` vs `add(double a, double b)`
    C. Sequence/Order of parameters:
       - `display(int a, String b)` vs `display(String b, int a)`

 -----------------------------------------------------------------------------------------

 3. WHAT DOES NOT CONSTITUTE METHOD OVERLOADING? (COMMON TRAPS)
    - RETURN TYPE ONLY: Changing ONLY the return type is NOT overloading!
      `int add(int a, int b)` vs `double add(int a, int b)` -> COMPILE-TIME ERROR!
    - ACCESS MODIFIERS: Changing public/private/static keywords alone does NOT overload.
    - PARAMETER NAMES: Changing argument variable names alone does NOT overload.
      `add(int x, int y)` vs `add(int a, int b)` -> COMPILE-TIME ERROR!

 -----------------------------------------------------------------------------------------

 4. CRITICAL INTERVIEW TRAPS & CORNER CASES

    TRAP 1: AUTOMATIC TYPE PROMOTION (TYPE WIDENING)
    - If an exact data type match is not found, Java automatically promotes the argument
      to the next larger data type in the promotion hierarchy:
      `byte` -> `short`/`char` -> `int` -> `long` -> `float` -> `double`
    - Calling `sum(10, 20)` (int, int) when only `sum(long, long)` exists will promote
      the ints to longs seamlessly.

    TRAP 2: AMBIGUITY DUE TO TYPE PROMOTION
    - Occurs when two overloaded methods can both accept promoted arguments equally.
    - Example:
      `void test(int a, double b)` and `void test(double a, int b)`
      Call: `test(10, 20)` -> COMPILE-TIME ERROR! (Ambiguous method call; both are valid).

    TRAP 3: OVERLOADING `main()` METHOD
    - CAN you overload the `main()` method in Java?
      YES! You can write multiple `main()` methods with different parameter lists.
      HOWEVER, the JVM will ONLY invoke `public static void main(String[] args)` as
      the application entry point. Other main methods must be explicitly called.

    TRAP 4: OVERLOADING WITH VARARGS (VARIABLE ARGUMENTS)
    - Fixed argument methods ALWAYS take precedence over Varargs methods.
    - If `test(int a)` and `test(int... a)` both exist, `test(5)` calls `test(int a)`.

    TRAP 5: NULL PASSING AMBIGUITY
    - If you overload `display(String s)` and `display(Integer i)` and call `display(null)`,
      it results in a compilation error because `null` fits both object references equally.

 =========================================================================================
*/

public class MethodOverloading {
    public static int manager(int counter,int worker){
        counter=counter+worker;
        return counter;
    }
    public static int manager(int managerial){
        managerial=managerial+22;
        return managerial;
    }
    public static void main(String[] args) {
        int a=55;
        int b=77;
        int result=manager(a,b);
        int result2=manager(a);
        System.out.println("the result of the first function is:-"+result);
        System.out.println("the result of the second function is:-"+result2);
    }

/*    // 1. OVERLOADING BY NUMBER OF PARAMETERS
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2. OVERLOADING BY DATA TYPE OF PARAMETERS
    public static double add(double a, double b) {
        return a + b;
    }

    // 3. OVERLOADING BY SEQUENCE OF PARAMETERS
    public static void display(int id, String name) {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void display(String name, int id) {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    // 4. AUTOMATIC TYPE PROMOTION DEMO
    public static void printVal(double d) {
        System.out.println("Double version called: " + d);
    }

    // 5. OVERLOADING WITH VARARGS (Fixed arg preferred over Varargs)
    public static void show(int a) {
        System.out.println("Fixed argument method called");
    }

    public static void show(int... a) {
        System.out.println("Varargs method called");
    }

    // 6. OVERLOADED main() METHOD (Fully valid in Java)
    public static void main(int number) {
        System.out.println("Overloaded main method called with int: " + number);
    }

    // Actual entry point invoked by JVM
    public static void main(String[] args) {

        // Basic Overloading Calls
        System.out.println(add(10, 20));          // Calls add(int, int)
        System.out.println(add(10, 20, 30));      // Calls add(int, int, int)
        System.out.println(add(10.5, 20.5));      // Calls add(double, double)

        display(101, "Alice");                    // Calls display(int, String)
        display("Bob", 102);                      // Calls display(String, int)

        // Automatic Type Promotion: '100' (int) is promoted to double
        printVal(100);

        // Fixed Arg vs Varargs: Fixed takes priority
        show(5);                                  // Calls show(int)
        show(5, 10, 15);                          // Calls show(int...)

        // Explicitly calling the overloaded main method
        main(500);*/
    }
