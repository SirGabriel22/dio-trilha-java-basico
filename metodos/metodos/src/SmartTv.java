public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 27;

    public void ligarSmartTv(){
        ligada = true;
    }

    public void desligarSmartTv(){
        ligada = false;
    }

    public void diminuirVolume(){
        if (volume <= 0){
            System.out.println("Volume mínimo atingido!");
        }

        else{
            volume-=1;
        }
    }

    public void aumentarVolume(){
        if (volume >= 100){
            System.out.println("Volume máximo atingido!");
        }
        else{
            volume++;
        }
    }
}
