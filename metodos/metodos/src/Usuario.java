public class Usuario {
    public static void main(String[] args){
        
        SmartTv aparelho = new SmartTv();

        System.out.println("SmartTv Ligada? " + aparelho.ligada);
        System.out.println("Canal atual: " + aparelho.canal);
        System.out.println("Volume atual: " + aparelho.volume);

        aparelho.ligarSmartTv();

        System.out.println("SmartTv ligada? " + aparelho.ligada);

        aparelho.diminuirVolume();
        aparelho.diminuirVolume();
        aparelho.diminuirVolume();

        System.out.println("Volume atual: " + aparelho.volume);

        aparelho.aumentarVolume();

        System.out.println("Volume atual: " + aparelho.volume);

        aparelho.mudarCanal(13);

        System.out.println("Canal atual: " + aparelho.canal);
    }
}
