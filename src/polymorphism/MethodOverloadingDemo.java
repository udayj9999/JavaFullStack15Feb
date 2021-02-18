package polymorphism;

public class MethodOverloadingDemo {
    private void show(int i){
        System.out.println("hello");
    }


    public static void main(String[] args) {
        MethodOverloadingDemo demo=new  MethodOverloadingDemo();
        demo.show(6);
    }
}