package exercise;

public class Chicken extends Animal{
    int so_chan = 2;
    Chicken(){
        System.out.println("Chicken created");
    }

    Chicken(String name){
        super();
        this.name=name;
        System.out.println("Chicken with name created");
    }

    @Override
    void run(){
        System.out.println("chicken run");
    }

    @Override
    void test()  throws ArithmeticException{
        throw  new ArithmeticException("123");
    }
}
