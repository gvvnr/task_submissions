'''
#Scritp to read a JSON file and write into CSV file
'''
import json
import csv
print("Reading data from JSON file")
with open('converted.json', 'r') as f:
     distros_dict = json.load(f)
print("writing the read data from JSON file to CSV file")
with open('json_to_cs.csv','a') as f1:
    csvwriter = csv.writer(f1)
    count = 0

    for det in distros_dict:

      if count == 0:

             header = det.keys()

             csvwriter.writerow(header)

             count += 1

      csvwriter.writerow(det.values())
print("Data written into CSV file")

    






     
    
