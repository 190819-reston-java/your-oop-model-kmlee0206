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
		this(brand, "Device Name");
	}

	public Phone() {
		this("Brand Name");
	}
	
	public void ring() {
		System.out.println(this.brand + this.model + " is ringing!");
	}
	
	public void vibrate() {
		System.out.println(this.brand + this.model + " is vibrating!");
	}
	
	public abstract void download();
	
	public abstract void reset();

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (refurbished ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (refurbished != other.refurbished)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		Boolean b = new Boolean(refurbished);
		String s = this.brand + " " +this.model + " " + b.toString();
		return s;
	}
	
	
}
