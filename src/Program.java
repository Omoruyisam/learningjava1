
interface Sexnimal {
    public void eat();
    public void sound();
   
}

class Cat implements Sexnimal{
    public void eat()
    {
        System.out.println("Yum Yum");
    }
    public void sound()
    {
        System.out.println("meow!");
    }
}
public class Program {
    public static void main(String[] args)
    {
        Cat omoh = new Cat();
        omoh.eat();
    }
}
