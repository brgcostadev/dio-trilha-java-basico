public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status TV Ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume mudado: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume mudado: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.avancarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.retrocederCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
