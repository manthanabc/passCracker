import java.util.*;
import java.util.Date;
//import java.time.ZonedDateTime;
class run
{
	public static void main(String[] args){

		Scanner s=new Scanner(System.in);

		System.out.println("Enter string");

		char[] abcd = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' ,'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		String pass=s.nextLine();
		char[] pas=new char[5];
		long startTime = System.currentTimeMillis();
		long endTime =0;
		long tries=0;

    for(int k=0;k<5;k++)
		pas[k]=' ';

	a:for(int a=0 ; a < abcd.length; a++)
	{
	  	pas[4]=abcd[a];
		for(int b=0 ; b<abcd.length ; b++)
		{
          //System.out.print((char)b);
		  pas[3]=abcd[b];
          for(int d=0 ; d<abcd.length ; d++)
          {
            pas[2]=abcd[d];
            for(int e=0 ; e<abcd.length ; e++)
            {
                pas[1]=abcd[e];
                for(int c=0 ; c<abcd.length; c++)
                {
   					pas[0]=abcd[c];
	  			    tries++;
                  	if(cheackdone(pas,pass))
                  	{
                   		System.out.println("\n Cracked");
	    				endTime=System.currentTimeMillis();
                    	break a;
                  	}

                  	if(c==26 && a==26)
                  	{
                       System.out.println("failed");
                       return;
                  	}
				}
         	}
        }
	}
}




		///output //


   	    System.out.print("\n Password is : ");

		for(int i=0;i< pas.length;i++)
		{

			System.out.print(pas[i]);
		}

		System.out.print("\n Time taken  : "+((endTime-startTime)/1000)+" Seconds ["+(endTime-startTime)+" millsec]");
		System.out.println("\n Tries taken : "+tries+"\n");//includes something idk thset
	}

	static boolean cheackdone(char[] in,String u){
		char[] ori=u.toCharArray();
		for(int i=0;i<ori.length;i++){
			if(ori[i] != in[i]){
				return false;
			}
		}
		System.out.println(in);
		return true;
	}
}

