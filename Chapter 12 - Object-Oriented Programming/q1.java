class Greet{
    public static void display(){
        System.out.println("HI");
    }
    public void print(){
        System.out.println("HELLO");
    }
}




public class q1 {
    public static void main(String[] args) {
        Greet obj1 = new Greet();
        obj1.display();
        obj1.print();
        Greet.display();
    }
    
}
