package scanner;

import java.util.HashMap;

//a flyweight class implemented as a singleton
public class GlyphFactory {
	
	// This is an Inner class of the class GlyphFactory
	public class Glyph {
		public char theChar;

		// the constructor is private which means that only GlyphFactory can create an instance of Glyph
		private Glyph(char c) {
			theChar = c;
		}
	}
	
	private static GlyphFactory instance; // singeleton instance
	private HashMap<Character, Glyph> glyphPool;
	
	private GlyphFactory(){ // singleton private constructor
		glyphPool = new HashMap<Character, Glyph>();
	}

	public static GlyphFactory getInstance() {
		if(instance==null){
			instance = new GlyphFactory();
		}
		return instance;
	}
	// flyweight method insures that only one instance of a particular glyph is created
	
	public Glyph getGlyph(char c) { 
		Glyph glyph = glyphPool.get(c);
		if(glyph==null){
			glyph = new Glyph(c);
			glyphPool.put(c, glyph);
		}
		return glyph;
	}

}
