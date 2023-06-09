package SingletonFactory.factory;

import SingletonFactory.model.*;

public class IPhoneSimpleFactory {
	private static IPhoneSimpleFactory iPhoneSimpleFactory;
	private IPhoneSimpleFactory() {
	}
	public static IPhoneSimpleFactory getInstance() {
		if (iPhoneSimpleFactory == null)
			iPhoneSimpleFactory = new IPhoneSimpleFactory();
		return iPhoneSimpleFactory;
	}
	public IPhone orderIPhone(String generation, String level) {
		IPhone device = null;

		if (generation.equals("X")) {
			if (level.equals("standard")) {
				device = new IPhoneX();
			} else if (level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if (generation.equals("11")) {
			if (level.equals("standard")) {
				device = new IPhone11();
			} else if (level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}
}
