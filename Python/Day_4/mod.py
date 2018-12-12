import csv
def file_copying():
    newfile=open('desired.csv','a') 
    with open('Sample.csv') as csvfile:
       reader = csv.DictReader(csvfile)
       field=reader.fieldnames
       for i in range(len(field)):
         if i%2!=0:
           newfile.write(field[i]+",")
       newfile.write("\n")
       for row in reader:
         for i in range(len(row)):
            if i%2!=0:
              newfile.write(row[field[i]]+",")
         newfile.write("\n")
         print()
       newfile.close()
       print("Desired data is copied from the sample.csv file and pasted in desired.csv file")


