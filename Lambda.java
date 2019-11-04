
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

/** 函数式接口

	1  拷贝小括号，写死右箭头，落地大括号
	2  @FunctionalInterface
	3  default 可以定义多个default方法
	4  static  可以定义多个static方法
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

		System.out.println(Foo.div(10,2));//静态方法调用，Foo类名调用方法
		
	}
}