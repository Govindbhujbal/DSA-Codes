package learningJava;
//import java.io.BufferedReader; 
//import java.io.InputStreamReader; 
//import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Dhikkar {
	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int N=sc.nextInt();
		        ArrayList L = new ArrayList();
		        while(N-- >0){
		            int k=sc.nextInt();
		            L.add(k);
		        }
		        int Q=sc.nextInt();
		        while(Q-- >0){
		            String st;
		            st=sc.nextLine();
		            if(st.equals("Insert")){
		               int x=sc.nextInt();
		               int y=sc.nextInt();
		                L.add(x,y);
		            }
		            else if(st.equals("Delete")){
		                int z=sc.nextInt();
		                L.remove(z);
		            }
		        }
		        System.out.println(L);		        
		    }
}