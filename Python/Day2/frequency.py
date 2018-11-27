str=input("Enter the Input string :");
dict={};
for i in range(len(str)):
	if i in dict:
		dict[str[i]]=dict[i]+1;
	else:
		dict[str[i]]=1;
print(dict);
