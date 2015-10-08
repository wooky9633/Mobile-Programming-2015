package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		/** 援ы쁽 �븯�떆�삤 **/ 
		super("no name yet", 0);
		//this.name = "no name yet";
		//price = 0;
		discount = 0;
		
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		///** 援ы쁽 �븯�떆�삤 **/ 
		super(theName, thePrice);
		discount = theDiscount;
	}
	
	public DiscountSale(DiscountSale originalObject) {
		/** 援ы쁽 �븯�떆�삤 **/
		super(originalObject.getName(), originalObject.getPrice());
		discount = originalObject.discount;
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		/** 援ы쁽 �븯�떆�삤 **/ 
		return getPrice()/100*(100-discount);
	}
	
	public double getDiscount() {
		/** 援ы쁽 �븯�떆�삤 **/ 
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		/** 援ы쁽 �븯�떆�삤 **/ 
		this.discount = newDiscount;
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			DiscountSale otherDiscountSale = (DiscountSale) otherObject;
			return (discount == otherDiscountSale.discount);
		}
	}
	
	
	public DiscountSale clone() {
		/** 援ы쁽 �븯�떆�삤....  �엫�떆�깮�꽦�옄 �궗�슜 **/ 
		return new DiscountSale(this);
	}
}
