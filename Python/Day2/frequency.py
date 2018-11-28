'''
Given a string, create a dictionary with characters as keys and count(frequency) of each character as value. 
'''
str=input("Enter the Input string :");
dict={};
for i in str:
	if i in dict:
		print(i);
		dict[i]=dict[i]+1;
	else:
		print(i);
		dict[i]=1;
print(dict);
