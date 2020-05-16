import java.util.Scanner;

public class Program {
  public static Person person;// Reference to the person class
	public static void main(String[] args) {
		System.out.println("Program Started...");
        
		
       Scanner input = new Scanner(System.in);
       
       
       
       //PROMPT USER FOR NAME
       System.out.print("Enter your Name: ");
       String myName = input.nextLine();
       
       //PROMPT USER FOR GENDER
       System.out.print("Enter your Gender: ");
       String myGender = input.nextLine();
       
     //PROMPT USER FOR AGE
       System.out.print("Enter your age: ");
       int myAge = input.nextInt();
       
        person = new Person(myAge);
		person.setName(myName);
		person.setGender(myGender);
		
	
		
		person.runs();
		
		System.out.printf("%s is %d years old and is %s", person.getName(), person.getAge(), person.getGender());
	}

}
