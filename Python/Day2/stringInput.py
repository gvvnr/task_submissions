'''
#Write a script that takes a string input from user, displays the string without the first and last characters. For example, if the input is #'computer', the output should be 'ompute' 
'''
str=input("Enter the String to display without first and last character :");
for i in range(1,len(str)-1):
	print(str[i],end="");
