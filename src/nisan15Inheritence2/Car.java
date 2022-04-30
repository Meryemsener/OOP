package nisan15Inheritence2;

public class Car extends Vehicle{

    /*
    super() ile parentsten constructor cagirirken parametrelere dikkat edin.
    Parent class'ta olmayan bir constructor'i super() ile cagirirsaniz
    CTE alirsiniz
    super() contructor un ilk satirinda ve bir defa kullanilir
    this() de super () gibi ilk satirda ve bir defa kullanilir. Ikisi ayni a
    anda kullanilmaz
     */
    public Car(){
        super(2);//vehicle
        System.out.println("Car");//car
    }
    public Car(String name){
       this();//bu classtaki constructorlari cagirmak  icin kullanilir
        System.out.println("Car");//car
    }
    public static void main(String[] args) {

        Car car = new Car("Honda");
    }
}
