import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
public class Scanner4 {
 
    public static void main(String[] args) {
        
        //중복을 제거하고 가나다 순으로 출력하라
        
        String[] arry = {"오리온","견우","직녀","오월주","삼월주","오리온"};
        ArrayList<String> list = new ArrayList<String>();
        //Arrays.sort(arry,Collections.reverseOrder()); //오름차순
        //Arrays.sort(arry); //내림차순
        
        for(int i = 0 ; i<arry.length;i++){
            if(!list.contains(arry[i])){ //포함되어 있나 없나 체크
                list.add(arry[i]); // list에 arry[i]에 해당하는 값이 없으면 추가
            }
        }
        
        //Collections.sort(list); // 내림차순
        Collections.sort(list,Collections.reverseOrder()); //오름차순
        
        System.out.println("list 의 사이즈"+list.size());
        for(int z = 0 ; z<list.size();z++){
            System.out.println(list.get(z));
        }
    }
 
}
