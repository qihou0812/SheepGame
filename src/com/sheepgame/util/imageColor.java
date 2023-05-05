package com.sheepgame.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.nio.Buffer;

public class imageColor {
    public static void inverse(String imgPath,String fileUrl){
        try {
            FileInputStream fileInputStream=new FileInputStream(imgPath);
            BufferedImage Image= ImageIO.read(fileInputStream);
            int w=Image.getWidth();
            int h=Image.getHeight();
            BufferedImage bufferedImage=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
