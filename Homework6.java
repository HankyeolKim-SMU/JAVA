class Course{
    protected String code;
    protected String name;

    public Course(String a, String b){
        code = a;
        name = b;
    }
    protected String getCode() { return code; }
    protected String getName() { return name; }
}

class OnlineCourse extends Course{
    public OnlineCourse(String c, String n){
        super(c, n);
    }

    @Override
    public String toString(){
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

class OfflineCourse extends Course{
    public OfflineCourse(String c, String n){
        super(c,n);
    }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}