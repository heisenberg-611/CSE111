public class Vehicle2010 extends Vehicle {
    public void moveLowerLeft(){
        moveDown();
        moveLeft();
    }
    public void moveUpperRight(){
        moveUp();
        moveLeft();
    }
    public void moveLowerRight(){
        moveDown();
        moveRight();
    }
}
