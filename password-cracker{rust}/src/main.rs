use std::time::Instant;

fn main() {
	let mut st = String::new();
	let b1 = std::io::stdin().read_line(&mut st).unwrap();
	let start = Instant::now();
	let mut tries = 0 ;
	let abcd:Vec<_> = [' ','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' ,'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'].to_vec(); 
	let mut ch:Vec<_> = [' ',' ', ' ',' ', ' '].to_vec();
	let st = st.trim();

	'mn:for a in &abcd {
		ch[4] = *a;	
		for b in &abcd {
			ch[3] = *b;
			for c in &abcd {
				ch[2] = *c;
				for d in &abcd {
					ch[1] = *d;
					for e in &abcd {
						ch[0] = *e;
						tries = tries + 1;
						if is_valid(&st, &ch){
							break 'mn;
						}
					}
				}
			}
		}
 	}

 	let elapsed = start.elapsed();
 	println!(" Time taken :  {}",elapsed.as_millis());
 	println!(" Tries taken : {}", tries);
}


fn is_valid(pass: &str , arr: &Vec<char>) -> bool{

	let back: String = arr.iter().collect();

	if back.trim() == pass {
		println!("\n Cracked\n");
		println!(" Password is : {}", back);
		return true
	} else {
		return false
	}
}