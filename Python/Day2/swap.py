'''
#Given a dictionary, invert the dictionary with values to keys and keys to values
'''
Dict = {1: 'Geeks', 2: 'For',  
        3:{'A' : 'Welcome', 'B' : 'To', 'C' : 'Geeks'}} 
  
List=[];
List1=[];

for i in Dict:
	List.append(i);
	List1.append(Dict[i]);
Dict.clear();

for key,value in zip(List,List1):
	Dict[str(value)]=str(key);

for i in Dict:
	print("Modified Key is :"+i+" :Modified value is :"+Dict[i]);

	
