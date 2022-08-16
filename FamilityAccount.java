class FamilityAccount{
	public static void main(String[] args){
		boolean isFlag = true;
		String details = "收支\t账户金额\t收支金额\t说明\n";
		int balance = 0;
		while(isFlag){
			System.out.println("-------------家庭收支记账软件--------------\n");
			System.out.println("              1、收支明细");
			System.out.println("              2、登记收入");
			System.out.println("              3、登记支出");
			System.out.println("              4、退    出\n");
			System.out.println("              请选择（1-4）：");
			//获取用户的选择
			char selection = Utility.readMenuSelection();
			int cash1,cash2,sum;
			String tran;
			switch(selection){			
				case '1':
					//System.out.println("收入金额");
					System.out.println("----------------当前收支明细----------------");
					System.out.println(details);
					System.out.println("---------------------------------------------");
					break;
				case '2':
					//System.out.println("2、登记收入");
					System.out.print("本次收入金额");
					int addMoney = Utility.readNumber();
					System.out.print("本次收入说明");
					String addInfo = Utility.readString();
					//处理balance
					balance = balance + addMoney;
					details = details + "收入\t" + balance +"\t\t" + addMoney + "\t\t" + addInfo +"\n";
					System.out.println("-------------------登记完成-------------");
					break;
				case '3':
					System.out.print("本次支出金额");
					int minsMoney = Utility.readNumber();
					System.out.print("本次支出说明");
					String minsInfo = Utility.readString();
					//处理balance
					if(balance >= minsMoney){
						balance = balance - minsMoney;
						details = details + "支出\t" + minsMoney +"\t\t" + balance + "\t\t" + minsInfo +"\n";
						System.out.println("-------------------登记完成-------------");
					}else{
						System.out.println("支出额度超出余额,登记失败");
					}				
					break;
				case '4':
					//System.out.println("4、退    出");
				System.out.print("确认是否退出？(Y/N)");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}			
			}			
		}		
	}
}



