public class Bank {
	//成员变量
    public static String backName;//银行名称
     public String name;//用户名
     public String password;//密码
     public double balance;// 帐户余额
     public double turnover;//交易金额
     //成员方法
     //普通方法
     static void welcome(){
   	  System.out.println("欢迎新用户到工商银行:");
    }
   //构造方法 开户
public  Bank( String name,String password,double  turnover){
	  this.name=name;
	  this.password=password;
	  this. turnover= turnover;
	  this.balance= turnover-10; 
	  System.out.println(name+"开户时要扣10元卡费");
}
//存钱
public  void deposit   (double turnover){
	   this.balance=turnover+balance;
	   this.turnover=turnover;
	   System.out.println(this.name+"存入"+turnover+"元， 余额是"+this.balance+"元");
}
//取钱
public   void withdrawal(String password,  double turnover, double balance){
	  if(this.password.equals(password)){
		if(this.balance>turnover){
			this.turnover=turnover;
			this.balance=balance;
			System.out.println(this.name+"取出"+turnover+"元， 余额是"+this.balance+"元");
		} 
		else
			System.out.println("余额不足");
	  }
	  else
		 System.out.println("密码不正确！！！");
}
//离开
public  void welcomenext(){
	  System.out.println("请随身携带物品，欢迎下次光临");
 }
}

 