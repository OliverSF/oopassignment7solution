package scanner;

import java.util.Scanner;

import scanner.GlyphFactory.Glyph;

class SimpleWordProcessor {

	public static void main(String args[]){

		String s;
		Scanner in = null;
		try{
			in= new Scanner(System.in);
			while(true){
				System.out.print("Enter a string:");
				s = in.nextLine();

				if(s.equals("exit")){
					System.out.println("exiting ");
					break; // breaks out of the while loop
				}
				
				Document doc = new Document();
				
				char[] input = s.toCharArray();
				
				for(int i = 0; i< input.length; i++){
					//call the singleton GlyphFacory
					Glyph glyph = GlyphFactory.getInstance().getGlyph(input[i]);
					doc.in(glyph);
				}
				
				System.out.println(doc);

			}
		}finally{
			if(in!=null){
				in.close();
			}
		}
	}
}


