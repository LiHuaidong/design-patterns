package hdli.creation.single;

/**
 * @Description
 * @Author: Lihuaidong
 * @Date: Created at 10:14 2020/6/17
 */
public class MySingletonFactory3 {

	private static class FactoryHodler{
		private static final MySingletonFactory3 factory = new MySingletonFactory3();
	}

	private MySingletonFactory3(){}

	public static MySingletonFactory3 getInstance() {
		return FactoryHodler.factory;
	}
}
