package test.main;
/*
 * [�ڹ� �⺻ ������ Ÿ��]
 * 2.����
 * -���������� ���� ���� :true,false�ΰ��� ���� �������ִ�
 * -����¹�� :true,false�� �������ְų� �� ���� Ȥ��
 * 			 �������� ����� �����ִ�*/
public class MainClass03 {
	public static void main(String[] args) {
		//���� ���� ����� ���ÿ� �� �����ϱ�
		boolean	isRun=true; 
		if(isRun) {
			System.out.println("�޷���!");
		}
		System.out.println("���θ޼ҵ尡 ����˴ϴ�.");
		boolean isGreater=10>1;
		if(isGreater) {
			System.out.println("10�� 1����Ŀ��");
			
		}
		boolean result=true||false;
		System.out.println("���� �޼ҵ尡 ����˴ϴ�");
	}
}
