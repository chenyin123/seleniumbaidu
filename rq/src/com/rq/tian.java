package com.rq;

import java.util.Scanner;

public class tian {
	public static void mDate(String date){
		int dateSum = 0;
		int year = Integer.valueOf(date.substring(0,4));
		int month = Integer.valueOf(date.substring(5,7));
		int day = Integer.valueOf(date.substring(8,10));
		for(int i=1;i<month;i++){
			
				 switch(i){  
		            case 1:  
		            case 3:  
		            case 5:  
		            case 7:  
		            case 8:  
		            case 10:  
		            case 12:  
		                dateSum+=31;  
		            break;  
		            case 4:  
		            case 6:  
		            case 9:  
		            case 11:  
		                dateSum+=30;  
		                break;  
		            case 2:  
		            	//�ж��Ƿ�������
		            	if((year % 4 == 0 && year%100 != 0)||
		            			(year % 400 == 0)){
		            		dateSum += 29;
		            	}else{
		            		dateSum += 28;
		            	}		            		
		      }				
			}
		 System.out.println("������������Ǹ���ĵڣ�"+(dateSum+day)+"��"); 
		//System.out.println("����exit�˳�ϵͳ");			
	}
	
	public static void main(String[] args) {
		//while(true){
			System.out.println("������������(��ʽ2018-07-21)");
			Scanner sc=new Scanner(System.in);
			String str = sc.nextLine();
			/*if(str.equals("exit")){
				System.out.println("ϵͳ�˳�");
				break;
			}		*/	
			mDate(str);			
		//}		
	}
}
