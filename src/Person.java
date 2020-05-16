
public class Person {
    //PRIVATE INSTANCE MEMBERS
	private String _gender;
	private String _name;
	private int _age;
	//PROPERTIES++++++++++++++++++++++++++++++++++++
	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		this._gender = gender;
	}

	public String getName() {
		return this._name;
	}
	
	public void setName(String name) {
		this._name = name;
	}
	
	//READ ONLY access modifier for this._age
	public int getAge(){
		
		return this._age;
	}
	//CONSTRUCTOR++++++++++++++++++++++++++++++++++++++++++
		public Person(int age) {
			this._age = age;
		}
	//PUBLIC METHODS+++++++++++++++++++++++++++++++++++
	public void runs() {
		System.out.printf("%s Runs \n", this.getName());
	}
	
}
