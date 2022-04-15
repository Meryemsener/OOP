package nisan15inheritance;

public class Dog extends Mammal {
    public static void main(String[] args) {
        Dog od=new Dog();
        od.eat();
        od.drink();
        od.smell();
        od.bark();
        od.feed();
    }
    public void bark(){
        System.out.println("havlarlar");
    }
    public void smell(){
        System.out.println("iyi koku alirlar");
    }
}
