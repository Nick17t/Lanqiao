package basic.Array;


/*
* ����һ����Ҫ�����ǣ��������е�ÿ�����ֵ����������ϵ�������ӡ�
           1
          1 1
         1 2 1
        1 3 3 1
        ����n���������ǰn�С�
        �����ʽ
        �������һ����n��
        �����ʽ
        �����������ε�ǰn�С�ÿһ�д���һ�еĵ�һ������ʼ����������м�ʹ��һ���ո�ָ���
 * */
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


    }
}

/*
class Solution {
    public List<List<Integer>> generate(int numRows) {
        //�洢Ҫ���ص��������
        List<List<Integer>> dg = new ArrayList<>();
        //��0�У��򷵻ؿ�
        if(numRows == 0){
            return dg;
        }
        //�ݹ���ڣ����ǵ�һ�����ҵ�����
        if(numRows == 1){
            dg.add(new ArrayList<>());
            dg.get(0).add(1);
            return dg;
        }
        //�ݹ飬ע�ⷵ��ֵ���������ǵڶ���
        dg = generate(numRows-1);
        //һ���ݹ�Ҫ��ɶ�����ǿ��Կ��ڶ��е���������Ҫ��ɶ
        //������Ҫ����һ��list���洢�����У�Ȼ��ͨ���ڶ��еõ�������
        //�����е���βΪ1��ȷ���˵ģ�Ȼ������м������εõ�
        //ͨ���۲�������õ�forѭ�������ʽ��
        //�������˷���ֵ������
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int j = 1;j < numRows - 1;j++){
            row.add(dg.get(numRows-2).get(j-1) + dg.get(numRows-2).get(j));
        }
        row.add(1);
        dg.add(row);
        return dg;
    }
}
*/
