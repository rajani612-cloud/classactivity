package construtordemo;

public class TelecomServices {
	public static void main(String [] args)
	{
		//creating  a subscriber object
		Subscriber sub1=new Subscriber(101, "Edwin", "Premium");
		sub1.display();
		
		//create a shallow copy
		Subscriber sub2=new Subscriber(sub1);
		sub2.display();
		
		//create deep copy
		Subscriber sub3=new Subscriber(sub1, true);
		sub3.display();
		
		
		//modify original
		sub1.setName("Trump");
		sub1.setPlan("basic");
		sub1.display();
		
		sub2.display();
		sub3.display();
		
	}

}
