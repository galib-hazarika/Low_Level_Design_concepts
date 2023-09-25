class Student:
  def __init__(self,roll,name,course,m1,m2,m3):
    self.roll = roll
    self.name = name
    self.course = course
    self.m1 = m1
    self.m2 = m2
    self.m3 = m3
  def total_marks(self):
    return self.m1+self.m2+self.m3
  def average_marks(self):
    total_marks = self.total_marks()
    return total_marks/3
  def grade(self):
    percentage = (self.total_marks()/300)*100
    if percentage>=90: return "A+";
    elif percentage < 90 and percentage >= 85:
      return "A";
    elif percentage < 85 and percentage >= 80:
      return "B+";
    elif percentage < 80 and percentage >= 75:
      return "B";
    elif percentage < 75 and percentage >= 70:
      return "C+";
    elif percentage < 70 and percentage >= 65:
      return "C";
    elif percentage < 65 and percentage >= 60:
      return "D+";
    elif percentage < 60 and percentage >= 55:
      return "D+";
    elif percentage < 55 and percentage >= 50:
      return "E";
    else:
      return "F"; 
  def toString(self):
    return f'The student {self.name} having roll no {self.roll} got a total mark {self.total_marks()} and his grade and average is {self.grade()} , {self.average_marks()}'
