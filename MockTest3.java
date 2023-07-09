    {// Question no.. 1....
    // interface of animal with make sound method and it's subclass are implementing it to make sound....
    interface Animal{
        public void makeSound();
    }
    class Dog implements Animal{
        public void makeSound(){
            System.out.println("I am Dog .. Bark..Bark");
        }
    }
    class Cat implements Animal{
        public void makeSound(){
            System.out.println("I am a Cat ... meow.. meoww");
        }
    }
    class Cow implements Animal{
        public void makeSound(){
            System.out.println("I am a Cow, boo.. booo");
        }
    }

    // Question ..2..........
    // creating has - a relationship by performing runtime polymorphism and interface......
    interface Shape{
        public double calculateArea();
    }

    class Rectangle implements Shape{
        private double length;
        private double width;
        public Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }
        @Override
        public double calculateArea(){
            return length * width;
        }

    }
    class Circle implements Shape{
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }
        @Override
        public double calculateArea(){
            return (3.14 * ( radius * radius));
        }
    }
    class Triangle implements Shape{
        private double height;
        private double base;
        public Triangle(double height, double base){
            this.height = height;
            this.base = base;
        }
        @Override
        public double calculateArea(){
            return ((height* base)/2);
        }
    }

    class ShapeCalculator{
        public void printArea(Shape shape){
            System.out.println("The area is :: " +shape.calculateArea());
        }
    }

    // Question.. no.. 3.....
    // performing Encapsulation....
    class Person{
        private String name;
        private int age;
        private String address;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
    }

    // Question no.. 4.. 
    // creating an interface of drawable
    interface Drawable{
        public void draw();
    }
    class Circle1 implements Drawable{
        public void draw(){
            System.out.println("Hey, there I am a Circle!!!!!!!!!!!");
        }
    }
    class Rectangle1 implements Drawable{
        public void draw(){
            System.out.println("Hey, there I am a retangle!!!!!!!!!!!");

        }
    }
    public class MockTest3 {
        public static void main(String args[]){
            Rectangle rec = new Rectangle(4,5);
        Circle circle = new Circle(4.5);
        Triangle tri = new Triangle(6,4);
        ShapeCalculator shape = new ShapeCalculator();
        shape.printArea(rec);
        shape.printArea(circle);
        shape.printArea(tri);
        
        }
        
    }
}