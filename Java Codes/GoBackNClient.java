package learningJava;

import java.net.*;
import java.io.*;
import java.util.*;

public class GoBackNClient{
	public static void main(String args[])throws Exception{ 
	 	Socket s=new Socket("localhost",3333); 
	 	DataInputStream dis=new DataInputStream(s.getInputStream());//creating a object of DataInputStream class (i.e.dis) which help to getdata (or message) 
	 	DataOutputStream dos=new DataOutputStream(s.getOutputStream());//creating a object of DataOutputStream class (i.e.dos) which help to senddata (or message)  	       System.out.println("TEA 54 Govind Bhujbal"); 
       int rec_data[] = new int[10]; //recieved data will store in rec_data 
      int rec_data_len = dis.read(); //reading length of data 
      System.out.println("No of frame is:" + rec_data_len); 
      Random rand_data_loc = new Random();//used to generate random number 
      //here client recieving the data 
      for (int i = 0; i < rec_data_len; i++)         { 
           rec_data[i] = dis.read(); 
           System.out.println(rec_data[i]); 
       }
	/*
	 * Here we generating error in data recieved.
	 * 'rand_data_loc.nextInt(rec_data_len)' this will generate the random number
	 * between 0 to 'rec_data_len'. rec_data_len is length of rec_data which we
	 * recieved from server. Setting that random number data location to -1
	 */
	rec_data[rand_data_loc.nextInt(rec_data_len)]=-1;

	// Showing recieved data
	for (int i = 0; i < rec_data_len; i++)
	{
		System.out.println("Received frame is: " + rec_data[i]);
	}
	/*
	 * here if we get error in recieved data then it detect the error location of
	 * data tell server to retransmit the data
	 */ int data_error_loc = 0;for(
	int i = 0;i<rec_data_len;i++)if(rec_data[i]==-1)
	{
		System.out.println("Request to retransmit packets onward from number " + (i + 1) + " again!!");
		data_error_loc = i;
		dos.write(data_error_loc);
		dos.flush();
	}System.out.println();
	// recieving the data where error is detected 
	for(int i=data_error_loc;i<rec_data_len;i++)
	{
		rec_data[i] = dis.read();
		System.out.println("Received frame is: " + rec_data[i]);
	}dis.close();dos.close();s.close();
}}
