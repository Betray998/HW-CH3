import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P40
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J�r��");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		System.out.println("�п�J�n�s�W���r��");
		String st1=br.readLine();
		
		StringBuffer aa=new StringBuffer(st);
		aa.append(st1);
		

			System.out.println("�b�u"+st+"�v��s�W�u"+st1+"�v���ܡA�N�|�ܦ��u"+aa+"�v�C");
		
		
	}
}
