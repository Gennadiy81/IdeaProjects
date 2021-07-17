package homeWork.objectCastingPractice;

 public class Animal {
     int num = 1;
     public void walking(){
                 System.out.println("Animal moves");
    }
}

 class Cat extends Animal{
     int num = 2;
            public void run(){
                System.out.println("Cat can run");
    }
    public void mau(){
        System.out.println("Cat says mau");
    }

}
 class FourLegs extends Cat{
            public void swim(){
                System.out.println("Fish can swim");
    }
}
 class TestAnimal{
     public static void main(String[] args) {
         Animal animal = new Animal();
         Cat cat1 = new Cat();
         Cat cat2 = (Cat) animal;
         cat2.run();
         ((Cat)animal).run();



//         Animal animal1 = new Animal();
//        Cat cat = new Cat();
//
//         cat = (Cat) animal1;
//         boolean result = animal instanceof Cat;
//         System.out.println(result);
//
//         FourLegs fourLegs = new FourLegs();
//         fourLegs.walking();



          }

}
