package edu.luc.cs271.wordcount;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/** A map-based class for counting word frequencies from an iterator. */
public class WordCounter {

  /** The map for storing the word counts. */
  private final Map<String, Integer> theMap;

  /** Creates a word counter instance based on the given map. */
  public WordCounter(final Map<String, Integer> theMap) {

    // DONE
    this.theMap = theMap;
    //this.theMap = null;

  }

  /** Counts the frequencies of all words in the given iterator. */
  public void countWords(final Iterator<String> words) {

    // DONE for each word in the iterator, update the corresponding frequency in the map
    // HINT to do this without a conditional, use the getOrDefault method
    
    for (word : words) {
      theMap.getOrDefault(word, getCount(word)); //OR theMap.getOrDefault(word, 1)
      
    }


  }

  /** Retrieve the frequency of a particular word. */
  public int getCount(final String word) {

    // DONE
    int count = theMap.get(word);
    return count;
    //return -1;

  }

  /** Retrieve the map representing all word frequencies. */
  public Map<String, Integer> getCounts() {
    return Collections.unmodifiableMap(theMap);
  }
}
