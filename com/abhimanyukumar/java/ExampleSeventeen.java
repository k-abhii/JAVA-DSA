package com.abhimanyukumar.java;

public class ExampleSeventeen {
  int x=10;
  int y=20;
  // Static Varable 
  static int z=30;
  //Static Method
  public static void show(){
      System.out.println("Hello Students !!");
  }
  public static void main(String[] args) {
      ExampleSeventeen exampleseventeen = new ExampleSeventeen();
      System.out.println(" X : "+exampleseventeen.x);// object.varablename
      System.out.println(" Y :"+exampleseventeen.y);//object.variablename
      System.out.println(" Z :-->"+z++);//Not required to acess using object variable 
      System.out.println(" z : "+ExampleSeventeen.z);//className.variable or method name
    //exampleseventeen.show();
    show();//Direct calling method not required to object.methodname  
  
    }

}
