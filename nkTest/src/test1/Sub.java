package test1;

/**
 * �̳С����캯���Լ�super��this���÷�����
 * @author zengli
 * @date 2016/4/12
 */
public class Sub extends Base{
	String name;
	int age;
	public Sub() {
		this.name="Sub";
		this.age = 2;
		System.out.println("��������Ĺ��췽��");
	}
	
	//����super��this���÷�
	public void print(){
		System.out.println(super.name+" "+super.age);
		System.out.println(this.name+" "+this.age);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�������Է��֣�����ʵ��������ʱ�����ȵ��õĸ���Ĺ��췽�����ٵ�������Ĺ��췽��
		Base b = new Sub();
		b.print();

	}



}
