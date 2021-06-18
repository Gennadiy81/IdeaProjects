package homeWork.Jun15_inheritance_hiding;

class  ClassAA {

    public static void methodQ(){
        System.out.println("Parent");
    }
    public void methodQa(){
        methodQ();
        System.out.println("Parent A");
    }
}

 class ClassBB extends ClassAA{
    public static void methodQ(){
        System.out.println("Child");
    }

    public void methodQq(){
       // methodQ();
        System.out.println("Child A");
    }

    @Override
     public void methodQa(){
        super.methodQa();
        methodQ();
        System.out.println("Overriding method Qa");
    }
}

class Test{
    public static void main(String[] args) {
        ClassAA a = new ClassAA();
        ClassBB b = new ClassBB();
        a.methodQa();
        b.methodQq();
        b.methodQa();
        ClassAA.methodQ();

    }
}