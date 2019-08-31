package myFristOop;

public class PhoneDriver {

	public static void main(String[] args) {

		Android a = new Android();
		Phone b = new Android("Samsung", " Note10+", true); //hard inputing
		Ios c = new Ios("Apple", " iPhone7", false);
		Ios d = new Ios();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(Phone.device);
		//b.playStore();
		//b.appStore();
		//hihihihihhi
		c.playStore();
		
		
	}

}
