import java.util.*;
class Scrabble {

  private int score = 0;
  private static final String[] allLetters = {"aeioulnrst", "dg", "bcmp", "fhvwy", "k", "jx", "qz"};
  private static final int scores[] = {1,2,3,4,5,8,10};
  Map<Character, Integer> mapLetterScores = new HashMap<Character, Integer>();

    Scrabble(String word) {
      for (int i = 0; i < allLetters.length; i++) {
        char [] allLettersToChars = allLetters[i].toCharArray();
        for (int j = 0; j < allLettersToChars.length; j++) {
          mapLetterScores.put(allLettersToChars[j], scores[i]);
        }
      }
      char [] letterToChars = word.toCharArray();
      for (int k = 0; k < letterToChars.length; k++) {
        this.score += mapLetterScores.get(letterToChars[k]);
      }
    }

    int getScore() {
        return score;
    }
}
