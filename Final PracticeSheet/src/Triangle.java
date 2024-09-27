public class Triangle {
    private int length, width, height;
    Triangle(){
        this.length = 3;
        this.width = 4;
        this.height = 5;
    }
    Triangle(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public int area(){
        return length*width*height;
    }
    public int perimeter(){
        return length+width+height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getlength(){
        return length;
    }
    public int getwidth(){
        return width;
    }
    public int getheight(){
        return height;
    }
}