print("Enter the Date:")
d1=input();
print(d1);
x=[]
x=d1.split("-")
print(int(x[2]))
day=int(x[0])
month=int(x[1])
year=int(x[2])

year=year%400
feb=0;
def leap():
	if year%4==0:
		feb=1
		print("It is leap year");
	else:
		print("No it isn't leap year");

if month==2 and feb==1 and day>=1 and day<=29:
	print("Given date is valid:");
	leap()
	
elif month==2 and feb==0 and day>=1 and day<=28:
	print("Given date is valid:");
	leap()
	
elif month<8 and month%2==1 and day>=1 and day<=31:
	print("Given date is valid:");
	leap()	
elif month<8 and month%2==0 and day>=1 and day<=30 and month!=2:
	print("Given date is valid:");
	leap()	
elif month>=8 and month%2==0 and day>=1 and day<=31 and month<=12:
	print("Given date is valid:");
	leap()	
elif month>8 and month%2==1 and day>=1 and day<=30 and month<=12:
	print("Given date is valid:");
	leap()	
else:
	print("Given Date is not Valid :");

