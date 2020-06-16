package hdli.creation.single;

/**
 * @Description
 * @Author: Lihuaidong
 * @Date: Created at 19:29 2020/6/16
 */
public class MySingletonFactory2 {

	private static volatile MySingletonFactory2 factory;
	private MySingletonFactory2(){

	}

	public static MySingletonFactory2 getInstance() {
		return factory;
	}

}
