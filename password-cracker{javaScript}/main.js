
let pass = "manth";
let start = Date.now();
let end = 0
let tries = 0 ;
let abcd = [' ','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' ,'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']; 
let pas = ['','', '','', '']

const is_ valid = function(pass, arr){

	let back = arr.join("")

	if (back.trim() == pass) {
		console.log("\n Cracked\n")
		console.log(" Password is : ", back)
		return true
	} else {
		return false
	}
}

a:for(a=0 ; a < abcd.length; a++)
{
	  	pas[4]=abcd[a];
		for(b=0 ; b<abcd.length ; b++)
		{
          //System.out.print((char)b);
		  pas[3]=abcd[b];
          for(d=0 ; d<abcd.length ; d++)
          {
            pas[2]=abcd[d];
            for(e=0 ; e<abcd.length ; e++)
            {
                pas[1]=abcd[e];
                for(c=0 ; c<abcd.length; c++)
                {
   					pas[0]=abcd[c];
	  			    tries++;
                  	if(is_valid(pass,pas))
                  	{
	    				end=Date.now();
                    	break a;
                  	}

                  	if(c==26 && a==26)
                  	{
                       console.log("failed");
                       return;
                  	}
				}
         	}
        }
	}
}

console.log(" Time taken :  ", end - start);
console.log(" Tries taken : ", tries);