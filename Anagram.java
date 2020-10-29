package Iva;

import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word or phrase!");
		String firstWord = sc.nextLine();
		System.out.println("Enter the second word or phrase!");
		String secondWord = sc.nextLine();
		sc.close();
		
        boolean isAnAnagram = true;
        int firstLength = firstWord.length();
		String copySecondWord = secondWord;
        for(int i = 0; i < firstLength; i++) {
        	char currentChar = firstWord.charAt(i);
        	if(currentChar >= 'a' && currentChar <= 'z' || currentChar >= 'A' && currentChar <= 'Z') {
        		int indexOfChar = copySecondWord.indexOf(currentChar);
        		if(indexOfChar == -1) {
        			isAnAnagram = false;
        			break;
        		
        		
        		}  else {
        			copySecondWord = copySecondWord.substring(0, indexOfChar) + copySecondWord.substring( indexOfChar + 1); 
        		
        	System.out.println(copySecondWord);
        	}
        }
	}
	if(isAnAnagram){
		int charsLeftSecondWord = copySecondWord.length();
		
		for(int i = 0; i < charsLeftSecondWord; i++){
			
			char currentChar = copySecondWord.charAt(i);
			if(currentChar >= 'a' && currentChar <= 'z' || currentChar >= 'A' && currentChar <= 'Z'){
				isAnAnagram = false;
				break;
			}
			
		}
		
		}
	System.out.println(isAnAnagram ? "is an anagram" : "isn't an anagram");
	}
}
