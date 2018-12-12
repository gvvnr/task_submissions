'''
#Write a script to convert binary to decimal number 
'''
import math
binary = input("Enter the binary digit to convert into decimal :")
i_binary = int(float(binary))
f_binary=i_binary
i=0
sum=0
while i_binary!=0:
	s1=int(i_binary%10);
	i_binary=int(i_binary/10);
	sum=sum+(s1*(math.pow(2, i)));
	i=i+1;
xx1=float(binary)-int(float(binary));
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
