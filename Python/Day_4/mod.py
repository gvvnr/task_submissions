def file_copying():
   f=open("Sample.csv","r");
   f1=open("desired.csv","a");
   data=f.readlines();
   for line in data:
       words=line.split(",");
       count=0
       st="";
       for word in words:
                if count%2!=0:
                    st=st+word+",";
                count=count+1;
       f1.write(st+"\n");
       print();
   f.close();
   f1.close();
