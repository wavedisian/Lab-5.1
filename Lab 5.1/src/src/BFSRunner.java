package src;

import java.util.*;

public class BFSRunner {
	
	public boolean breadthSearch(Node x, Node y)
	{
		if(x.equals(y)) 
		{
			return true;
		}
		else
		{
			for(Node c : x.getChildren())
			{
				breadthSearch(c, y);
			}
			return false;
		}
	}
}
