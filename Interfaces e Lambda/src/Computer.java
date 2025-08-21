public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O Computador está tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Computador está pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Computador está parando musica");

    }

    @Override
    public void playVideo() {
        System.out.println("O Computador está rodando o video");
    }
}
