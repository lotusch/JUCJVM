import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class myThread implements Callable<Integer>
{
	@override
	public Integer call() throws Exception
	{
		System.out.println("*****come in the call() method");
		return 1024;
	}
}

/**
	Callable�ӿڣ��з���ֵ���̲߳���������
*/

public class CallableDemo
{
	public static void main(String[],args){
	
		FutureTask<Integer> futureTask = new FutureTask(new myThread());//Class FutureTask implemented Interface Runnable,Future<v>.
		new Thread(futureTask,"A").start();//�����߳�

		Integer result = futureTask.get();//��ȡ����ֵ
		System.out.println(result);
	}
}