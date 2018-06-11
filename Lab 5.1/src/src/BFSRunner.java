package src;

import java.util.*;

public class BFSRunner {
	
	public static boolean breadthSearch(Node x, Node y)
	{
	
			if(x.equals(y))
			{
				return true;
			}
			if(y.wasChecked())
			{
				return false;
			}
			else
			{
				for(Node c : x.getChildren())
				{
					if(c.equals(y))
					{
						return true;
					}
				}
				for(Node c : x.getChildren())
				{
					if(!c.wasChecked())
					{
						breadthSearch(c, y);
					}
				}
			}
			return false;
	}
	
	public static void main(String args[]){

        //Create our nodes
        Node NYC = new Node("New York City", false);
        Node CHI = new Node("Chicago", false);
        Node DEN = new Node("Denver", false);
        Node MIA = new Node("Miami", false);
        Node DAL = new Node("Dallas", false);
        Node SD = new Node("San Diego", false);
        Node LA = new Node("Los Angeles", false);
        Node SF = new Node("San Francisco", false);

        //Add edges between appropriate cities
        NYC.setChildren(new ArrayList<Node>(Arrays.asList(CHI,DEN,MIA,DAL)));
        CHI.setChildren(new ArrayList<Node>(Arrays.asList(NYC,SF,DEN)));
        DEN.setChildren(new ArrayList<Node>(Arrays.asList(CHI,NYC,LA,SF)));
        MIA.setChildren(new ArrayList<Node>(Arrays.asList(NYC,DAL)));
        DAL.setChildren(new ArrayList<Node>(Arrays.asList(NYC,SD,MIA,LA)));
        SD.setChildren(new ArrayList<Node>(Arrays.asList(LA,DAL)));
        LA.setChildren(new ArrayList<Node>(Arrays.asList(SD,SF,DEN,DAL)));
        SF.setChildren(new ArrayList<Node>(Arrays.asList(LA,DEN,CHI)));

        //Test our BreadthFirstSearch
        if(NYC.equals(NYC))
        {
        	System.out.println("1");
        }

        if(breadthSearch(NYC, SF))
        {
            System.out.print("Path Found!");
        }
        else
        {
            System.out.print("No Path Found");
        }
    }
}
