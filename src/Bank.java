public class Bank {
	//��Ա����
    public static String backName;//��������
     public String name;//�û���
     public String password;//����
     public double balance;// �ʻ����
     public double turnover;//���׽��
     //��Ա����
     //��ͨ����
     static void welcome(){
   	  System.out.println("��ӭ���û�����������:");
    }
   //���췽�� ����
public  Bank( String name,String password,double  turnover){
	  this.name=name;
	  this.password=password;
	  this. turnover= turnover;
	  this.balance= turnover-10; 
	  System.out.println(name+"����ʱҪ��10Ԫ����");
}
//��Ǯ
public  void deposit   (double turnover){
	   this.balance=turnover+balance;
	   this.turnover=turnover;
	   System.out.println(this.name+"����"+turnover+"Ԫ�� �����"+this.balance+"Ԫ");
}
//ȡǮ
public   void withdrawal(String password,  double turnover, double balance){
	  if(this.password.equals(password)){
		if(this.balance>turnover){
			this.turnover=turnover;
			this.balance=balance;
			System.out.println(this.name+"ȡ��"+turnover+"Ԫ�� �����"+this.balance+"Ԫ");
		} 
		else
			System.out.println("����");
	  }
	  else
		 System.out.println("���벻��ȷ������");
}
//�뿪
public  void welcomenext(){
	  System.out.println("������Я����Ʒ����ӭ�´ι���");
 }
}

 