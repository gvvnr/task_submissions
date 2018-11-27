x="sandeep&100$hemanth&0$vamsi&15";
div=[];
div=x.split("$");
dict={};
max=0;
m="";
for i in div:
	name=i.split("&");
	dict[name[0]]=name[1];
	is_max=int(name[1]);
	if int(is_max)>int(max):
	   max=is_max;
	   max_key=name[0];
print("Max value is for:");
print("Max key is  "+max_key+" and Max_Value of "+max_key+" is:"+dict[max_key]);
