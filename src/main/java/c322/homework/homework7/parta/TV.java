package c322.homework.homework7.parta;



public class TV {
    RemoteControl on;
    RemoteControl off;
    RemoteControl state;
    public TV(RemoteControl state){
        this.setState(state);
    }
    public void pressButton(){
        state.pressSwitch(this);
    }
    public RemoteControl getState(){
        return state;
    }
    public void setState(RemoteControl state){
        this.state=state;
    }
}
