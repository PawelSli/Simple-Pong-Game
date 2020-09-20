import java.awt.*;

public class Paddle {

    public int paddleNumber; //determin which side of the screen is avalaible to player

    public int x,y,width=50,height=250;

    public int score; //overall score

    public Paddle(Pong pong,int paddleNumber){
        this.paddleNumber=paddleNumber;

        if(paddleNumber==1){
            this.x=0; //player of the left side of the screen
        }
        if(paddleNumber==2){
            this.x=pong.width-width; // player of the ride side of the screen
        }
        this.y=pong.height/2-this.height/2;

    }

    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x,y,width,height);
    }

    public void move(boolean up){
        int speed=15;
        if(up){
            if(y-speed>0){
                y-=speed;
            }else{
                y=0;
            }
        }else{
            if(y+height+speed<Pong.pong.height){
                y+=speed;
            }else{
                y=Pong.pong.height-height;
            }
        }
    }
}
