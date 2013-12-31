

/*
 * Koushik Krishnan
 * 2/27/12
 */
public class Sentence {
	String original;
	String temp;
	public Sentence(String s){
		original = s;
		temp = "";
	}
	public String getText() {
		return original;
	}
	public void reverse(){
		if(original.length() != 0){
			char c = original.charAt(0);
			original = original.substring(1, original.length());
			reverse();
			temp += c;
		}
		original = temp;
	}
	public void reverseFor(){
		for(int i = 0; i < original.length(); i++){
			temp += original.charAt(original.length() - 1 -i);
		}
		original = temp;
	}
	public static void main(String[] args){
		Sentence a = new Sentence("reverse");
		a.reverse();
		System.out.println(a.getText());
	}
}