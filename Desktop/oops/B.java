			/*by extending thread class*/
class A extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Babajubed");
			Thread.sleep(6000);
		}
	}
}
class B
{
	public static void main(String[] args)
	{
		A t=new A();
		t.start();
	 for(int i=1; i<=5; i++)
	{
		System.out.println("jubed");
		Thread.sleep(6000);
	}
	}
}