package learningJava;
import java.net.*;
import java.io.*;
public class GoBackN { 
public static void main(String args[])throws Exception{ 
	
      System.out.println("TEA 54  Govind Sambhaji Bhujbal"); 
	 	ServerSocket ss=new ServerSocket(3333); //Server will listen at '3333' 
	 	Socket s=ss.accept(); 
       //creating a object of DataInputStream class (i.e.dis) which help to get data (or message) 
	 	DataInputStream dis=new DataInputStream(s.getInputStream()); 
        //creating a object of DataOutputStream class (i.e.dos) which help to send data (or message) 
	 	DataOutputStream dos=new DataOutputStream(s.getOutputStream());  	
	 	System.out.println("waiting for connection"); 
       int data[] = { 30, 40, 50, 60, 70, 80, 90, 100 }; 
       System.out.println("The number of packets sent is:" + data.length); 
           dos.write(data.length);  // 'data.lenght' will return the length of array "data" it will send to client. 
           dos.flush();//sending data to client         
           for (int i = 0; i < data.length; i++) 
       { 
    	   
               dos.write(data[i]);
               dos.flush(); 
       } 
       //sending data to client where client get error while recieving 
       //retransmits all the frames that lie after the frame which is damaged or lost.
           int data_error_loc = dis.read();
           for(int i=data_error_loc;i<data.length;i++) 
       { 
           dos.write(data[i]);
           dos.flush(); 
       } 
	 	dis.close(); 
       dos.close(); 
	 	s.close();
	 	ss.close();
	 	} 
} 
