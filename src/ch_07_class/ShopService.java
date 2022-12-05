package ch_07_class;

public class ShopService {

/*
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
*/
	
	private static ShopService singleton = null;
	
	private ShopService() {}
	
	static ShopService getInstance() {
		if (singleton == null) {
			singleton = new ShopService();
		}
		return singleton;
	}

}
