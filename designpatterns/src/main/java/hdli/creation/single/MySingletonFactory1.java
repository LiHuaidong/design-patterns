package hdli.creation.single;

/**
 * @Description
 * @Author: Lihuaidong
 * @Date: Created at 19:27 2020/6/16
 */
public class MySingletonFactory1 {

	private static MySingletonFactory1 factory = new MySingletonFactory1();
	private MySingletonFactory1(){

	}

	public static MySingletonFactory1 getInstance() {
		return factory;
	}
}
