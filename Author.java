public class Author{
	
	private String name;
	private char sex;
	private int age;
	
	//constructor
	Author(String name, char sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//getter methods
	public char getSex(){
		return sex;
	}
	
	public int getAge(){
		return age;
	}
	
	//print details
	public void printDetails() {
		System.out.println("Name : " + name + "\n" + "Sex : " + sex + "\n" + "Age : " + age + "\n");
	}
}