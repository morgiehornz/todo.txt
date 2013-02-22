import java.io.*;
import java.util.*;

package org.cssquare.todo;

public class FileHandler
{
    public FileHandler()
    {
	File file = new File("ToDo.txt");
	FileWriter fw = new FileWriter(file);
	BufferedWriter bw = new BufferedWriter(fw);
	Scanner sc = new Scanner(file);
    }
    public TaskList readFile(File file)
    {
	
    }

    public CommandResult writeFile(TaskList tl)
    {
	if(file.hasNext())
	{
	    bw.write(sc.nextLine());
	    bw.flush();
	}
	bw.close();
    }


}
