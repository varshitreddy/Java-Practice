package DAY3;
//this is to use Encapsualtion in classes
public class student {
    private String name;
    private int age;
    private int cnt = 0;
    private final int stdId;

    student(String name,int age){
        this.name = name;
        this.age = age;
        this.stdId = ++cnt;

    }
    public int getId(){
        return stdId;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean DisplayData(){
        System.out.print(stdId+" ");
        System.out.print(name+" ");
        System.out.println(age);
        return true;
    }
}



//NOTES
// PRIVATE -> ACCESSIBLE ONLY INSIDE CLASS
// FINAL -> BECOMES CONSTANT ONCE ASSIGNED CANT BE CHANGED

