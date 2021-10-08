package exercise;

public class Animal {
    int so_chan = 4;
    String name = "";

    void run(){
        System.out.println("animal run");
    }

    Animal(){
        System.out.println("animal created");
    }

    Animal(String name){
        this();
        this.name=name;
        System.out.println("animal with name created");
    }

    void test() throws ArithmeticException{
        System.out.println(5/0);
    }



}
