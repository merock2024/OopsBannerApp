/* 
UC7- 


*/



import java.util.Arrays;

// Creating the OOPS Banner App Class 
public class OOPSBannerApp {

    /*
    Creating the CharacterPatternMap class that will have class attributes character and pattern.
    basically trying to create the key value pairs, where key is character and the value
    is pattern that we want against that character in the display which will be a String 
    Array of the asterisk.
    */

    static class CharacterPatternMap {
        // Created the Class Variables character and pattern
        char character;
        String[] pattern;

        public characterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // function to get character
        public char getCharacter() {
            return this.character;
        }

        // function to get pattern
        public String[] getPattern() {
            return this.pattern;
        }
    }

    //To create the characterpattern map
    public static characterPatternMap[] createCharacterMap() {

        String[] oPattern = {
			"   ***    ",
			" **   **  ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			" **   **  ",
			"   ***    "
		};

		String[] pPattern = {
			"******    ",
			"**    **  ",
			"**     ** ",
			"**    **  ",
			"******    ",
			"**        ",
			"**        ",
			"**        ",
			"**        "
		};

		String[] sPattern = {
			"   ***** ",
			" **      ",
			"**       ",
			" **      ",
			"   ***   ",
			"      ** ",
			"       **",
			"      ** ",
			"*****    ",


		};

        // The Fail safe, so if the character is not any of O, P and S
		String[] spacePattern = {
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
		};

        return new characterPatternMap[] {
            new CharacterPatternMap('O', oPattern),
			new CharacterPatternMap('P', pPattern),
			new CharacterPatternMap('S', sPattern),
			new CharacterPatternMap(' ', spacePattern)
        };


    }

    // Getting the String Array against the character

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps){
        // Use the For each loop, check for each character and return the pattern against it.
		for(CharacterPatternMap cMap : charMaps){
			if(cMap.getCharacter() == ch) return cMap.getPattern();
		}

		if(ch != ' ') return getCharacterPattern(' ', charMaps);

		return null;
	}

    public static void printMessage(String message, CharacterPatternMap[] charMaps){
        // Since the rows are 9 , created a 2d array with columns as 9, and row as message .length.
		String[][] chars = new String[9][message.length()];

        // The chars 2d array first we have filled the pattern at i indices.
		for(int i = 0; i < message.length(); i++){
			chars[i] = getCharacterPattern(message.charAt(i), charMaps);
		}
		
        // Printed the 2d matrix here.
		for(int i = 0; i < message.length; i++){
			for(int j = 0; j < 9; j++){
				System.out.print(chars[i][j]);
			}
			System.out.println();
		}
    }

    public static void main(String[]args){
		CharacterPatternMap[] charMaps = createCharacterPatternMaps();
		String message = "OOPS";
		printMessage(message, charMaps);
	}
}