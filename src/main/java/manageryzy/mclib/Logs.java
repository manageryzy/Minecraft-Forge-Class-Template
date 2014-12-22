package manageryzy.mclib;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Error Logger for the Library
 * 
 * 
 * @author manageryzy@gmail.com
 *
 */
public class Logs {
	static void err(String msg)
	{
		String ErrorInfo;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		ErrorInfo = "["+sdf.format(new Date(System.currentTimeMillis()*1000))+"] "+ msg;
		
		System.err.println(ErrorInfo);
		
		Throwable ex = new Throwable();
		ex.printStackTrace();
	}
	
	
	static void log(String msg)
	{
		String ErrorInfo;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		ErrorInfo = "["+sdf.format(new Date(System.currentTimeMillis()*1000))+"] "+ msg;
		
		System.out.println(ErrorInfo);
		
		Throwable ex = new Throwable();
		ex.printStackTrace();
	}
}
