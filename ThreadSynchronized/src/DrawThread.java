
public class DrawThread extends Thread {
	
	// 模拟用户账户
	private Account account;
	// 当前取钱线程所希望取的钱数
	private double drawAmount;
	
	// 有参构造
	public DrawThread(String name, Account account, double drawAmount)
	{
		super(name);// 给父类Thread类传一个name初始化参数      相当于  new Thread(name)
		this.account = account;
		this.drawAmount = drawAmount;
	}
	
	// 当多个线程修改同一个共享数据时， 将涉及数据安全问题
	public void run()
	{
		// 账户余额大于取钱数目
		if(this.account.getBalance() >= this.drawAmount)
		{
			// 吐出钞票
			System.out.println(this.getName() + "取钱成功！吐出钞票：" + this.drawAmount);
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 修改余额
			account.setBalance(account.getBalance() - drawAmount);
			System.out.println("\t 余额为：" + account.getBalance());
		}
		else
		{
			System.out.println(this.getName() + "取钱失败！余额不足！");
		}
	}
}