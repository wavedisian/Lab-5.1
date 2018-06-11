package src;

import java.util.*;

public class Node{
	
	private boolean c;
	private String name;
	private ArrayList<Node> children;
	
	public Node(String name, boolean c)
	{
		this.name = name;
		this.c = c;
	}
	
	public void setChildren(ArrayList<Node> children)
	{
		this.children = children;
	}
	
	public ArrayList<Node> getChildren()
	{
		return this.children;
	}
	
	public void clear()
	{
		this.c = false;
	}
	
	public void check()
	{
		this.c = true;
	}
	
	public boolean wasChecked()
	{
		return this.c;
	}
	
	public String toString()
	{
		return this.name;
	}
	
	public boolean equals(Node x)
	{
		if(this.name.compareTo(x.toString())==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isChildOf(Node n)
	{
		for(Node x : children)
		{
			if(x.equals(n))
			{
				return true;
			}
		}
		return false;
	}
	
}
