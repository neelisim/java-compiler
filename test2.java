import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Test2 {
    public void run() throws IOException
    {
        try
        {
            File f=new File("C:\\Users\\User\\Desktop\\exe\\test11.bat");
	//f.create =scNewFile();


            FileOutputStream fis=new FileOutputStream(f);
            String data="javac ";
	Scanner sc=new Scanner(System.in);
	System.out.println("plse enter text");
	String d=sc.nextLine();
	System.out.println("plse enter text1");
	String ff=sc.nextLine();

String e=" 2>compile.txt \r\n java ";
//String ff=" t1 1";
String g=">output.txt \r\n  compile.txt \r\n output.txt";
data=data+d+e+ff+g;
	byte da[]=new byte[data.length()];
	da=data.getBytes();
           fis.write(da,0,data.length());

            fis.close();
        }
            catch(Exception e)
        {
                System.out.println(e);
            }


        }
    public static void main(String args[]) throws IOException
    {

       new Test2().run();
    }

}
