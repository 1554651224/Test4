package car;

//一旦类中有抽象方法则此类必须声明为抽象类
abstract class Eld5000{
	//属性
	String name;
	//抽象方法没有方法体，用abstract声明
	public abstract void flyInTheSky();
	//普通方法
	public void eat(){
		System.out.println(name + "is eatting something");
	}
}
//1.继承了抽象，如果不实现抽象犯法，则子类必须声明为抽象类
abstract class Eld2000 extends Eld5000{
}
//2.子类重写父类所有抽象方法，子类就是一个普通的类
class Modern extends Eld5000{

	public void flyInTheSky() {
		System.out.println("坐飞机，坐火箭");
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		//抽象类就是不能实例化对象
		//Eld eld = new Eld();
		//抽象父类的引用指向重写子类的对象，也可以实现
		Eld5000 m = new Modern();
		m.flyInTheSky();
		//父类的方法写成抽象方法，不需要创建父类对象
	}
}
