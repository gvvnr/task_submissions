/*
 * Problem : Verify JSON Object validity
Statement
A JSON object is a keyvalue
pair data structure that is enclosed within { }. A sample JSON object would look like
{
"key1":"value1",
"key2":"value2",
"key3": {
"key4":"value4",
"key5":"value5"}
"key6":"value6",
"key7":[
{
"key8":"value8"
}]
}
Given a JSON object, ignore the literal values of the object and check whether the
distinguishing characters and notation of
the object are valid to determine if the JSON object is valid or not.
Note:
1. Key3 points to another JSON object (Concept of nesting of JSON objects).
2. Key7 points to an array of JSON objects.
Input Format:
1. First line contains a pattern of JSON without any literal
Output Format:
Print 1 if pattern is valid, 1
otherwise.
Constraints:
1. A JSON object should start with '{' and ends with a '}'.
2. The key and value should be separated by a ':'.
3. A ',' suggests an additional JSON property.
4. An array only consists of JSON objects. It cannot contain a "key":"value" pair by itself.
Example 1:
Input
{:[{},{}]}
Outputput
1

Explanation
{
"Key": [{
"Key": "Value"
}, {
"Key": "Value"
}]
}
Pattern is following all constrains hence prints 1
Example 2:
Input
{:{[]},{}}
Outputput
-1
Explanation
Covert this pattern in a JSON Object
{
"Key": {
[
"Key": "Value"
]
},
{
"Key": "Value"
}
}
Constraint 4 "An array only consists of JSON objects. It cannot contain a "key":"value" pair by itself." not
followed here, so it's a invalid pattern, hence prints 1
 */
import java.util.*;

public class Json {
	Scanner sc;
	String jsonStr;
	int curleyBracket;
	int squareBracket;
	LinkedList<Character> object;
	Json(){
		sc=new Scanner(System.in);
		object = new LinkedList<Character>();
		
	}

	public void validateData() {
		jsonStr="{:[{},{}]}";
		int count=0;
		for(int i=0;i<jsonStr.length();i++){
			if(jsonStr.charAt(i)=='{'){
				object.push(jsonStr.charAt(i));
				++curleyBracket;
				}
			else if(jsonStr.charAt(i)=='}'){
				char value=object.remove();
				 if(value!='{'){
					 count=1;
					 break;
				 }
				--curleyBracket;
				}
			else if(jsonStr.charAt(i)=='['){
				++squareBracket;
				char value=object.peek();
				 if(value==','){
					 count=1;
					 break;
				 }
				object.push(jsonStr.charAt(i));
				}
			else if(jsonStr.charAt(i)==']'){
				char value=object.remove();
				 if(value!='['){
					 count=1;
					 break;
				 }
				--squareBracket;
				}
			else if(jsonStr.charAt(i)==':'){
				if(squareBracket==0 && curleyBracket==0){
					  count=1;
				  }
				}
			else if(jsonStr.charAt(i)==','){
				  if(squareBracket==0 && curleyBracket==0){
					  count=1;
					  break;
				  }
				}
		}
		if(count==1 || squareBracket!=0 || curleyBracket!=0){
			System.out.println("InValid");
		}
		else{
			System.out.println("Valid :");
		}
		
		

	}
	
	public static void main(String[] args) {
		Json json=new Json();
		json.validateData();
		
	}

}

/*
if(jsonStr.charAt(index)=='{' || jsonStr.charAt(index)=='[' || jsonStr.charAt(index)==':' || jsonStr.charAt(index)==',' || jsonStr.charAt(index)=='}' || jsonStr.charAt(index)==']' ){
//object.push(jsonStr.charAt(index));

System.out.println("String is :::::::");
System.out.println(jsonStr.charAt(index));
//valid=valid+""+jsonStr.charAt(index);

}



		for(int index=0;index<jsonStr.length();index++){
			if(jsonStr.charAt(index)=='{' || jsonStr.charAt(index)=='[' || jsonStr.charAt(index)==':' || jsonStr.charAt(index)==',' || jsonStr.charAt(index)=='}' || jsonStr.charAt(index)==']' ){
				//object.push(jsonStr.charAt(index));

				System.out.println("String is :::::::");
				System.out.println(jsonStr.charAt(index));
				//valid=valid+""+jsonStr.charAt(index);

				}
		}
*/