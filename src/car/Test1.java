package car;

//һ�������г��󷽷�������������Ϊ������
abstract class Eld5000{
	//����
	String name;
	//���󷽷�û�з����壬��abstract����
	public abstract void flyInTheSky();
	//��ͨ����
	public void eat(){
		System.out.println(name + "is eatting something");
	}
}
//1.�̳��˳��������ʵ�ֳ��󷸷����������������Ϊ������
abstract class Eld2000 extends Eld5000{
}
//2.������д�������г��󷽷����������һ����ͨ����
class Modern extends Eld5000{

	public void flyInTheSky() {
		System.out.println("���ɻ��������");
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		//��������ǲ���ʵ��������
		//Eld eld = new Eld();
		//�����������ָ����д����Ķ���Ҳ����ʵ��
		Eld5000 m = new Modern();
		m.flyInTheSky();
		//����ķ���д�ɳ��󷽷�������Ҫ�����������
	}
}
