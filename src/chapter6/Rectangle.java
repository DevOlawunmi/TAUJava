package chapter6;
/*
This is the shell of a Rectangle object.
Every rect obj will have length and breadth
And you can calculate the area and perimeter of the objs created.
 */
public class Rectangle {
    double length;
    double breadth;

    public double calculateArea(){
        return length*breadth;
    }
    public double calculatePerimeter(){
        return (2*length)+ (2*breadth);
    }
// I've written these methods but how are we going to set the length and breadth of objects created?
    //This is where getters and setters come in


        public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getBreadth() {
        return breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
