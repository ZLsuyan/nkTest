package test1;

/**
 * �̳С����캯���Լ�super��this���÷�����
 * @author zengli
 * @date 2016/4/12
 */
public class Base {
	String name;
	int age;
	//����Ĺ��췽��
	public Base(){
		this.name = "Sally";
		this.age = 22;
		System.out.println("����Base�Ĺ��췽��");
	}
	
	public void print(String name,int age){
		System.out.println(name+" is "+age+" years old!");
	}
	public void print(){
		System.out.println("�����޲����غ�����");
	}
	
	public static void main(String[] args) {
		Base b = new Base();
		b.print(b.name, b.age);
	}
	
}
