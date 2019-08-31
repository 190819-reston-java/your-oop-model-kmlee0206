package myFristOop;

import java.io.Serializable;

public class Android extends Phone implements Charge, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Android(String brand, String model, boolean refurbished) {
		super(brand, model, refurbished);
		device++;
	}

	public Android(String brand, String model) {
		super(brand, model);
		device++;
	}

	public Android(String brand) {
		super(brand);
		device++;
	}

	public Android() {
		device++;
	}
	
	public void playStore() {
		System.out.println(this.getBrand() + this.getModel() + 
				" is downloading app from the Play Store!");
	}
	
	public void appStore() {
		System.out.println(this.getBrand() + this.getModel() + 
				" Android does not use app store!");
	}
	
	@Override
	public void download() {
		playStore();
	}
	
	@Override
	public void reset() {
		System.out.println("Are you sure?");
	}

}
