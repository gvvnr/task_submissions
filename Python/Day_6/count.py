'''
#Write a python program to count the number of words in a file.
'''
import re
with open("abc.txt") as file:
    data=file.read()
    print("Total Number of words present in the text file abc is :",len(re.split('[ ,]',data)))
    
