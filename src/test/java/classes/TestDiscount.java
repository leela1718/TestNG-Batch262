package classes;

public class TestDiscount {
	public static void main(String[] args) {
		DiscountService ds = new DiscountService();
		//System.out.println(ds.discountCode); // CE: dicount code is not visible because it is private Property
		//ds.getDiscountPercentage(); // CE: dicountPercentage is not visible because it is private method
	}
}
