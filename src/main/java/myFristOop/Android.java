package myFristOop;

import java.io.Serializable;

public class Android extends Phone implements Serializable, Charge {

	public Android(String brand, String model, boolean refurbished) {
		super(brand, model, refurbished);
		// TODO Auto-generated constructor stub
	}

	public Android(String brand, String model) {
		super(brand, model);
		// TODO Auto-generated constructor stub
	}

	public Android(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	public Android() {
		// TODO Auto-generated constructor stub
	}

}
