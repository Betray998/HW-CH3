import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P37 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J�^��r��");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		String stb=st.toUpperCase();
		String sts=st.toLowerCase();
		
		System.out.println("�ഫ���j�g�ɬ�"+stb);
		System.out.println("�ഫ���p�g�ɬ�"+sts);
		
	}
}
