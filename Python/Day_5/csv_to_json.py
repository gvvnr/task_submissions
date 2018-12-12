'''
#Script to read a CSV file and write it into JSON file 
'''
import csv
import json
with open('Sample.csv', 'r') as f:
            csv_rows=[];
            reader = csv.DictReader(f)
            title = reader.fieldnames
            print("Reading data from CSV file")
            for rows in reader:
                csv_rows.extend([{title[i]:rows[title[i]] for i in range(len(title))}])
            print("Writing the read CSV file data into JSON file")     
            with open('converted.json','w') as f1:
                f1.write(json.dumps(csv_rows))
            print("Data read into json file")
