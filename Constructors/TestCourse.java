import java.util.*;
public class TestCourse{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String c1 = sc.nextLine();
        Course course1 = new Course(n1,c1);
        String n2 = sc.nextLine();
        String c2 = sc.nextLine();
        Course course2 = new Course(n2,c2);
        System.out.printf("Courses:\n%s\n%s",course1.getCourse(),course2.getCourse());
        
    }
}