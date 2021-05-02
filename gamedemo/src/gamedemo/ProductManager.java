package gamedemo;

public class ProductManager implements ProductService{

	@Override
	public void add(Product product) {
		System.out.println
		(product.productId+ " Numaralý Id'ye sahip "+" ve " +product.productName+ " Ýsimli Oyun "
				+ " Fiyatý: "+product.productUnitPrice+" TL" + " Olarak Baþýryla Eklendi ");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println
		(product.productId+" Numaralý Id ye sahip " +product.productName + " Ýsimli Oyun Silindi ");
		
	}

	@Override
	public void update(Product product) {
		System.out.println
		(product.productId+" Numaralý Id ye sahip " +product.productName + " Ýsimli Oyun Güncellendi ");
		
	}

}
