public class Smartphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone está parando musica");

    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone está rodando o video");
    }
}
