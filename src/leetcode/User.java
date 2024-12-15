package leetcode;
public class User {
   protected User(){}

    private String privateField = "private";
    String defaultField = "default";
    protected String protectedField = "protected";
    public String publicField = "public";

    public void setPublicField(String publicField) {
        this.publicField = publicField;
        System.out.println(publicField);//her yerden deyisme
    }

    public void printFields() {
        System.out.println(privateField);
        System.out.println(defaultField);
        System.out.println(protectedField);
        System.out.println(publicField);
    }
}

class Another{
    public void printFields(){
        User u=new User();
//        System.out.println(u.privateField);
        System.out.println(u.defaultField);
        System.out.println(u.protectedField);
        System.out.println(u.publicField);


    }


}








//    public String name;
//    private String surname;
//
//    public String getName(){
//        return name;
//
//    }
//    public void setName(String name){
//        this.name=name;
//
//    }
//    public String getSurname(){
//        return surname;
//    }
//    public void setSurname(String surname){
//        this.surname=surname;
//
//    }











//package leetcode;
//
//public class User {
//string package-
//    String name;
//    String surname;
//}
//alt+insert
//static int minAge=12;
//
//    String name;
//
//    int age=15;   //default deyer=0
//
//    static {
//        System.out.println("Static Initializer");
//        minAge=14;
//
//    }
//
//    {
//        System.out.println("Instance Initializer");
//        minAge=18;
//        name="John";
//        age=18;
//
//    }
//
//    public User(){
//        System.out.println("Default Constructor");
//    }
//    public User(String name,int a){ //constructor
//        System.out.println("Custom Constructor ");
//        this.name=name;
//        this.age=a;
//
//
//    }
//
//}


