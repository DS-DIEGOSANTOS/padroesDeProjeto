package SingletonFactory;

import SingletonFactory.factory.IPhoneSimpleFactory;
import SingletonFactory.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneSimpleFactory iPhoneSimpleFactory = IPhoneSimpleFactory.getInstance();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
