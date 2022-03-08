package com.abhimanyukumar.java;

class Rectangle {
    int length;
    int width;

Rectangle(){

}
Rectangle(int length, int width){
    // length =x
    // width = y
    this.length =  length;
    this.width = width;
}
Rectangle(int length){
    // length = x;
    // width =y;
    this.length=length;
    this.width=length;
}
int rectArea() {
    return length*width;
}
}
public class ExampleSixteen {
    public static void main(String[] args) {
       // Rectangle rectangle1 = new Rectangle();
        //Rectangle rectangle=new Rectangle(10,20);
        Rectangle rectangle = new Rectangle(10);
        int area = rectangle.rectArea();
        System.out.println(" Area : "+area);
    
    
    }
}
