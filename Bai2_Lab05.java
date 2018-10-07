package com.company;

//3 quan he thua ke
    class Shape{
        public String color;
        public boolean filled;
        public Shape(){
            this.color="red";
            this.filled=true;
        }
        /*constructor*/
        public Shape(String color,boolean filled){
            this.color=color;
            this.filled=filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }
        public String toString()
        {
            return getColor()+"\t"+isFilled();
        }
    }

    class Circle extends Shape{
        public double radius;

        public Circle() {
            this.radius=1.0;
        }
        public Circle(double radius){
            this.radius=radius;
        }
        /*constructor*/
        public Circle(double radius,String color,boolean filled)
        {
            this.radius=radius;
            this.radius=radius;
            super.setColor(color);
            super.setFilled(filled);
            //new Shape(getColor(),isFilled());
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea(){
            return 3.14*getRadius()*getRadius();
        }
        public double getPerimeter(){
            return 2*3.14*this.radius;
        }
        public String toString()
        {
            return radius + "\t" + super.toString();
        }
    }
    class Rectangle extends Shape{
        public double width;
        public double length;
        public Rectangle(){
            this.width=1.0;
            this.length=1.0;
        }
        public Rectangle(double width,double length){
            this.width=width;
            this.length=length;
        }
        public Rectangle(double width,double length,String color,boolean filled){
            super(color, filled);       //tham chiếu trực tiếp đến biến instance của lớp cha.
            this.width=width;
            this.length=length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea(){
            return width*length;
        }
        public double getPerimeter(){
            return 2*(width*length);
        }
        public String toString(){
            return width + "\t" + length + "\t" + super.toString();
        }
    }

    class Square extends Rectangle {
        public Square() {
            super();
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public double getSide() {
            return super.getWidth();
        }

        public void setSide(double side) {
            width = side;
            length = side;
        }

        public void setWidth(double side) {
            setSide(side);
        }

        public void setLength(double side) {
            setSide(side);
        }

        @Override           //ghi de phuong thuc
        public String toString() {
            return width + "\t" + super.toString();
        }
    }
    public class Bai2_Lab05 {
        public static void main(String[] args) {
                Circle c1 = new Circle(3);
                System.out.println(c1);
                System.out.println("The color of circle : " + c1.getColor());
                System.out.println("The filled of circle : " + c1.isFilled());
                System.out.println("The radius of circle : " + c1.getRadius());
                System.out.println("The area of circle : " + c1.getArea());
                System.out.println("The perimeter of circle : " + c1.getPerimeter()+"\n");
                Rectangle r1 = new Rectangle(8.3, 10.2);
                System.out.println(r1);
                System.out.println("The color of rectangle : " + r1.getColor());
                System.out.println("The filled of rectangle : " + r1.isFilled());
                System.out.println("The width of rectangle : " + r1.getWidth());
                System.out.println("The length of rectangle : " + r1.getLength());
                System.out.println("The area of rectangle " + r1.getArea());
                System.out.println("The perimeter of rectangle " + r1.getPerimeter()+"\n");
                Square s1 = new Square(3.5);
                System.out.println(s1);
                System.out.println("The color of squape : " + s1.getColor());
                System.out.println("The filled of squape : " + s1.isFilled());
                System.out.println("The side of squape : " + s1.getWidth());
                System.out.println("The area of squape : " + s1.getArea());
                System.out.println("The perimeter of squape : " + s1.getPerimeter());

        }
    }

