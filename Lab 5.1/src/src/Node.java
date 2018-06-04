package src;

import java.util.*;

public class Node implements Comparable<Node>{
	
	private boolean c;
	private String name;
	private ArrayList<Node> children;
	
	public Node(String name, boolean c, ArrayList<Node> children)
	{
		this.name = name;
		this.c = c;
		this.children = children;
	}
	
	public void setChildren(ArrayList<Node> children)
	{
		this.children = children;
	}
	
	public void clear()
	{
		this.c = false;
	}
	
	public String toString()
	{
		return this.name;
	}
	
	public int comparetTo()
	
	public boolean isChildOf(Node n)
	{
		for(Node x : children)
	}
	
}
