package classes;

public class TestProduct {

	public static void main(String[] args) {
		ProductService ps = new ProductService();
		String pName = ps.getProductName();
		System.out.println(pName);

	}

}
