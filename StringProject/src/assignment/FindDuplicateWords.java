package assignment;

public class FindDuplicateWords {
	public static void main(String[] args) {
		String s=  "Hello world bye and bye world bye ";//"India is my country and India is best country";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{int cnt=0;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					cnt++;
				}
			}
			if(cnt>0)
			{
				System.out.print(str[i]+" ");
			}
		}
	}

}
