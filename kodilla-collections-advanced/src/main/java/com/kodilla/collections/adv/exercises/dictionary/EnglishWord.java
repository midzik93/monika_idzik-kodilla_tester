package com.kodilla.collections.adv.exercises.dictionary;

public class EnglishWord {

    // reprezentowanie pojedyńczego słowa po ang
    private PartOfSpeech partOfSpeech;
    private String word;

    public EnglishWord(PartOfSpeech partOfSpeech, String word) {
        this.partOfSpeech = partOfSpeech;
        this.word=word;

    }
    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getWord() {
        return word;
    }
}
