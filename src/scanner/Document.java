package scanner;

import java.util.LinkedList;

import scanner.GlyphFactory.Glyph;

public class Document {
	
	 LinkedList<Glyph> glyphList = new LinkedList<Glyph>();
	

	
	public void in (Glyph glyph){
		glyphList.add(glyph);
	}
	
	@Override
	public String toString(){
		char[] chars  = new char[glyphList.size()];
		for(int i=0; i< glyphList.size(); i++){
			chars[i] = glyphList.get(i).theChar;
		}
		return new String(chars);
	}

}
