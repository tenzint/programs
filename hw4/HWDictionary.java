//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class HWDictionary{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
		System.out.print(" --> Enter an integer amount of definitions to input \n -->");
        int n = in.nextInt();
       // String[] nameList = new String[n];
       // int[] phoneList = new int[n];
        Map<String,String> dictionary = new HashMap<String,String>();
        for(int i = 0; i < n; i++){
			System.out.print(" --> ");
            String name = in.next();
			System.out.print(" --> ");
            String dfn = in.nextLine();
            // Write code here
            //nameList[i] = name;
           // phoneList[i] = phone;
            dictionary.put(name,dfn);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            int i;
            /*for(i=0; i<n; i++){
                if(s.compareTo(nameList[i]) == 0){
                    System.out.println(nameList[i] + "=" +phoneList[i]);
                    break;
                }
            }
            if(i>=n){           // name not found
                System.out.println("Not found");
            }*/
            
            if(dictionary.get(s)==null){
                System.out.println("Not found");
            }else
                System.out.println(s + "=" +dictionary.get(s));
        }
        in.close();
    }
}
