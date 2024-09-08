public class Animal2 {
    Animal2(){
        System.out.println("animal is created");
    }
}
class Dog2 extends Animal2{
    Dog2(){
      super();
      System.out.println("dog is created");
    }
}
class test{
    public static void main(String[] args) {
        Dog2 d=new Dog2();
    }
}
