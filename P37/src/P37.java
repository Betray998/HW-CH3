import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P37 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入英文字母");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		String stb=st.toUpperCase();
		String sts=st.toLowerCase();
		
		System.out.println("轉換成大寫時為"+stb);
		System.out.println("轉換成小寫時為"+sts);
		
	}
}
