package kc.ac.kookmin.excption.transaction;

public class Bank {
	private int balance = 1000;
	public void oneqTrade()
	{
		try
		{
			tradeWithA();
			
			tradeWithB();
			
			tradeWithC();
		}
	
		
		catch(Exception ex)
		{
			System.out.println("�ŷ��� ���� �߻�, ��ü ���");
			cancelA();
			cancelB();
			cancelC();
			System.out.println("�ܿ� �ݾ� : " + balance);
		}
	}
	
	public void tradeWithA()
	{
		int m = 100;
		
		System.out.println("A���¿��� ��� - " + m);
		balance -= m;
	}
	
	public void tradeWithB()
	{
		int m = 200;
		
		System.out.println("B���¿��� ��� - " + m);
		balance -= m;
	}
	
	public void tradeWithC() throws Exception
	{
		int m = 300;
		
		System.out.println("C���¿��� ��� - " + m);
		balance -= m;
		throw new Exception();
	}
	
	public void cancelA()
	{
		System.out.println("A ���� �ŷ� ��� ");
		balance += 100;
	}
	
	public void cancelB()
	{
		System.out.println("B ���� �ŷ� ��� ");
		balance += 200;
	}
	
	public void cancelC()
	{
		System.out.println("C ���� �ŷ� ���");
		balance += 300;
	}
}