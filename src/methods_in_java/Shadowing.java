package methods_in_java;

public class Shadowing {
    static int a = 300;

    public static void main(String[] args) {
        int a=55;
        System.out.println("the value of a is the case of shadowing:-"+a);

    }

}
/*
 =========================================================================================
                                VARIABLE SHADOWING IN JAVA
 =========================================================================================

 1. WHAT IS VARIABLE SHADOWING?
    - Shadowing occurs when a variable declared in an inner/local scope (like a method or block)
      has the EXACT SAME NAME as a variable declared in an outer/enclosing scope (like a class field).
    - The local variable "shadows" (hides) the outer variable within that specific inner scope.
    - Inside that scope, accessing the variable name evaluates to the LOCAL variable, NOT the class field.

 -----------------------------------------------------------------------------------------

 2. WHY IS SHADOWING IMPORTANT FOR PLACEMENT & INTERVIEWS?
    - TRAP 1: Forgetting that local variables mask class fields without throwing a compilation error.
    - TRAP 2: Assigning a parameter to itself in constructors/methods (e.g., `x = x;`) instead
      of assigning it to the instance field (`this.x = x;`), leaving the instance field uninitialized.
    - TRAP 3: Local vs. Local Shadowing is NOT allowed. You cannot shadow a local variable with
      another local variable in a nested block within the same method.

 -----------------------------------------------------------------------------------------

 3. HOW TO BYPASS / RESOLVE SHADOWING?
    - For Instance Variables: Use the `this` keyword -> `this.variableName`
    - For Static Variables: Use the Class Name -> `ClassName.variableName`

 =========================================================================================
*/

/*public class Scoping {

    // 1. CLASS SCOPE FIELDS
    static int num = 100;      // Static field
    int value = 500;           // Instance field

    public static void man(String[] abcd) {
        // SHADOWING STATIC FIELD:
        // Local variable 'num' shadows the static field 'num'
        int num = 10;

        System.out.println("Local 'num' in man(): " + num);             // Output: 10
        System.out.println("Static 'num' via Class: " + Scoping.num);   // Output: 100 (Bypasses shadowing)
    }

    public static void main(String[] args) {

        // Calling man() to demonstrate static shadowing
        man(args);

        // Instantiating to demonstrate instance variable shadowing
        Scoping obj = new Scoping();
        obj.demonstrateInstanceShadowing(999);

        System.out.println("Instance 'value' after method call: " + obj.value); // Still 500!
    }

    // Method demonstrating instance field shadowing & constructor assignment pitfall
    public void demonstrateInstanceShadowing(int value) {

        // INTERVIEW PITFALL:
        // The parameter 'value' shadows the instance field 'value'.
        // Doing this ONLY assigns the parameter to itself (does nothing to class field):
        value = value;

        System.out.println("Local parameter 'value': " + value);        // Output: 999
        System.out.println("Instance 'value' via 'this': " + this.value); // Output: 500

        // CORRECT WAY to update instance field when shadowed:
        this.value = value;
    }

    /*
     -------------------------------------------------------------------------------------
     INTERVIEW CORNER CASE: NESTED BLOCK SHADOWING IS AN ERROR IN JAVA
     -------------------------------------------------------------------------------------

     public void invalidShadowingExample() {
         int x = 50;
         if (x > 10) {
             // COMPILE ERROR: Variable 'x' is already defined in the scope!
             // Java DOES NOT allow local-to-local variable shadowing in nested blocks.
             // int x = 20;
         }
     }
    */