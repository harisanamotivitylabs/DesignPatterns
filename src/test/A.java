package test;

public interface A {
    void m1();
    void m2();

    public static void main(String[] args) {
        A a=new C();
        a.m1();
        a.m2();
      ((C)a).m3();
         }

}
abstract class B implements A{
    public void m1(){
        System.out.println("m1 fdhjkd");
    }
}
class C extends B{

    public void m3(){
        System.out.println("m3 dfgdsuhjdk");
    }
    @Override
    public void m2() {
        System.out.println("m2 bhgdmsk,aaaaa");
    }
}