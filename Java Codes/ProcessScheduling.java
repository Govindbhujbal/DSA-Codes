package learningJava;
import Process;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessScheduling 
{

	static ArrayList<Process> PS= new ArrayList();
	static ArrayList<Process> PS_SJF= new ArrayList();
	public static void main(String[] args) 
	{
		Process p = null;
		Double at,bt;
		System.out.print("Enter total number of processes:");
		Scanner sc=new Scanner(System.in);
		int no=Integer.parseInt(sc.next());	
		System.out.println("ENTER INPUT IN INCREASING ORDER OF ARRIVAL TIME"); 
		for(int i=0;i<no;i++)
		{
			System.out.print("Enter Arrival & Burst time of process "+(i+1)+": ");			
			at=Double.parseDouble(sc.next());						
			bt=Double.parseDouble(sc.next());
			p = new Process(at,bt,0.0,0.0,0.0,0.0,0,0.0);
			PS.add(p);			
		}		
		System.out.println(PS);
		while(true)
		{
			System.out.println("***********Menu***********");
			System.out.println("1.FCFS");
			System.out.println("2.Preemptive SJF");
			System.out.println("3.Preemptive PRIORITY");
			System.out.println("4.Non Preemptive PRIORITY");
			System.out.println("5.RR");
			System.out.println("5.Exit");
			System.out.print("Enter Your Choice:");
			int ch=Integer.parseInt(sc.next());
			switch(ch)
			{
			case 1: fcfs(no);break;
			case 2: sjf(no,ch);break;
			case 3: prio(no,ch);break;
			case 4: nonprio(no,ch);break;				
			case 5: rr(no,ch); break;
			case 6: break;
			}
		}
	}
	static void fcfs(int no)
	{
		System.out.println("fcfs");
		for(int i=0;i<no;i++)		
		{
			if(i==0)
			{
				PS.get(i).FT=PS.get(0).AT+PS.get(i).BT;
				PS.get(i).WT=0.0;			
			}
			else
			{
				PS.get(i).FT=PS.get(i-1).FT+PS.get(i).BT;
				PS.get(i).WT=PS.get(i-1).FT-PS.get(i).AT;
			}
			PS.get(i).TAT=PS.get(i).WT+PS.get(i).BT;
		}		
		System.out.println(PS);
	}
	static int arrived(Double t, int no)
	{
		for(int i=0;i<no;i++)
		{
			if((PS.get(i).UAT<=t)&& PS.get(i).CBT!=0.0)
				return 1;			
		}
		return 0;
	}
	static int getmin(Double t,int no,int ch)
	{
		if(ch==2)
		{	
			int i,mini=0;
			Double min=99.0;
			for(i=0;i<no;i++)
			{
				if(PS.get(i).AT<=t && PS.get(i).CBT<min && PS.get(i).CBT!=0.0)
				{				
					min=PS.get(i).CBT;
					mini=i;
				}
			}				
			return mini;
		}
		else
		{
			if(ch==3||ch==4) 
			{
				int i,mini=0;
				int min=99;
				for(i=0;i<no;i++)
				{
					if(PS.get(i).AT<=t  && PS.get(i).CBT!=0.0)
					{	
						if(PS.get(i).priority==min)
						{							
							if(PS.get(i).AT<PS.get(mini).AT)
								mini=i;								
							min=PS.get(mini).priority;														
						}
						if(PS.get(i).priority<min)
						{
							min=PS.get(i).priority;
							mini=i;
						}												
					}
				}				
				return mini;				
			}
		}
		if(ch==5)
		{	
			int i,mini=0;
			Double min=99.0;
			for(i=0;i<no;i++)
			{								
				if(PS.get(i).UAT<=t && PS.get(i).CBT!=0.0)
				{					
					if(PS.get(i).UAT<min)
					{
						min=PS.get(i).UAT;
						mini=i;						
					}
					if(PS.get(i).UAT.equals(min) && i!=0 && PS.get(i-1).AT < PS.get(i-1).UAT)
					{
						min=PS.get(i).UAT;
						mini=i;					
					}				
					
				}				
			}				
			return mini;
		}
		return 0;
	}
	static void sjf(int no,int ch)//5 0 3 1 5 3 2 9 5 12 5 INPUT
	{	
		
		int i=0,finish=0;
		Double time=0.0;		
		while(finish!=no)
		{			
			if(arrived(time,no)!=0)			
			{
				i=getmin(time,no,ch);			
				time++;
				PS.get(i).CBT--;
				PS.get(i).FT=time;
				if(PS.get(i).CBT==0)
				{
					finish++;					
					PS.get(i).TAT=time-PS.get(i).AT;
					PS.get(i).WT=PS.get(i).TAT-PS.get(i).BT;
				}				
			}
			else
			{
				time++;
				System.out.println("time:"+time);
			}			
		}		
		System.out.println(PS);		
	}
	static void prio(int no,int ch)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("prio");
		System.out.println("Enter priorities:");
		for(int k=0;k<no;k++)
		PS.get(k).priority=Integer.parseInt(sc.next());
		System.out.println("prio");
		int i=0,finish=0;
		Double time=0.0;		
		
		while(finish!=no)
		{			
			if(arrived(time,no)!=0)			
			{
				i=getmin(time,no,ch);			
				time++;
				PS.get(i).CBT--;
				PS.get(i).FT=time;
				if(PS.get(i).CBT==0)
				{
					finish++;					
					PS.get(i).TAT=time-PS.get(i).AT;
					PS.get(i).WT=PS.get(i).TAT-PS.get(i).BT;
				}				
			}
			else
			{
				time++;
				System.out.println("time:"+time);
			}			
		}		
		System.out.println(PS);
		
	}
	static void nonprio(int no,int ch)
	{	//input 6 4 6 6 3 3 4 2 2 1 1 2 2       prio  4 5 6 6 7 3
		Scanner sc= new Scanner(System.in);
		System.out.println("non pre prio");
		System.out.println("Enter priorities:");
		for(int k=0;k<no;k++)
			PS.get(k).priority=Integer.parseInt(sc.next());		
		int i=0,finish=0;
		Double time=0.0;		
		
		while(finish!=no)
		{			
			if(arrived(time,no)!=0)			
			{
				i=getmin(time,no,ch);			
				time=time+PS.get(i).BT;
				PS.get(i).CBT=0.0;
				PS.get(i).FT=time;
				if(PS.get(i).CBT==0)
				{
					finish++;					
					PS.get(i).TAT=time-PS.get(i).AT;
					PS.get(i).WT=PS.get(i).TAT-PS.get(i).BT;
				}				
			}
			else
			{
				time++;
				System.out.println("time:"+time);
			}			
		}		
		System.out.println(PS);
		System.out.print("Average Waiting Time(AWT):");
		Double j=PS.get(0).WT;
		for(i=1;i<no;i++)
		{
			j=j+PS.get(i).WT;
		}
		j=j/no;
		System.out.println(j);
		System.out.print("Average Turnaround Time(ATAT):");
		j=PS.get(0).TAT;
		for(i=1;i<no;i++)
		{
			j=j+PS.get(i).TAT;
		}
		j=j/no;
		System.out.println(j);
	
	}
	static void rr(int no,int ch)
	{
		System.out.println("rr");
		System.out.println("Enter time slice:");
		Scanner sc=new Scanner(System.in);
		Double ts=sc.nextDouble();
		int i=0,finish=0;
		Double time=PS.get(0).UAT;		
		while(finish!=no)
		{			
			if(arrived(time,no)!=0)			
			{
				i=getmin(time,no,ch);
				//System.out.println("i:"+i);						
								
				if(PS.get(i).CBT<ts)
				{
					time=time+PS.get(i).CBT;
					PS.get(i).CBT=0.0;					
				}
				if(PS.get(i).CBT>=ts)
				{
					time=time+ts;
					PS.get(i).CBT=PS.get(i).CBT-ts;					
				}
				PS.get(i).FT=time;
				PS.get(i).UAT=time;//PS.get(i).UAT+ts;				
				if(PS.get(i).CBT==0)
				{
					finish++;					
					PS.get(i).TAT=time-PS.get(i).AT;
					PS.get(i).WT=PS.get(i).TAT-PS.get(i).BT;
					//System.out.println("Process:"+(i+1) +" finished");
				}				
			}
			else
			{
				time=time+ts;				
	}			
		}		
		System.out.println(PS);
		System.out.print("Average Waiting Time(AWT):");
		Double j=PS.get(0).WT;
		for(i=1;i<no;i++)
		{
			j=j+PS.get(i).WT;
		}
		j=j/no;
		System.out.println(j);
		System.out.print("Average Turnaround Time(ATAT):");
		j=PS.get(0).TAT;
		for(i=1;i<no;i++)
		{
			j=j+PS.get(i).TAT;
		}
		j=j/no;
		System.out.println(j);		
	}
}
