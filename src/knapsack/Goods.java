package knapsack;

public class Goods {
	
	private double weight;
	private double value;
	
	public Goods(double weight, double value) {
		this.setWeight(weight);
		this.setValue(value);
		System.out.println("Ürün Eklendi");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	

}
