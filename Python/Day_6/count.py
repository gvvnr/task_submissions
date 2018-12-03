import re
with open("abc.txt") as file:
    data=file.read()
    words_count=re.split('[ ,]',data)
    print(len(words_count))
    
