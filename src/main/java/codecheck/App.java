package codecheck;

public class App {
	public static void main(String[] args) {
		char[] input=new char[1000];
		char[] input=new char2[1000];
		Arrays.fill(char,"0");
		int times=String.valueOf(args[0]);
		char[0]="1";
		System.out.println(char[0]);
		for (int i = 0;i < times; i++) {//入力された数だけ繰り返す
			
			for(int j=i;char[j]!=0;j++) {//配列の長さ分だけ
			int j=i;
			char check=char[i];
			count=0;
			while(char[j]==check){
				count++;
			}
			System.out.print(count);
			System.out.print(check);
			}

		}
	}
}
