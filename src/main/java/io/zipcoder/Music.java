package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int goUp = 0;
        int goDown = 0;

        for (int i = startIndex; i < playList.length; i++) {
            if (!(playList[i % playList.length].equals(selection))){
                goUp++;
            }
            else{
                break;
            }
        }

        for (int i = startIndex; i >= 0; i--) {
            if (!(playList[i % playList.length].equals(selection))){
                goDown++;
            }
            else{
                break;
            }
        }
        if (goUp > goDown){
            return goDown;
        }

        return goUp;
    }
}
