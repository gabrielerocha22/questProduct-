package entities;

import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

public class UsedProduct extends Product{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Data manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Data manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Data getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Data manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag () {
		return getName()
						+ " (used) $ " 
						+ String.format("%.2f", getPrice())
						+ " (Manufacture date: "
						+ sdf.format(manufactureDate)
						+ ")";
		
	}
	
}
