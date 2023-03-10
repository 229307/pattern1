public class LambdawithReturn
{
	interface reportcard
	{
		public int marksforsubjects(int mathematics,int physics,int biology,int history,int chemistry);
	}
	public static void main(String args[])
	{	
		reportcard am1=(int mathematics,int physics,int biology,int history, int chemistry)->
		{
			return(mathematics+physics+biology+history+chemistry);
		};
		System.out.println("The total of first student is"+am1.marksforsubjects(74,87,66,53,90));


		reportcard am2=(int mathematics,int physics,int biology,int history, int chemistry)->
		{
			return(mathematics+physics+biology+history+chemistry);
		};
		System.out.println("The total of first student is"+am1.marksforsubjects(40,40,50,60,70));


		reportcard am3=(int mathematics,int physics,int biology,int history, int chemistry)->
		{
			return(mathematics+physics+biology+history+chemistry);
		};
		System.out.println("The total of first student is"+am1.marksforsubjects(50,60,70,60,70));


		reportcard am4=(int mathematics,int physics,int biology,int history, int chemistry)->
		{
			return(mathematics+physics+biology+history+chemistry);
		};
		System.out.println("The total of first student is"+am1.marksforsubjects(65,56,95,65,78));


		reportcard am5=(int mathematics,int physics,int biology,int history, int chemistry)->
		{
			return(mathematics+physics+biology+history+chemistry);
		};
		System.out.println("The total of first student is"+am1.marksforsubjects(85,86,55,75,88));
	}
}

			