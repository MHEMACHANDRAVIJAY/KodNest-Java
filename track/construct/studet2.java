public class Student {
    String name;
    int age;
    double height;
    void input(String n, int a, double h){
        this.name = n;
        this.age = a;
        this.height = h;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
public class StudentApplication{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("Raja", 18, 5.5);
        s1.display();
    }
}
