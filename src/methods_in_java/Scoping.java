package methods_in_java;

/*
 =========================================================================================
                                     SCOPE IN JAVA
 =========================================================================================

 1. WHAT IS SCOPE?
    - Scope refers to the accessibility, lifetime, and visibility of variables, methods,
      and objects in a program.
    - Rule: A variable in Java is only accessible within the block/region where it is declared.

 -----------------------------------------------------------------------------------------

 2. TYPES OF SCOPE (WITH REFERENCE TO THIS FILE)

    A. CLASS LEVEL SCOPE (Instance & Static Fields)
       - Declared directly inside `public class Scoping`, outside any methods.
       - Accessible by methods within the class depending on static/instance rules.
       - Static fields are accessible by `main`, `man`, or any other static method.
       - Instance fields require an object of `Scoping` to be accessed inside static methods.

    B. METHOD LEVEL SCOPE (Local Variables & Parameters)
       - Variables declared inside methods like `man()` or `main()`, including parameters.
       - Examples:
         * `abcd` in `man(String[] abcd)` is accessible ONLY inside the `man()` method.
         * `args` in `main(String[] args)` is accessible ONLY inside the `main()` method.
       - Lifetime: Stack frame allocation on method call; destroyed when method completes.
       - Critical Interview Point: Local variables DO NOT get default values and MUST
         be initialized before use.

    C. BLOCK SCOPE
       - Code enclosed inside `{ ... }` within a method.
       - Variables declared inside a block are lost as soon as execution crosses the
         closing brace `}`.

    D. LOOP SCOPE
       - Loop variables (e.g., `for (int i = 0; ...)`) are scoped strictly to the loop.

 =========================================================================================
                           PLACEMENT & INTERVIEW TRAPS & CORNER CASES
 =========================================================================================

 1. METHOD PARAMETERS ARE LOCAL TO THEIR RESPECTIVE METHODS
    - `abcd` exists only when `man()` is executed.
    - `args` exists only when `main()` is executed.
    - `main` cannot access `abcd`, and `man` cannot access `args`.

 2. NO NESTED RE-DECLARATION
    - You cannot declare a variable with the same name inside an inner block if it's
      already defined in the enclosing method scope.

 3. SHADOWING
    - If a local variable inside `main()` or `man()` has the same name as a class-level
      static/instance variable, the local variable takes precedence (shadows the class variable).
      Use `Scoping.variableName` or `this.variableName` to bypass shadowing.

 4. MEMORY ALLOCATION
    - Local variables reside on the STACK frame of that method execution.
    - Instance variables reside on the HEAP (inside the object).
    - Static variables reside in the Metaspace/Class static area.

 =========================================================================================
*/

public class Scoping {

    // 1. CLASS SCOPE (Static Variable - shared across all methods)
    static int classStaticVar = 100;

    // 1. CLASS SCOPE (Instance Variable - requires object instantiation)
    int classInstanceVar = 200;

    // Custom method to demonstrate scope
    public static void man(String[] abcd) {
        // 'abcd' has METHOD SCOPE within man()

        int manLocalVar = 10; // LOCAL VARIABLE (METHOD SCOPE)

        if (manLocalVar > 5) {
            // 3. BLOCK SCOPE
            int blockVar = 50;

            // Outer method variables are accessible here
            System.out.println(manLocalVar); // Accessible
            System.out.println(blockVar);    // Accessible
            System.out.println(classStaticVar); // Accessible
        }

        // System.out.println(blockVar); // COMPILE ERROR: blockVar out of scope here!
        // System.out.println(args);    // COMPILE ERROR: 'args' belongs to main(), not man()!
    }

    // JVM Entry point
    public static void main(String[] args) {
        // 'args' has METHOD SCOPE within main()

        int mainLocalVar = 20; // LOCAL VARIABLE (METHOD SCOPE)

        // Local variables MUST be initialized before use
        int unassignedVar;
        // System.out.println(unassignedVar); // COMPILE ERROR: Variable might not have been initialized

        // 4. LOOP SCOPE
        for (int i = 0; i < 3; i++) {
            System.out.println(i); // 'i' is only accessible inside this loop
        }
        // System.out.println(i); // COMPILE ERROR: 'i' cannot be resolved to a variable

        // System.out.println(manLocalVar); // COMPILE ERROR: 'manLocalVar' belongs to man()!
        // System.out.println(abcd);        // COMPILE ERROR: 'abcd' belongs to man()!

        // Accessing Class-level members
        System.out.println(classStaticVar); // Direct access allowed (static)

        Scoping obj = new Scoping();
        System.out.println(obj.classInstanceVar); // Needs object reference in static context
    }
}