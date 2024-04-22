package stringPrograms;

public class LorgerCommanPrefixUsingWordByWordMaching {
	
	private static String commanprefixutil(String str1, String str2) {
		
		String result = "";
		int n1 = str1.length(); int n2 = str2.length();
		
		for ( int i=0,j=0; i<=n1-1 && j<=n2-1;i++,j++) {
			if (str1.charAt(i) != str2.charAt(j)) {
				break;
			}
			result += str1.charAt(i);
			
		}
		return result;
	}
	
	private String commonPrefix(String[] arr, int n) {
		String prefix = arr[0];
		
		for ( int i=1;i<=n -1;i++) {
			prefix = commanprefixutil( prefix , arr[i]); 
		}
		return prefix;	
	}
	
	public static void main(String[] args) {
		LorgerCommanPrefixUsingWordByWordMaching l = new LorgerCommanPrefixUsingWordByWordMaching();
		String arr[] = {"Naveen", "venu","kalyan", "geezer"};
		int n = arr.length;
		System.out.println(n);
		String ans = l.commonPrefix(arr, n);
		
		if (ans.length() > 0) {
			System.out.println( " ans is greter than value +:"+ ans);
		}else {
			System.out.println("ans is greter less than zero");
		}
		
	}

	

}
