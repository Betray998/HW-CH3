import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P38
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J�r��");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		System.out.println("�п�J�n�˯�����r");
		String st1=br.readLine();
		char h=st1.charAt(0);
		int num=st.indexOf(h);
		
		if(num!=-1)
		{	
			System.out.println(st+"����"+(num+1)+ "�Ӧr�N�O�u"+h+"�v");
		}
		else
		{
			System.out.println(st+"���S���u"+h+"�v�o�Ӧr");
		}
		
	}
}
