import java.io.*;
public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("c:\\Temp\\ab.jpg");
		
		File dest = new File("c:\\Temp\\ba.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10];
			while(true) {
				int n = fi.read(buf);
				fo.write(buf,0,n);
				if(n< buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "��" + dest.getPath() + "�� �����Ͽ����ϴ�.");
			
		}catch(Exception e) {
			System.out.println("���� ���� ����");
		}
		
	}

}
