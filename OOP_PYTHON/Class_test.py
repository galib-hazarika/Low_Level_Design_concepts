from Student import Student

def main():
  student1 = Student(1,'Jacob','IT',55,66,77)
  print(student1.total_marks())
  print(student1.average_marks())
  print(student1.grade())
  print(student1.toString())

if __name__ == "__main__":
  main()