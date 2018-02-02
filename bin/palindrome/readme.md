# This java program finds the largest palindrome made by two three digits. 
	Function that reverses the integer
		loop through all the digits of the number starting from the last to the first
			add the first digit to a new a new string
		convert the string into a integer  
	Function checks if the number is a palindrome
		reverses the number
		if the reversed number is the same as the one we were given 
			return true
	Function find the largest palindrome
		loop through all the possible multiples between 100 and 999 because they are three digit numbers
			if the multiple is a palindrome and is bigger then the biggest one we have so far
				change the biggest palindrom
				