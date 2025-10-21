package sale;

public class Web extends Sale {
	private String deliveryAdress;

	public Web(String deliveryAdress) {
		// TODO Auto-generated constructor stub
		this.deliveryAdress = deliveryAdress;
	}

	public String getDeliveryAdress() {
		return deliveryAdress;
	}

	public void setDeliveryAdress(String deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Web";
	}
	
}
