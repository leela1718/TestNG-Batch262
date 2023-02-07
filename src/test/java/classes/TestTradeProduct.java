package classes;
public class TestTradeProduct {
	public static void main(String[] args) {
		TradeProduct tp =new TradeProduct();
		System.out.println(tp.productId);
		String pName = tp.getProductName();
		System.out.println( pName);
	}
}
