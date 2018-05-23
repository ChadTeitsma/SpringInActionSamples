package com.chadteitsma.springtest.ch1;

public class BraveKnight implements Knight {
    private Quest quest;
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
