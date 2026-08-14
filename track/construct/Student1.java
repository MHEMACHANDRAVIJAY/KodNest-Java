public class Student1 {
    String name;
    int age;
    double height;
    void input(String n, int a, double h){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
public class StudentApplication{
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.input("Rani", 20, 5.9);
        s1.display();
    }
}
