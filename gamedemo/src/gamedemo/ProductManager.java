package gamedemo;

public class ProductManager implements ProductService{

	@Override
	public void add(Product product) {
		System.out.println
		(product.productId+ " Numaral� Id'ye sahip "+" ve " +product.productName+ " �simli Oyun "
				+ " Fiyat�: "+product.productUnitPrice+" TL" + " Olarak Ba��ryla Eklendi ");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println
		(product.productId+" Numaral� Id ye sahip " +product.productName + " �simli Oyun Silindi ");
		
	}

	@Override
	public void update(Product product) {
		System.out.println
		(product.productId+" Numaral� Id ye sahip " +product.productName + " �simli Oyun G�ncellendi ");
		
	}

}
