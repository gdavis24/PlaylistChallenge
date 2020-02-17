package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int goUp = 1;
        int goDown = 1;

        for (int i = 1; i < playList.length; i++) {
            if (!(playList[(startIndex + i) % playList.length].equals(selection))) {
                goUp++;
            } else {
                break;
            }
            if (!(playList[((startIndex - i) + playList.length) % playList.length].equals(selection))) {
                    goDown++;
                }
                else {
                    break;
                }
            }

            if (goUp > goDown) {
                return goDown;
            }

            return goUp;
        }

}
