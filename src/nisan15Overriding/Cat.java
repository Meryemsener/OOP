package nisan15Overriding;

public class Cat extends Animal{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sound();

    }
    public void sound(){
        System.out.println("miyavlarlar");
    }
}
/*
ayni methodu farkli bodylerle farkli class larda
kullanma islemine overriding denir
 */