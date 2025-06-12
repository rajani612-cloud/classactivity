package construtordemo;

public class Subscriber {
	private int id;
	private  String name;
	private String plan;
	//default constructor
	public Subscriber(int id, String name,String plan)
	{
		this.id=id;
		this.name=name;
		this.plan=plan;
	}
   //copy constructor
	public Subscriber(Subscriber user)
	{
		this.id=user.id;
		this.name=user.name;
		this.plan=user.plan;
		System.out.println("shallow copy constructor called");
	}
	
	
	/////deep copy constructor
	public Subscriber(Subscriber user,boolean isDeepCopy)
	{
		this.id=user.id;
		if(isDeepCopy)
		{
			this.name=new String(user.name);
			this.plan=new String(user.plan);
			System.out.println("deep copy constructor called");
		}
		else
		{
			this.name=user.name;
			this.plan=user.plan;
			System.out.println("Shallow copy constructor");
		}
	}
	
	
	public void display()
	{
		System.out.println("Subscriber Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Plan: "+plan);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id>0) {
			this.id = id;
		}
		else {
			System.out.println("Invalid Id");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null && !name.isEmpty())
		{
			this.name=name;
		}
		else
		{
			System.out.println("Invalid name");
		}
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		if(plan!=null && !plan.isEmpty())
		{
		this.plan = plan;
		}
		else
		{
			System.out.println("Invalid plan");
		}
	}
	

}
