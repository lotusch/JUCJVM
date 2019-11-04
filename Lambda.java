
@FunctionalInterface
interface Foo
{
	//public void sayHello();
	public int add(int x,int y);

	default int mul(int x,int y){
		return x*y;
	}
	
	public static int div(int x,int y){
		return x/y;
	}
}

/** ����ʽ�ӿ�

	1  ����С���ţ�д���Ҽ�ͷ����ش�����
	2  @FunctionalInterface
	3  default ���Զ�����default����
	4  static  ���Զ�����static����
*/
public class LambdaExpressDemo
{
	public static void main(String[] args){
		Foo foo = (int x,int y)->{
			System.out.println("come in the add method");
			return x+y;
		};

		System.out.println(foo.add(6,4));
		System.out.println(foo.mul(6,4));

		System.out.println(Foo.div(10,2));//��̬�������ã�Foo�������÷���
		
	}
}