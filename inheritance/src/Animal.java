public class Animal {
    String name;
    int age;
    void makesound(){
        System.out.println("animal makes sounds");
    }
}
class dog extends Animal{
    void bark()
    {
        System.out.println("dog barks");
    }
}
class cat extends Animal{
    void meow()
    {
        System.out.println("cat meows");
    }
}
class bird extends Animal{
    void chirps()
    {
        System.out.println("bird chirps");
    }
}
   class main{
    public static void main(String[]args)
    {
        dog animal1=new dog();
        animal1.makesound();
        animal1.bark();

        cat animal2=new cat();
        animal2.makesound();
        animal2.meow();

        bird animal3=new bird();
        animal3.makesound();
        animal3.chirps();

    }
}
