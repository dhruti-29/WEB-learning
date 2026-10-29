/* A static method belongs to the class and can be called without creating an object.
 No Object need
*/

public class Static_Method {
 
static int sum(int a , int b){
    return a + b;
}

static int sub(int a , int b){
    return a - b;
}
static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
    
public static void main(String[] s){

    int a = 10;
    int b = 2;

    System.out.println("addition : " + Static_Method.sum(a,b));
     System.out.println("addition : " + Static_Method.sub(a,b));
      System.out.println("addition : " + Static_Method.divide(a,b));

}

}
