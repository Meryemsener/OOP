package nisan15inheritance;

public class Mammal extends Animal{
    public static void main(String[] args) {
        Mammal om=new Mammal();
       om.drink();//methodlar static olduklari icin niye obj kullaniyorsun. Klass ile cagir diyor.
                    // ama bu sekidle de cagrilabilirler
       om.eat();;
       om.feed();

    }
    public void feed() {
        System.out.println("yavrularini beslerler");

    }
}
