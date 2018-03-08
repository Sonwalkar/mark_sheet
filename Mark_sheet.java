import java.util.*;
class Headline
{
	 Scanner sc=new Scanner(System.in);
	 String name;
	 int eno;
	 int sno;
	 int semister;
	public void hl()
	{
		System.out.println("\t\tMAHARASHTRA STATE BOARD OF TECHNICAL EDUCATION");
		System.out.println("\t\t\t\tSTATEMENT OF MARKS");
	}
	public void accept()
	{
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter Enrollment no");
		eno=sc.nextInt();
		System.out.println("Enter Seatno");
		sno=sc.nextInt();
		System.out.println("Enter semister no");
		semister=sc.nextInt();
	}
	public void printhl()
	{
		System.out.print("  NAME:"+name);
		System.out.print("\tENROLLMENT NO:"+eno);
		System.out.print("\tSEAT NO:"+sno);
		System.out.print("\t"+semister+"th SEMISTER");
	}
}
class AcceptMark extends Headline
{
	Scanner sc=new Scanner(System.in);
	 int m;
	 int h;
	 int e;
	 int ma;
	 int hi;
	 int ge;
	 int se;
	 int total;
	 float per;
	 int cnt=0;
	 int des=0;
	 int fc=0;
	 int sec=0;
	 int fail=0;
	public void title()
	{
		System.out.print("\n\t\t");
	    System.out.print("\t");
	    System.out.print("\t");
	    System.out.print("\t\n");
	}
	public void amarks()
	{
		System.out.println("Enter marks of subjects");
	    System.out.println("BEHAVIOURAL SCIENCE:");
	    m=sc.nextInt();
	    System.out.println("OPERATING SYSTEM:");
	    h=sc.nextInt();
        System.out.println("INFORMATION SECURITY:");
	    e=sc.nextInt();
	    System.out.println("SOFTWARE ENGINEERING:");
	    ma=sc.nextInt();
        System.out.println("JAVA PROGRAMMING:");
	    hi=sc.nextInt();
	    System.out.println("COMMUNICATION TECHNOLOGY:");
	    ge=sc.nextInt();
		System.out.println("Sectional:");
	    se=sc.nextInt();
	}
	public void subject()
	{
		System.out.println("\tTITLE OF SUBJECT\tMAX MARKS\tMIN MARKS\tMARKS OBTAINED");
		System.out.print("\tBEHAVIOURAL SCIENCE:\t100\t\t40\t\t"+m);
		if(m<40)
			System.out.print("*");
		System.out.print("\n\tOPERATING SYSTEM:\t100\t\t40\t\t"+h);
		if(h<40)
			System.out.print("*");
		System.out.print("\n\tINFORMATION SECURITY:\t100\t\t40\t\t"+e);
		if(e<40)
			System.out.print("*");
		System.out.print("\n\tSOFTWARE ENGINEERING:\t100\t\t40\t\t"+ma);
		if(ma<40)
			System.out.print("*");
		System.out.print("\n\tJAVA PROGRAMMING:\t100\t\t40\t\t"+hi);
		if(hi<40)
			System.out.print("*");
		System.out.print("\n\tCOMMUNICATION \n\tTECHNOLOGY:\t\t100\t\t40\t\t"+ge);
		if(ge<40)
			System.out.print("*");
		System.out.print("\n\tSECTIONAL:\t\t100\t\t40\t\t"+se);
	}
	public void calculate()
	{
		
		total=m+h+e+ma+hi+ge+se;
	    per=((total)*100)/650;
	}
	public void printc()
	{
		System.out.print("\n\t\t\t\tTotal Marks:650");
		if(cnt==0)
		System.out.print("\tResult with%:"+per);
		else
		System.out.print("\tResult with%:");
		System.out.print(" Marks obtained:"+total);
		if(cnt==1)
		System.out.println("\n\t\t\t\t\t\tA.T.K.T");
		if(des==1)
		System.out.println("\n\t\t\t\t\t\tDESTINGTION");
		if(fc==1)
		System.out.println("\n\t\t\t\t\t\tFirst class");
		if(sec==1)
		System.out.println("\n\t\t\t\t\t\tSecond class");
		if(fail==1)
		System.out.println("\n\t\t\t\t\t\tFail");
	}
	public void classs()
	{
		if(m<40||h<40||e<40||ma<40||hi<40||ge<40)
		{
		cnt++;
		}
		else if(per>75)
		{
		des++;
		}
		else if(per>60)
		{
		fc++;
		}
		else if(per>40)
		{
		sec++;
		}
		else if(per>40)
		{
		fail++;
		}	
	}
}
class Mark_sheet
{
     public static void main(String args[])
	 {
         		 
		 Headline he=new Headline();
		 AcceptMark acc=new AcceptMark();
		 he.hl();
		 he.accept();
		 acc.amarks();
		 acc.calculate();
		 he.hl();
		 he.printhl();
		 acc.title();
		 acc.subject();
		 acc.classs();
		 acc.printc();
		 
	 }	 
}