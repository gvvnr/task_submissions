'''
Given a string, create a dictionary with characters as keys and count(frequency) of each character as value. 
'''
str=input("Enter the Input string to get the frequency of each character :");
dict={};
for i in str:
	if i in dict:
		dict[i]=dict[i]+1;
	else:
		dict[i]=1;
print(dict);
