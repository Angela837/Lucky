import java.util.Random;
import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {

		int key = 0;// ѡ����
		Scanner input = new Scanner(System.in);

		String yn = null;// �ж��Ƿ�ѭ��
		Scanner input1 = new Scanner(System.in);

		String[] name = new String[5];// ע��5���û�
		String[] pass = new String[5];
		int[] cards = new int[5];
		int index = -1;
		String name1 = null;
		String pass1 = null;

		int card = 0;
		Random r = new Random();

		int count = 0;
		do// �ڵ���ģ�鹦��ִ�н�����������������棬����ѭ��
		{
			System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
			System.out.println("\t" + "1.ע��" + "\n" + "\t" + "2.��¼" + "\n" + "\t" + "3.�齱 " + "\n" + "\t" + "4.�˳� ");
			System.out.println("*****************************");
			System.out.print("��ѡ��˵���");
			key = input.nextInt();
			switch (key) {
			case 1:// ע��
				System.out.println("[ ���͸���ϵͳ > ע�� ]");
				System.out.println("����д����ע����Ϣ��");
				for (int i = 0; i < name.length; i++) {
					if (name[i] == null) {
						index = i;
					}
				}
				System.out.print("�û�����");
				Scanner input2 = new Scanner(System.in);
				name[index] = input2.next();

				System.out.print("���룺");
				Scanner input3 = new Scanner(System.in);
				pass[index] = input3.next();

				System.out.println("ע��ɹ�����Ǻ����Ļ�Ա����");

				System.out.println("�û���" + "\t" + "����" + "\t" + "��Ա����");
				cards[index] = (int) (Math.random() * 10);
				System.out.println(name[index] + "\t" + pass[index] + "\t" + cards[index]);

				break;

			case 2:// ��¼
				System.out.println("[ ���͸���ϵͳ > ��¼ ]");
				System.out.print("�������û�����");
				Scanner input4 = new Scanner(System.in);
				name1 = input4.next();

				System.out.print("���������룺");
				Scanner input5 = new Scanner(System.in);
				pass1 = input5.next();
				boolean flag = false;// �ж��û����������Ƿ����

				for (index = 0; index < name.length; index++) {
					if (name1.equals(name[index]) && pass1.equals(pass[index]))
						flag = true;
				}

				if (flag)
					System.out.println("��ӭ����" + name[index]);
				else {
					for (count = 0; count < 2; count++) {
						System.out.println("�˻���Ϣ����������������룡");

						System.out.print("�����������û�����");
						Scanner input7 = new Scanner(System.in);
						name1 = input7.next();
						System.out.print("�������������룺");
						Scanner input8 = new Scanner(System.in);
						pass1 = input8.next();
						
						for (index = 0; index < cards.length; index++) {
							if (name1.equals(name[index]) && pass1.equals(pass[index]))
								System.out.println("��ӭ����" + name[index]);

						}
						if (count == 1)
							System.out.println("3�δ������˳����µ�¼");

					}
				}

				break;
			case 3:// �齱
				System.out.println("[ ���͸���ϵͳ > �齱 ]");
				System.out.println("���Ļ�Ա���ţ�");
				Scanner input6 = new Scanner(System.in);
				card = input6.nextInt();

				// �������5����
				for (int i = 0; i < cards.length; i++) {
					cards[i] = (int) (Math.random() * 10);
					for (int j = 0; j < i; j++) {
						if (cards[i] == cards[j]) {
							cards[i] = (int) (Math.random() * 10);
							j = -1;
							// i--;
						}
					}
				}
				// ��ӡ5����
				for (int j = 0; j < cards.length; j++) {
					System.out.print(cards[j] + "\t");
				}
				// �ж��Ƿ��н�
				boolean flag1 = false;
				for (int j = 0; j < cards.length; j++) {
					if (card == cards[j]) {
						flag1 = true;
						break;

					}
				}
				// ������
				if (flag1)
					System.out.println("���Ǳ������˻�Ա��");
				else
					System.out.println("��Ǹ�������Ǳ������˻�Ա��");

				break;

			case 4:// �˳�
				yn = "n";
				System.out.println("[ ���͸���ϵͳ > �˳� ]");
				break;

			default:// ��������
				System.out.println("������������");
				break;
			}
			System.out.print("����ô����y/n����");
			yn = input1.next();
		} while (yn.equals("y"));

		if (yn.equals("n"))

		{
			System.out.println("ϵͳ�˳���ллʹ�ã�");
		} // ѡ��n���˳�ѭ��

	}
}
