package 工厂模式.工厂方法模式;

public class BydFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Byd();
	}

}
