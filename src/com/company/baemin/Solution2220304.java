package com.company.baemin;
/**
 * 문자열 받아서 다시 더해주는 문제
 * 22.03.04
 * **/
public class Solution2220304 {
    int musicSpace = 0;
    int imagesSpace = 0;
    int moviesSpace = 0;
    int otherSpace = 0;

    public int classifyingFileType(String fileType, int fileSize) {
        switch (fileType) {
            case "mp3", "acc", "flac":
                return musicSpace += fileSize;
            case "jpg", "bmp", "gif":
                return imagesSpace += fileSize;
            case "mp4", "avi", "mkv":
                return moviesSpace += fileSize;
            default:
                return otherSpace += fileSize;
        }
    }

    public int getFileSizeByNumber(String fileSize) {
        return Integer.parseInt(fileSize.substring(0, fileSize.length() - 1));
    }

    public String solution(String s) {
        String[] files = s.split("\n");

        for (int i = 0; i <= files.length - 1; i++) {
            String fileName = files[i].split(" ")[0];
            String fileType = fileName.substring(fileName.lastIndexOf('.') + 1);
            int fileSize = this.getFileSizeByNumber(files[i].split(" ")[1]);

            this.classifyingFileType(fileType, fileSize);

        }

        return "music " + musicSpace + "b\n" + "images " + imagesSpace + "b\n" + "movies " + moviesSpace + "b\n" + "other " + otherSpace + "b";

    }
}
