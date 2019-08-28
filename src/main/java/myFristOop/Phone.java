package myFristOop;

public abstract class Phone {

	private String brand;
	private String model;
	private boolean refurbished;

	public Phone(String brand, String model, boolean refurbished) {
		super();
		this.brand = brand;
		this.model = model;
		this.refurbished = refurbished;
	}

	public Phone(String brand, String model) {
		this(brand, model, false);
	}

	public Phone(String brand) {
		this(brand, "iphone7");
	}

	public Phone() {
		this("Apple");
	}
	
	public void ring() {
		System.out.println(this.brand + this.model + " is ringing!");
	}
	
	public void vibrate() {
		System.out.println(this.brand + this.model + " is vibrating!");
	}
	
	public abstract void sell();
	
	public abstract void trade();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isRefurbished() {
		return refurbished;
	}

	public void setRefurbished(boolean refurbished) {
		this.refurbished = refurbished;
	}
	
	
	
	
}
