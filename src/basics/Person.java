package basics;

public class Person {
	
	String name;
	int number;
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public String getname()
	{
	 return name;	
	}
	
	public void setnumber(int number)
	{
		this.number = number;
	}
	
	public int getnumber()
	{
	 return number;	
	}
	
	
	public static void main(String[] args)
	{
		Person obj = new Person();
		obj.setname("Anirudh");
		System.out.println(obj.getname());
		
		obj.setnumber(35);
		System.out.println(obj.getnumber());
		
	}

}
