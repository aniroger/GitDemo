package basics;

public class Pig extends Animal {
	

	@Override
	 void animalsound() {
		// TODO Auto-generated method stub
		
	    System.out.println("The pig says: wee wee");
	}

	
	public static void main(String[] args)
	{
		Pig w = new Pig();
		w.animalsound();
		w.sleep();
	}
}
