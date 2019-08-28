package myFristOop;

import java.io.Serializable;

public class Ios extends Phone implements Charge, Serializable {

	public Ios(String brand, String model, boolean refurbished) {
		super(brand, model, refurbished);
		// TODO Auto-generated constructor stub
	}

	public Ios(String brand, String model) {
		super(brand, model);
		// TODO Auto-generated constructor stub
	}

	public Ios(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	public Ios() {
		// TODO Auto-generated constructor stub
	}

}
