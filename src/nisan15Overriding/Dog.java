package nisan15Overriding;

public class Dog extends Animal{
    public static void main(String[] args) {

        //parentstaki veriyi alip onun body kismindakileri degistirme islemine
        //overriding denir

        Dog dog=new Dog();
        dog.sound();

    }
    public void sound(){
        System.out.println("havlarlar");
    }
}
