import java.util.Random;
import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {

		int key = 0;// 选择功能
		Scanner input = new Scanner(System.in);

		String yn = null;// 判断是否循环
		Scanner input1 = new Scanner(System.in);

		String[] name = new String[5];// 注册5个用户
		String[] pass = new String[5];
		int[] cards = new int[5];
		int index = -1;
		String name1 = null;
		String pass1 = null;

		int card = 0;
		Random r = new Random();

		int count = 0;
		do// 在单个模块功能执行结束后，重新输出主界面，继续循环
		{
			System.out.println("*****欢迎进入奖客富翁系统*****");
			System.out.println("\t" + "1.注册" + "\n" + "\t" + "2.登录" + "\n" + "\t" + "3.抽奖 " + "\n" + "\t" + "4.退出 ");
			System.out.println("*****************************");
			System.out.print("请选择菜单：");
			key = input.nextInt();
			switch (key) {
			case 1:// 注册
				System.out.println("[ 奖客富翁系统 > 注册 ]");
				System.out.println("请填写个人注册信息：");
				for (int i = 0; i < name.length; i++) {
					if (name[i] == null) {
						index = i;
					}
				}
				System.out.print("用户名：");
				Scanner input2 = new Scanner(System.in);
				name[index] = input2.next();

				System.out.print("密码：");
				Scanner input3 = new Scanner(System.in);
				pass[index] = input3.next();

				System.out.println("注册成功！请记好您的会员卡号");

				System.out.println("用户名" + "\t" + "密码" + "\t" + "会员卡号");
				cards[index] = (int) (Math.random() * 10);
				System.out.println(name[index] + "\t" + pass[index] + "\t" + cards[index]);

				break;

			case 2:// 登录
				System.out.println("[ 奖客富翁系统 > 登录 ]");
				System.out.print("请输入用户名：");
				Scanner input4 = new Scanner(System.in);
				name1 = input4.next();

				System.out.print("请输入密码：");
				Scanner input5 = new Scanner(System.in);
				pass1 = input5.next();
				boolean flag = false;// 判断用户名和密码是否相等

				for (index = 0; index < name.length; index++) {
					if (name1.equals(name[index]) && pass1.equals(pass[index]))
						flag = true;
				}

				if (flag)
					System.out.println("欢迎您：" + name[index]);
				else {
					for (count = 0; count < 2; count++) {
						System.out.println("账户信息输入错误！请重新输入！");

						System.out.print("请重新输入用户名：");
						Scanner input7 = new Scanner(System.in);
						name1 = input7.next();
						System.out.print("请重新输入密码：");
						Scanner input8 = new Scanner(System.in);
						pass1 = input8.next();
						
						for (index = 0; index < cards.length; index++) {
							if (name1.equals(name[index]) && pass1.equals(pass[index]))
								System.out.println("欢迎您：" + name[index]);

						}
						if (count == 1)
							System.out.println("3次错误，请退出重新登录");

					}
				}

				break;
			case 3:// 抽奖
				System.out.println("[ 奖客富翁系统 > 抽奖 ]");
				System.out.println("您的会员卡号：");
				Scanner input6 = new Scanner(System.in);
				card = input6.nextInt();

				// 随机产生5个数
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
				// 打印5个数
				for (int j = 0; j < cards.length; j++) {
					System.out.print(cards[j] + "\t");
				}
				// 判断是否中奖
				boolean flag1 = false;
				for (int j = 0; j < cards.length; j++) {
					if (card == cards[j]) {
						flag1 = true;
						break;

					}
				}
				// 输出结果
				if (flag1)
					System.out.println("您是本日幸运会员！");
				else
					System.out.println("抱歉！您不是本日幸运会员！");

				break;

			case 4:// 退出
				yn = "n";
				System.out.println("[ 奖客富翁系统 > 退出 ]");
				break;

			default:// 输入有误
				System.out.println("您的输入有误！");
				break;
			}
			System.out.print("继续么？（y/n）：");
			yn = input1.next();
		} while (yn.equals("y"));

		if (yn.equals("n"))

		{
			System.out.println("系统退出，谢谢使用！");
		} // 选择n，退出循环

	}
}
