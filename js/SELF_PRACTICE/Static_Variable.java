class Static_Variable{

    static String a = "charusat";
    String name;
Static_Variable(String name) {
        this.name = name;
    }

    public static void main(String[] s){

        Static_Variable s1 = new  Static_Variable("dhruti");
         Static_Variable s2 = new  Static_Variable("drashti");

         System.out.println(s1.name + " college name is " +  Static_Variable.a);
System.out.println(s2.name +  " college name is " +  Static_Variable.a);

    }
}