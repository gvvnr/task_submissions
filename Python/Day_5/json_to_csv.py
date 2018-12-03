import json
import csv
#import os
#import re
#from operator import add
with open('converted.json', 'r') as f:
     distros_dict = json.load(f)

with open('json_to_cs.csv','a') as f1:
    csvwriter = csv.writer(f1)
    count = 0

    for det in distros_dict:

      if count == 0:

             header = det.keys()

             csvwriter.writerow(header)

             count += 1

      csvwriter.writerow(det.values())

    






     
    
