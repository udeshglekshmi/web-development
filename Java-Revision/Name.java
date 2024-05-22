/* 
* Input height, age and name with first letter of person  
*/
import java.util.Scanner; 

public class Name 
{ 
    public static void main(String[] args) 
     { 
	String name; 
	char letter;  
	int age; 
	double height;
	Scanner inp = new Scanner(System.in); 
	System.out.println("Name and first letter: "); 
                name = inp.nextLine(); 
	letter = inp.next().charAt(0); 
 
	System.out.println("Age and Height: "); 
	age = inp.nextInt(); 
	height = inp.nextDouble(); 

	System.out.println("Name " + name + "." + letter); 
	System.out.println("Age and height " + age + "," + height);
     }  
} 