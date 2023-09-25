package OOP_JAVA;

public class Student {
  private int roll;
  private String Name;
  private String Course;
  private int marks1, marks2, marks3;
  
  Student(int roll, String Name, String Course, int marks1, int marks2, int marks3) {
    this.roll = roll;
    this.Name = Name;
    this.Course = Course;
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
  }

  public int total_marks() {
    return this.marks1 + this.marks2 + this.marks3;
  }

  public double average_marks() {
    int total_marks = this.total_marks();
    return total_marks / 3;
  }

  public String Grade() {
    double total_marks = this.total_marks();
    double percentage = (total_marks / 300) * 100;

    if(percentage>=90)return "A+";
    else if (percentage < 90 && percentage >= 85)
      return "A";
    else if (percentage < 85 && percentage >= 80)
      return "B+";
    else if (percentage < 80 && percentage >= 75)
      return "B";
    else if (percentage < 75 && percentage >= 70)
      return "C+";
    else if (percentage < 70 && percentage >= 65)
      return "C";
    else if (percentage < 65 && percentage >= 60)
      return "D+";
    else if (percentage < 60 && percentage >= 55)
      return "D+";
    else if (percentage < 55 && percentage >= 50)
      return "E";
    else
      return "F";
  }

  public String toString() {
    return "Student " + this.Name + " on the course " + this.Course + " having roll no " + this.roll + "has got total_marks "
        + this.total_marks() + " and also his average marks is " + this.average_marks() + " on that base his grade is "
        + this.Grade();
 }
 
}
