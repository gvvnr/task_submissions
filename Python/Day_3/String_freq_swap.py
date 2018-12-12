'''
Given a string, create a dictionary with characters as keys and count(frequency) of each character as value, later invert the dictionary with values to keys and keys to values so that if duplicate keys exist append the value of the repeated key to the original keys
'''
str=input("Enter the Input string to make characters as key and count of each character as value and later to Invert the dictionary with values to key and keys to value so that if duplicate keys exist append the value of repeated key to the original:");
dict={};
for i in str:
	if i in dict:
		dict[i]=dict[i]+1;
	else:
		dict[i]=1;
print("Frequency of Each character is")
print(dict);
List=[];
List1=[];

for i in dict:
	List.append(i);
	List1.append(dict[i]);
dict.clear();
for i,j in zip(List1,List):
	if i in dict:
		dict[i]=dict[i]+""+j;
	else:
		dict[i]=j;
print("After swapping the key value pairs result is :")
print(dict);

