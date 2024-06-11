//
// In java 8 introduce defualt and static methods ...

// You can add new methods to an existing interface without breaking the class that implement those interfaces 

// Lets see how we can define the static and defual methods in interfacess

interface  Myinterface{
    void myname();

    // adding defualt method to interface 

   default void myage(){
    System.out.println("My age is greter than your grandpa ...!");
   }


   // Adding static method in interface 
   static void  mylanguage(){
    System.out.println("KANNADA.....");
   }

}

// Lets access them ...and the class doent implimented these methods..
class Myclass implements Myinterface{

    @Override
    public void myname(){
        System.out.println("My name is khaja ameen ..");
    }

    Myclass obj = new Myclass();

    obj.myname();
    
    obj.myage();

    Myinterface.mylanguage();
    

}