public class MusicBox implements  MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("A caixa de som está tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de som está pausando a  musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de som está parando a musica");

    }


}
