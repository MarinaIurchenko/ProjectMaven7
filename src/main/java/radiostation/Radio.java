package radiostation;
public class Radio {
    private int radioVolume;
    private int numberStation;

    public int getNumberStation() {
        return numberStation;
    }
    public int getRadioVolume(){
        return numberStation;
    }
    public void setNumberStation(int newNumberStation ){
        if (newNumberStation > 9){
            return;
        }
        if (newNumberStation < 0){
            return;
        }
        numberStation = newNumberStation;
    }
    public void nextNumberStation(){
        if ( numberStation == 9){
            setNumberStation(0);
        } else {
            numberStation++;
        }
    }
    public void prevNumberStation(){
        if (numberStation == 0){
            setNumberStation(9);
        }else {
            numberStation++;
        }
    }
    public void setRadioVolume(int newRadioVolume){
        if (newRadioVolume < 0){
            return;
        }
        if (newRadioVolume > 100){
            return;
        }
        radioVolume = newRadioVolume;
    }
    public void increaseRadioVolume(){
        if (radioVolume < 100){
            setRadioVolume(radioVolume + 1);
        }
    }
    public void decreaseRadioVolume(){
        if (radioVolume > 0){
            setRadioVolume(radioVolume - 1);
        }
    }
}
