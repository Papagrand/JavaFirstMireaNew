package ru.mirea.task13.Task4;

public class Shirt {
    private String explanation;

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public static Shirt[] convertToShirtType(String[] stringsShirts){
        Shirt[] shirts=new Shirt[stringsShirts.length];
        for(int i=0;i< stringsShirts.length;i++){
            shirts[i]=new Shirt();
            shirts[i].setExplanation(stringsShirts[i]);
        }
        return shirts;
    }

    @Override
    public String toString() {
        return "explanation: "+explanation;
    }
}
