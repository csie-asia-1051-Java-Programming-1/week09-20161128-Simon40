package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021060 陳俊仁
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
        	if(n%i==0){
        		System.out.println(i);
        		sum++;
        	}
        }
        if(sum==2){
        	System.out.println("是質數");
        }else{
        	System.out.println("不是質數");
        }
	}

}
