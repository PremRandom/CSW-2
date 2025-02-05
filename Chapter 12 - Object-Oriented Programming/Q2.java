class Rectangle{
    int length;
    int breadth;

    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int area() {
        return this.length * this.breadth;
    }
    public int perimeter() {
        return 2*(this.length + this.breadth);
    }
}


public class Q2 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(10,20);
        System.out.println("Area = "+ obj1.area() + " & perimeter = "+ obj1.perimeter());
    }

    
}
