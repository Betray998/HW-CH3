import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P38
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入字串");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		System.out.println("請輸入要檢索的文字");
		String st1=br.readLine();
		char h=st1.charAt(0);
		int num=st.indexOf(h);
		
		if(num!=-1)
		{	
			System.out.println(st+"的第"+(num+1)+ "個字就是「"+h+"」");
		}
		else
		{
			System.out.println(st+"中沒有「"+h+"」這個字");
		}
		
	}
}
