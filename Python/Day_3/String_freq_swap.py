'''
Given a string, create a dictionary with characters as keys and count(frequency) of each character as value, later invert the dictionary with values to keys and keys to values so that if duplicate keys exist append the value of the repeated key to the original keys
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
List=[];
List1=[];

for i in dict:
	List.append(i);
	List1.append(dict[i]);
dict.clear();
print(List);
print(List1);
print("______");
for i,j in zip(List1,List):
	if i in dict:
		dict[i]=dict[i]+""+j;
	else:
		dict[i]=j;
print(dict);

