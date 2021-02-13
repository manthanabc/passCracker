import math
import time

def char_string(chararr):
	stringg =''
	for c in chararr:
		stringg += c
	return stringg

def isvalid(raw_pas, password):
	pas = char_string(raw_pas)
	pas = pas.strip()
	if password != pas:
		return False
	print(' Cracked\n')
	print(' Password is : ', pas)
	return True


opassword = input()

starttime = time.time()
endtime = 0
tries = 0

abcd = [' ','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' ,'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

pas = ['','','','','']

for a in abcd :
	pas[4] = a
	for b in abcd :
		pas[3] = b
		for d in abcd :
			pas[2] = d
			for e in abcd :
				pas[1] = e
				for f in abcd :
					pas[0] = f
					tries += 1
					if isvalid(pas, opassword):
						endtime= time.time()
						print(' Time taken  : ',endtime-starttime)
						print(' Tries taken : ',tries)
						exit()
