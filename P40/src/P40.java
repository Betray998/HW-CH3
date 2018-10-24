import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P40
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入字串");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		System.out.println("請輸入要新增的字串");
		String st1=br.readLine();
		
		StringBuffer aa=new StringBuffer(st);
		aa.append(st1);
		

			System.out.println("在「"+st+"」後新增「"+st1+"」的話，就會變成「"+aa+"」。");
		
		
	}
}
