package DAY3;

public class studentMap {

    private String name;
    private int age;

    studentMap(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean DisplayData(){
        System.out.print(name+" ");
        System.out.println(age);
        return true;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
