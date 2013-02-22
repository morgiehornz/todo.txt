import java.io.*;
import java.util.*;

public class FileHandler
{
    public FileHandler()
    {
	File file = "ToDo.txt";
	FileReader = new FileReader(file);
	FileWriter fw = new FileWriter(file);
	BufferedWriter bw = new BufferedWriter(fw);
	Scanner sc = new Scanner(file);
    }

    public TaskList readFile(File file)
    {
	// Your Thang, Nicole.	
    }

    public CommandResult writeFile(TaskList tl)
    {
	for(int i=0;i<(tl.getList()).length;i++)
	{
	    // Do Stuff
	}
    }


}
