import java.util.ArrayList;

public class Person {
  public static int instanceCount;
  public int localCount;

  public Person() {
    instanceCount++;
    localCount++;
    ArrayList grade = new ArrayList();
    grade.add(20);
    grade.add("Hello");
    grade.add(0.05);
    grade.add('"');
    grade.add(0x00);
    System.out.println(grade.get(2));
    System.out.println(grade.size());
  }
}
