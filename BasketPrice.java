package cart;

import java.util.ArrayList;
import java.util.HashMap;
public class BasketPrice
{
	public static void main(String[] args) 
	{
		HashMap <String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Apple", 10);
		hm.put("Peach", 20);
		hm.put("Orange",15);
		hm.put("Banana", 10);
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Peach");
		int price=0;
		for(String fruit:fruits)
		{
			if(hm.containsKey(fruit))
			{
				price+=hm.get(fruit);
			}
			
		}
		System.out.println("Total Bucket price is:" +price);

	}

}
