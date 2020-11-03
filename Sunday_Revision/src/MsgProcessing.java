
public class MsgProcessing {


		public void PrintMsg (String msg) {
			String word= "";
			int i =0;
			for (i=0; i <msg.length(); i++) {
				if(msg.substring(i,i+1).equals(" ")) {
					System.out.println(word);
					word="";
				}
				else {
					word=word+msg.substring(i,i+1);
					
				}
			}
			System.out.println(word);
		}
		
		public void ReversePrintMsg(String msg) {
			
			
			String word="";
			String newmsg="";
			for(int i=0; i<msg.length();i++) {
				if(msg.substring(i,i+1).equals(" ")) {
					newmsg +=reverseWord(word)+ " ";
					System.out.println(word);
					word="";
				}else {
					word= msg.substring(i,i+1)+word;
				}
			}
			newmsg += reverseWord(word)+ " ";
			System.out.println(word);
		}
		
		private String reverseWord(String word) {
			String newword="";
			for(int i=0;i<word.length();i++) {
				newword=word.substring(i,i+1) + newword;
			}
			
			return newword;
		}
		
	}


