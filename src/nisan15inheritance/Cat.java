package nisan15inheritance;

public class Cat extends Mammal{
    public static void main(String[] args) {
        Cat oc=new Cat();
        oc.eat();
        oc.drink();
        oc.feed();
        oc.meow();
        oc.clean();

    }
    public void meow(){
        System.out.println("miyavlarlar");
    }
    public void clean(){
        System.out.println("temizenirler");
    }
}
