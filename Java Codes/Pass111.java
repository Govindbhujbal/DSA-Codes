package learningJava;
import java.util.*;
import java.io.*;
public class Pass111
{
	static int address=0;
	static int sadd[]=new int[10];
        static int ladd[]=new int[10];
        public static void main(String args[])
        {

                BufferedReader br;
                OutputStream oo;
                String input=null;
                
                String IS[]={"ADD","SUB","MULT","MOVER"};
                String UserReg[]={"AREG","BREG","CREG"};
                String AD[]={"START","END"};
                String DL[]={"DC","DS"};
                int lc=0;
                int scount=0,lcount=0;
                int flag=0,flag2=0,stored=0;
                
                String tokens[]=new String[30];
                String tt=null;
                
                String sv[]=new String[10];
                String lv[]=new String[10];
                
               
                
                
           
                try
                {
                        br=new BufferedReader(new FileReader("C:\\Users\\aai aani aappa\\Desktop\\ptr22 spos\\input1"));
                      //  System.out.println("hello");
                        File f = new File("C:\\Users\\aai aani aappa\\Desktop\\ptr22 spos\\IC");
                        File f1 = new File("C:\\Users\\aai aani aappa\\Desktop\\ptr22 spos\\ST");
                        File f2 = new File("C:\\Users\\aai aani aappa\\Desktop\\ptr22 spos\\LT");
                        PrintWriter p = new PrintWriter(f);
                        PrintWriter p1 = new PrintWriter(f1);
                        PrintWriter p2 = new PrintWriter(f2);
			            int k=0,l=0;
                        while ((input = br.readLine()) != null)
                        {
            StringTokenizer st = new StringTokenizer(input," "); 
                       while (st.hasMoreTokens())   
                                             {
                                                  tt=st.nextToken();  
                                                      System.out.println(tt);        
                                                              
                                           if(tt.matches("\\d*")&& tt.length() > 2)
       {
                                            lc=Integer.parseInt(tt);
      p.println(lc);
      
      address=lc-1; 
      
                                             }
      else
      {
          for(int i=0;i<AD.length;i++)
				                          {
				                         if(tt.equals(AD[i]))
				                        {  p.print("AD "+(i+1)+" ");
									       
    									}
				                                                       
				                      } 
				                                            
				                     for(int i=0;i<IS.length;i++)
                                    		 {
		                                       if(tt.equals(IS[i]))
		                                    {
		                                            p.print("IS "+(i+1)+" ");
		                                            }
                                                                       } 
                                              for(int i=0;i<UserReg.length;i++)
                                              		{
		                                      if(tt.equals(UserReg[i]))
		                                           {
		                                     
											 p.print((i+1)+" ");
		                                      flag=1;
		                                      }
		                                                            
													} 	
                                          for(int i=0;i<DL.length;i++)
										  {
		                                   if(tt.equals(DL[i]))
		                                  {
		                                   p.print("DL "+(i+1)+" ");
		                                   }
                                            }
                           if(tt.length()==1 && !(st.hasMoreTokens()) && flag==1)
                                                {
                                                                        
		                                           if ( Arrays.asList(sv).contains(tt) ) 
		                                          {
		                                                                       
		                                                for(int i=0;i<scount;i++)
		                                                  {
		                                                    if(sv[i].equals(tt))
		                                                  	{
		                                                  		p.print("S"+i);	 
		                                                      		flag2=1;
		                                               	}
		                                              	else
		                                          	{
		                                                  		flag2=0;
		                                             	}
		                                          }
		                                                                                       
		                                                                                }
		                                                                                else
		                                                                                {
		                                                                                	p.print("S"+scount);
		                                                                       		sv[scount]=tt;
		                                                                       		flag2=1;
		                                                                       		scount++;
		                                                                                }
                                                            
                                                                       }
                                                                     
                                                                       if(tt.length()==1 && (st.hasMoreTokens()))
                                                                       {
                                                                       		p.print(tt+" ");
                                                                       		
                                                                       		sadd[k]=address;k++;
                                                                       		
                                                                       }
                                                                       
                                                                       
                                                                       if(tt.charAt(0)=='=')
                                                                       {
                                                                       		p.print("L"+lcount);
                                                                       		lv[lcount]=tt;
                                                                       		lcount++;
                                                                       }
                                                                       if(!st.hasMoreTokens())
		                                                               {
		                                                               		p.println();
		                                                               }	
		                                                               
		                                                       if(tt.equals("DS"))
		                                                       {
		                                                       		int a=Integer.parseInt(st.nextToken());
		                                                       	
	                                                       			address=address+a-1;
	                                                       			
		                                                       		p.println();
		                                                       }
		                                                       
                                                               }
                                                               
                                                        
                                                  
                                       }
                                      //System.out.println();
                                      address++;
                        } p.close();
                        address--;
                        
                        for(int i=0;i<lcount;i++)
                        {
                        	ladd[i]=address;
                        	address++;
                        }
                        
                        
                        
                        for(int i=0;i<scount;i++)
                        {
                        	p1.print(i+"\t"+sv[i]+"\t"+sadd[i]);
                        }p1.close();
                        
                        for(int i=0;i<lcount;i++)
                        {
                        	p2.print(i+"\t"+lv[i]+"\t"+ladd[i]);
                        }p2.close();
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
        }
       
} 

