package ch13.test.list;

class CartItem {
		private String name;
		private int price;
		private int count;
		
		public CartItem(String name, int price, int count) {
			this.name = name;
			this.price = price;
			this.count = count;
		}
		public String getName() { return this.name; }
		
		public int getTotalPrice() { return this.price*this.count; 
		}
		

		
}
