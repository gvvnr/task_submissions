import csv
import json
print("Hello")
with open('Sample.csv', 'r') as f:
            csv_rows=[];
            reader = csv.DictReader(f)
            title = reader.fieldnames
            for rows in reader:
                print(rows)
                print("________________")
                csv_rows.extend([{title[i]:rows[title[i]] for i in range(len(title))}])
                
            with open('converted.json','w') as f1:
                f1.write(json.dumps(csv_rows))
