'''
# Create a class Student with name, age, height
# input a list of students [{name: 'abc', age: 15, height: 5.5},
{name: 'xyz', age: 20, height: 5.7} . . . ]
# the program should prompt from user. If user types 1, it should sort the studnets based on name, 2 sort on age, 3 sort on height.

'''
class Student:
    def __init__(self,name,age,height):
      self.name=name
      self.age=age
      self.height=height

    def display(self):
      print("Name is "+str(self.name)+" age is "+str(self.age)+" height is "+str(self.height))

stud=[];
stud.append(Student('abc',55,6.5))
stud.append(Student('def',20,5.7))
stud.append(Student('xyz',25,5.9))



print("Enter 1 to print the details of student sorted based on names :");
print("Enter 2 to print the details of student sorted based on age   :");
print("Enter 3 to print the details of student sorted based on height   :");
sort=[];
n=input();
if int(n)==1:
    sort=sorted(stud, key=lambda student: student.name)
elif int(n)==2:
    sort=sorted(stud, key=lambda student: student.age)  
elif int(n)==3:
    sort=sorted(stud, key=lambda student: student.height)
else:
    print("Sorry you entered an invalid input as Integer")

if int(n)==1 or int(n)==2 or int(n)==3:
   for st in sort:
      st.display();










