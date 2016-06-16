package test1;

/**
 * AbstractClass是抽象类，抽象类必须被继承
 * @author zengli
 * @date 2016/4/12
 */
public class implementAbstract extends AbstractClass{
	
	/**
	 * @Override
	 * 抽象方法必须被重写；
	 * 如果不重写，则在继承类中的方法也要被申明为抽象方法，同时类定义为抽象类
	 * 如果重写，则无需定义为抽象方法和抽象类
	 */
	
	public void print() {
		System.out.println("这是重写了抽象类的方法");
	}
	
	public static void main(String[] args) {
		implementAbstract ia = new implementAbstract();
		ia.print();
		System.out.println(ia.write());
	}
}
