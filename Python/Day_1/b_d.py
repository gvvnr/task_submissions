'''
#Write a script to convert binary to decimal number 
'''
import math
binary = input("::")
print(binary)
i_binary = int(float(binary))
f_binary=i_binary
i=0
sum=0
while i_binary!=0:
	s1=int(i_binary%10);
	i_binary=int(i_binary/10);
	sum=sum+(s1*(math.pow(2, i)));
	i=i+1;
print(sum);
xx1=float(binary)-int(float(binary));
print(str(xx1))
st=str(xx1);
count=0
j=-1
sum1=0
for i in st:
	if count>1:
		sum1=sum1+(int(i)*(math.pow(2, j)));
		j=j-1
	count=count+1
sum=sum+sum1
print(sum)
