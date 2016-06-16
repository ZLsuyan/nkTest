package test1;

/**
 * 继承、构造函数以及super和this的用法测试
 * @author zengli
 * @date 2016/4/12
 */
public class Sub extends Base{
	String name;
	int age;
	public Sub() {
		this.name="Sub";
		this.age = 2;
		System.out.println("这是子类的构造方法");
	}
	
	//测试super和this的用法
	public void print(){
		System.out.println(super.name+" "+super.age);
		System.out.println(this.name+" "+this.age);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//经过测试发现，子类实例化对象时，是先调用的父类的构造方法，再调用子类的构造方法
		Base b = new Sub();
		b.print();

	}



}
