package ro.fasttrackit.curs9;

public class Fridge extends Electronics {
    private int temperature;
    private boolean plugged;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPlugged(boolean plugged) {
        this.plugged = plugged;
    }

    public void changeTemperature() {
        if (plugged) {
            this.temperature -= 20;
        }else {
            this.temperature=10;
        }


    }
}
