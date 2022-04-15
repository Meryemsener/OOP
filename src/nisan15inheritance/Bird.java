package nisan15inheritance;

public class Bird extends Animal {
    public static void main(String[] args) {
        Bird ob = new Bird();
        ob.fly();
        ob.eat();
        ob.drink();


    }
    public void fly(){
        System.out.println("ucarlar");
    }
}
