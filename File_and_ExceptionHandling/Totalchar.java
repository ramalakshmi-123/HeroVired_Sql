import java.util.*;
import java.io.*;
class Totalchar{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        try{
            File name=new File("Herovired.txt");
            FileInputStream fis=new FileInputStream(name);
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            String line;
            int c=0;
            while((line=br.readLine())!=null)
            {
                if(line=="")
                {
                    c+=1;
                }
                c+=line.length();
            }
            System.out.println("Total number of characters in file are: "+c);
            br.close();
            fis.close();
        }
        catch(IOException e)
        {
            System.err.println("Error: "+e.getMessage());
        }
    }
}