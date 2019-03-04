
public class Trade {

	public static void main(String[] args) {
		  //来银行
				Bank.backName="工商银行";
				Bank.welcome();
			// 创建对象，开户
				Bank Backures=new  Bank("余叔琪","123456",100);
		//存钱
				Backures.deposit(300);
				//取钱
				Backures.withdrawal("123456",100,290);
				//离开
				Backures.welcomenext();
		}
	}


