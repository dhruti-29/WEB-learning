/* A static variable has only one common copy, which is shared by all objects of the class. */

public class Object_Counter {
    
    static int count;
    Object_Counter(){
        count++;
    }

    public static void main(String[] s){

 Object_Counter s1 = new Object_Counter();
 Object_Counter s2 = new Object_Counter();

 System.out.print("count : "  + Object_Counter.count);
/*  System.out.print("count : "  + s2.count);  
second method 
*/

    }
}
