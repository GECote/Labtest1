package labtest01.labtest01;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation
{
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	private static Corporation myCorp = new Corporation();
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	
	
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}
	
	private Corporation(){
		
		
	}
	
	public static Corporation getInstance(){
		return myCorp;
	}
	
}
