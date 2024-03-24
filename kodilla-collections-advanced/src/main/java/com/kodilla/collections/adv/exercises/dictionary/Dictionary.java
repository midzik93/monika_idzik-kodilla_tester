package com.kodilla.collections.adv.exercises.dictionary;


import java.util.*;

public class Dictionary {

    //dodanie słów do słownika i wyszukiwanie

    //przechowywanie słów w mapie

    //klasa ta przechowywała wpisy słownika w mapie

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) { //szukanie na podstawie polskiego słowa
        return Collections.emptyList(); // <- tworzy i zwraca pustą listę (nie musimy tworzyć oddzielnie)
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        return Collections.emptyList();   //szukanie na podstawie polskiego + jaka część mowy
    }

    public int size() {
        return dictionary.size();
    }
}
