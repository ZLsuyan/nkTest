package test1;

/**
 * AbstractClass�ǳ����࣬��������뱻�̳�
 * @author zengli
 * @date 2016/4/12
 */
public class implementAbstract extends AbstractClass{
	
	/**
	 * @Override
	 * ���󷽷����뱻��д��
	 * �������д�����ڼ̳����еķ���ҲҪ������Ϊ���󷽷���ͬʱ�ඨ��Ϊ������
	 * �����д�������趨��Ϊ���󷽷��ͳ�����
	 */
	
	public void print() {
		System.out.println("������д�˳�����ķ���");
	}
	
	public static void main(String[] args) {
		implementAbstract ia = new implementAbstract();
		ia.print();
		System.out.println(ia.write());
	}
}
