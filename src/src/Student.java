public class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    boolean DisplayData(){
        System.out.print(name+" ");
        System.out.println(age);
        return true;
    }
};


