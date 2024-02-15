
package labpaper_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WordFrequency {

	public static void main(String[] args) {
		Map<String, Integer> wordfreq=new LinkedHashMap<String, Integer>();
		String str="hi ratan sir welcome to sathyatech welcome to ratan sir class";
		String [] store=str.split(" ");
		for (int i = 0; i < store.length; i++) {
			wordfreq.put(store[i], i);
		}
		System.out.println(wordfreq);
		for (int i = 0; i < store.length; i++) {
			int count=0;
			for (int j = i+1; j < store.length; j++) {
				if(store[i].equals(store[j]) )
				{
					count++;
				}
	
			}
			
			 if(count==0)
				wordfreq.put(store[i], count+1);
			else
				wordfreq.put(store[i], count);
		}
		Set<String> keyset=wordfreq.keySet();
		System.out.println("words"+keyset);
		
			for (Map.Entry<String, Integer> entry : wordfreq.entrySet()) {
				String key = entry.getKey();
				Integer val = entry.getValue();
				System.out.println("word:"+key+"frequency:"+val);
				
			}
	}

}
