package p4;

class Solution {
    public static String solution(String penter, String pexit, String pescape, String data) {
    	StringBuilder sb =new StringBuilder();
    	int cnt = 0 ;
    	int start = 0;
    	int end = 0;
    	String[] str = new String[data.length()/penter.length()];
    	for(int i =0 ; i < data.length()/penter.length(); i++) {
    		start = i * penter.length(); 
    		end = end + penter.length();
    		str[i] = data.substring(start , end);
    	}
    	
    	for(int i = 0; i < str.length; i++) {
    		System.out.println(str[i]);
    	}
    	sb.append(penter);
    	while(cnt < str.length) {
    		if(str[cnt].equals(penter)) {
    			sb.append(pescape);
    			sb.append(str[cnt]);
    		} else if(str[cnt].equals(pescape)) {
    			sb.append(pescape);
    			sb.append(str[cnt]);
    		} else if(str[cnt].equals(pexit)) {
    			sb.append(pescape);
    			sb.append(str[cnt]);
    		} else {
    			sb.append(str[cnt]);
    		}
    		cnt++;
    	}
    	sb.append(pexit);
    	String answer = sb.toString();
        return answer;
    }
    
}