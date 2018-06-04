package src;

import java.util.*;

public class Web {

	private ArrayList<Node> web;
	
	public Web(ArrayList<Node> web)
	{
		this.web = web;
	}
	
	public void clear()
	{
		for(Node n : this.web)
		{
			n.clear();
		}
	}
}
