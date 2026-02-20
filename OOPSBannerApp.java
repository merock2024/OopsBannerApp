/* 

UC - 8 --> Creating the same pattern using the Hash Maps

*/


import java.util.*;
public class OOPSBannerApp{
	public static HashMap<Character,String[]> createHashMap(){
		HashMap<Character,String[]> map = new HashMap<>();
		
		map.put('O',new String[]{
			"*****",
			"*   *",
			"*   *",
			"*   *",
			"*****"
		});
		map.put('S',new String[]{
			"*****",
			"*    ",
			"*****",
			"    *",
			"*****"
		});
		
		return map;
	}
	
	public static void printMessage(String s,HashMap<Character,String[]> map){
		
		int h = map.get('O').length;
		
		for(int i=0;i<h;i++){
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<s.length();j++){
				String[] pattern = map.get(s.charAt(j));
				sb.append(pattern[i]).append(" ");
			}
			System.out.println(sb.toString());
		}
		
	}
	public static void main(String[] args){
		String s = "OS";
		HashMap<Character,String[]> map = createHashMap();
		printMessage(s,map);
		
 	}	
}