package knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Goods g1 = new Goods(4.0, 2.0); //0.5
		Goods g2 = new Goods(2.0, 3.0); //1.5
		Goods g3 = new Goods(3.0, 6.0); //2.0
		Goods g4 = new Goods(2.0, 2.0); //1.0
		
		double weight = 8.0;
		
		List<Goods> goods = new ArrayList<>();
		goods.add(g1);
		goods.add(g2);
		goods.add(g3);
		goods.add(g4);
		
		double value = Knapsack(goods, weight);
		System.out.println(value);
	}
	
	private static double Knapsack(List<Goods> goods, double weight) {
		double value = 0.0; //çantadaki eþyalarýn deðerleri
		double tempWeight = 0.0; //çantada olan aðýrlýk
		List<Double> list = new ArrayList<>();
		for(Goods good : goods) {
			list.add(good.getValue() / good.getWeight());
		}
		
		while(tempWeight < weight) {
			double subWeight = weight - tempWeight; //almam gereken aðýrlýk
			double maxValue = Collections.max(list); //birim fiyatý en yüksek olan eþyanýn value'sini al
			int maxValueIndex = list.indexOf(maxValue); //birim fiyatý en yüksek olanýn indis'ini bul
			if(goods.get(maxValueIndex).getWeight() <= subWeight) {
				tempWeight += goods.get(maxValueIndex).getWeight();
				value += goods.get(maxValueIndex).getValue();
			} else {
				if(goods.get(maxValueIndex).getWeight() % subWeight <= 1) {
					double div = goods.get(maxValueIndex).getWeight() / subWeight;
					tempWeight += subWeight;
					value += goods.get(maxValueIndex).getValue() / div;
				}
			}
			list.remove(maxValueIndex);
			goods.remove(maxValueIndex);
			if (tempWeight == weight){
	            break;
	        }
			
		}
		
		return value;
	}

}
