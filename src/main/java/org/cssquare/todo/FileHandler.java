package org.cssquare.todo;
import org.cssquare.todo.*;

import java.io.*;
import java.util.*;

public class FileHandler
{
    public static List<Task> readFile(File f)
    {
	List<Task> list = new ArrayList<Task>();
	FileReader fr = new FileReader(f);
	BufferedReader bufR = new BufferedReader(fr); 
	Scanner sc = new Scanner(bufR);	
	while (sc.hasNext())
	{
	    list.add(new Task(sc.nextLine()));
	}
	return list;	
    }

    public static CommandResult writeFile(List<Task> tl)
    {	try
	{
	    File file = new File("ToDo.txt");
	    file.createNewFile();
	    FileWriter fw = new FileWriter(file);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter outFile = new PrintWriter(bw);
	
	    for(Task t:List)
	    {
	    	outFile.println(tl.get(i));
	    }
	}
	catch(FileNotFoundException e)
	{
	    e.getMessage();
	}
    }


}
