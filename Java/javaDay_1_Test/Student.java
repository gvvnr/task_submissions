import java.util.Objects;

public class Student {
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int hashVal=5;
        hashVal+=name.hashCode()*12;

        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Student s=new Student(1,"vamsi");
        Student s1=new Student(1,"vamsi");
        System.out.println(s1.equals(s));
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

    }
}
