import java.util.Arrays;
import java.util.Comparator;

public class Comparator_student {
    String name;
    char id;
    int age;

    public  Comparator_student(String name,char id,int age){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static class dowmComparator implements Comparator<Comparator_student>
    {
        @Override
        public int compare(Comparator_student t1, Comparator_student t2) {
            return t2.age-t1.age;
        }
    }

    @Override
    public String toString() {
        return "name:"+this.name+"id"+this.id+"age"+this.age;
    }
}
