package hw05;

public class Car
{
	private int num;
	private double gas;
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("已生產了汽車");
	}
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("車號是" + num + "汽油量是" + gas);
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