package Boi.com;


		
		class account{
			String name = "Arun";
			int account_no = 213;
			float available_balance = 10000;
			public void display() {
				System.out.println(name + account_no + available_balance);
			}
		}
			class loan_account extends account{
				float loan_amount = 5000;
				public void displayloan() {
					float balance = available_balance - loan_amount;
					System.out.println("My loan amount is" + balance);
					
				}
			}	
				public class SimpleInheritence{
					public static void main(String[] args) {
						loan_account l1 = new loan_account();
						l1.display();
						l1.displayloan();
					
					}	
					
			}
