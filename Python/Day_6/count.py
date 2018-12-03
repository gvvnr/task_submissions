import re
with open("abc.txt") as file:
    data=file.read()
    print(len(re.split('[ ,]',data)))
    
