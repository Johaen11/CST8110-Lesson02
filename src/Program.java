
public class Program {
  public static Person person;// Reference to the person class
	public static void main(String[] args) {
		System.out.println("Program Started...");
        
		person = new Person(29);
       
		person.setName("Niro");
		
		System.out.println(person.getName());
		
		person.runs();
		
		
	}

}
