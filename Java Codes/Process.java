package learningJava;
public class Process 
{
	Double AT,BT,FT,TAT,WT,CBT,UAT;
	int priority;
	
	Process(Double A,Double B,Double F,Double T,Double W,Double cbt,int priority,Double UAT )
	{
		this.AT= A;
		this.BT = B;
		this.FT = F;
		this.TAT = T;
		this.WT = W;	
		this.CBT = B;
		this.priority = priority;
		this.UAT= A;
	}

	@Override
	public String toString() {
		return "\n [AT=" + AT + ", BT=" + BT + ", FT=" + FT + ", TAT=" + TAT + ", WT=" + WT + ", CBT=" + CBT
				+ ", UAT=" + UAT + ", priority=" + priority + "]";
	}

	
	
	
	
}
