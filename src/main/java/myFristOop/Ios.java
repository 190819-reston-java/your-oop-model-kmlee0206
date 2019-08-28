package myFristOop;

import java.io.Serializable;

public class Ios extends Phone implements Charge, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		
	public void appStore() {
		System.out.println(this.getBrand() + this.getModel() + 
				" is downloading app from the App Store!");
	}
	
	public void playStore() {
		System.out.println(this.getBrand() + this.getModel() + 
				" ios does not use Play store!");
	}
	
	@Override
	public void download() {
		appStore();
	}
	
	@Override
	public void reset() {
		System.out.println("Are you sure?");
	}

}
