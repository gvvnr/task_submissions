'''
Take a json file with attributes name,age,phone number,blood group and in that file take only specified fields like name and blood group and store it a new csv file
'''
import json
import csv
with open("student.json","r") as student_data:
    data=json.load(student_data)
details=[];
details.append("name,blood-group")
for row in data["student"]:
   details.append(row["name"]+","+row["blood-group"])

with open("student_details.csv","w") as student_required_data:
    writer = csv.writer(student_required_data, delimiter='\n')
    writer.writerows([details])
