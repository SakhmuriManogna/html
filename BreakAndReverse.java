package mano;
		
		import java.util.*; 
		  
		class BreakAndReverse { 
		  
			 void wordreverse(String str) 
			{ 
			    Stack<Character> stack=new Stack<Character>(); 
			   
			    
			    for (int i = 0; i < str.length(); ++i) { 
			        if (str.charAt(i) != ' ') 
			            stack.push(str.charAt(i)); 
			   
			         
			        else { 
			            while (stack.empty() == false) { 
			                System.out.print(stack.pop()); 
			                  
			            } 
			            System.out.print(" "); 
			        } 
			    } 
			   
			
			    while (stack.empty() == false) { 
			        System.out.print(stack.pop()); 
			          
			    } 
			} 
			  
		
			public static void main(String[] args) 
			{ 
			   String str = "This is java Programming"; 
			   BreakAndReverse b=new BreakAndReverse();
			    b.wordreverse(str); 
			  } 
			}
