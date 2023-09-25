package OOP_JAVA;

public class Student_Class {
  public static void main(String[] args) {
    Student s1 = new Student(1, "John", "CS", 89, 67, 88);
    System.out.println(s1.total_marks());
    System.out.println(s1.average_marks());
    System.out.println(s1.Grade());
    System.out.println(s1.toString());
  }
}
