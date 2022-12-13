package hw05_2;

public class hw05_07 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		try
		{
			car1.setCar(1234, -10.0);
		}
		catch(CarException e)
		{
			System.out.println("拋出" + e + "了");
		}
		car1.show();
	}

}

/*class CarException extends Exception
{
	
}
class Car
{
	private int num;
	private double gas;
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("已生產了汽車");
	}
	public void setCar(int n,double g)throws CarException
	{
		if(g<0)
		{
			CarException e = new CarException();
			throw e;
		}
		else
		{
			num = n;
			gas = g;
			System.out.println("車號是" + num + "汽油量是" + gas);
		}
	}
	
		
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("車號是" + gas);
	}
	public void show()
	{
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是" + this.gas);
	}
	void showCar()
	{
		System.out.println("開始顯示車輛資訊");
		this.show();
	}
}