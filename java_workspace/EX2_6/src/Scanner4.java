import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
public class Scanner4 {
 
    public static void main(String[] args) {
        
        //�ߺ��� �����ϰ� ������ ������ ����϶�
        
        String[] arry = {"������","�߿�","����","������","�����","������"};
        ArrayList<String> list = new ArrayList<String>();
        //Arrays.sort(arry,Collections.reverseOrder()); //��������
        //Arrays.sort(arry); //��������
        
        for(int i = 0 ; i<arry.length;i++){
            if(!list.contains(arry[i])){ //���ԵǾ� �ֳ� ���� üũ
                list.add(arry[i]); // list�� arry[i]�� �ش��ϴ� ���� ������ �߰�
            }
        }
        
        //Collections.sort(list); // ��������
        Collections.sort(list,Collections.reverseOrder()); //��������
        
        System.out.println("list �� ������"+list.size());
        for(int z = 0 ; z<list.size();z++){
            System.out.println(list.get(z));
        }
    }
 
}
