package main.java.compress;

public class StringCompressor {

	/**
	 * Given a string "aabcccbbaaaa" return a compressed string "a2b1c3b2a4"
	 * unless the compressed string is longer than the original in which case
	 * return the original string.
	 * 
	 * @param s
	 * @return
	 */
	public String compress(String s) {

		if(s == null || s.isEmpty()){
			return s;
		}
		
		StringBuffer sb = new StringBuffer();
		char[] chars = s.toCharArray();
		int count = 0;
		char last = chars[0];
		
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if(c == last){
				count++;
			}else{
				sb.append(last);
				sb.append(count);
				count = 1;
				last = chars[i];
			}			
		}
		//add the final ones
		sb.append(last);
		sb.append(count);
		
		return sb.length() < s.length() ? sb.toString() : s;
	}
}
