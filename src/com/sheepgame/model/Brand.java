package com.sheepgame.model;

import java.awt.*;

/*
    Brand means one card of the game.
 */
public class Brand extends Component{
    private String name;  //The name of the card
    private Boolean isGray; //it is gray or not
    private Image image;  //The image of the card
    private Image grayImage;  //The gray image of the card
    private Integer x;  //location of the card
    private Integer y;
    private Integer width;
    private Integer height;
    //The king of the brand class is name, so we set the name first
    //we can get the image by the brand's name from the imgs folder
    public Brand(String name){
        this.name = name;
        this.image= Toolkit.getDefaultToolkit().getImage("imgs\\"+name+".png");
        this.grayImage = Toolkit.getDefaultToolkit().getImage("imgs\\"+name+"_gray.png");
        this.isGray = false;
        this.width=50;
        this.height=50;
        this.x=0;
        this.y=0;
    }

    @Override
    public void paint(Graphics g) {
        if(this.isGray==true){
            //gray image
            g.drawImage(this.grayImage,this.x,this.y,null);
        }else{
            //normal image
            g.drawImage(this.image,this.x,this.y,null);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGray() {
        return isGray;
    }

    public void setGray(Boolean gray) {
        isGray = gray;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getGrayImage() {
        return grayImage;
    }

    public void setGrayImage(Image grayImage) {
        this.grayImage = grayImage;
    }

//    public Integer getX() {
//        return x;
//    }

    public void setX(Integer x) {
        this.x = x;
    }

//    public Integer getY() {
//        return y;
//    }

    public void setY(Integer y) {
        this.y = y;
    }

//    public Integer getWidth() {
//        return width;
//    }

    public void setWidth(Integer width) {
        this.width = width;
    }

//    public Integer getHeight() {
//        return height;
//    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
