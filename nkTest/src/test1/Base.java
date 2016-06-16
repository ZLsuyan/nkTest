package test1;

/**
 * 继承、构造函数以及super和this的用法测试
 * @author zengli
 * @date 2016/4/12
 */
public class Base {
	String name;
	int age;
	//基类的构造方法
	public Base(){
		this.name = "Sally";
		this.age = 22;
		System.out.println("这是Base的构造方法");
	}
	
	public void print(String name,int age){
		System.out.println(name+" is "+age+" years old!");
	}
	public void print(){
		System.out.println("这是无参重载函数！");
	}
	
	public static void main(String[] args) {
		Base b = new Base();
		b.print(b.name, b.age);
	}
	
}
