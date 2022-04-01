/*
 * ví dụ về tham chiếu(Reference Type) và tham trị(Biến local, Primitive Type):
 *
 * int a = 1 -> tham trị
 *
 * String a = "Hello" -> tham chiếu
 *
 * Khi tham chiếu vào 1 đối tượng: Nghĩa là khi có 1 biến chứa giá trị tham chiếu, thì giá trị tham chiếu đó sẽ
 * tham chiếu đến 1 đối tượng trong bộ nhớ heap, giá trị tham chiếu đó là địa chỉ ô nhớ vd như 0x11.
 *
 * */

public class Sample {

  //value type | primitive type
  public static void updateAge(int age) {
    age += 1; //Khi thay đổi giá trị thành 11, nó chỉ nằm ở bộ nhớ stack
  }

  //reference type
  public static void updateAge(Student pStudent) {
    pStudent.age += 1; //Khi thay đổi thành giá trị 11, nó nằm ở bộ nhớ heap
  }

  public static void updateAge(Student pStudent, int newAge) {
    Student newStudent = new Student(pStudent.name, newAge);
    pStudent = newStudent; //Gán newStudent vào pStudent, tức là gán name:Thịnh và age:20 vào pStudent
    System.out.println(pStudent);
  }

  public static void main(String[] args) {
    Student student = new Student("Thinh", 10);

//    updateAge(student.age);
//    System.out.println(student);
//
//    updateAge(student);
//    System.out.println(student);

    updateAge(student, 20);
    System.out.println(student);
  }
}
