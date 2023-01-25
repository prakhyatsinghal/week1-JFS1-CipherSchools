
public class Test0 {

	public static void main(String[] args) {

		Amazon customer = new Amazon();
		
		float payableAmount = customer.Transaction(10000);
		System.out.println("Total Payable "+payableAmount);

	}

}

class Amazon{
	float Transaction(float amt) {
	
	Gpay gpayObj = new Gpay();
	
	float totalAmount = amt + (amt*gpayObj.getTaxCharge());
	return totalAmount;
	}
}

class Gpay{
	private float taxCharge = 0.05f;

	public float getTaxCharge() {
		return taxCharge;
	}
	 
}