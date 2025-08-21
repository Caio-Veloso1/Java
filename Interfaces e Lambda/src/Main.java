//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*
        var musicPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {

            }

            @Override
            public void pauseMusic() {

            }

            @Override
            public void stopMusic() {

            }
        };
        */
        Computer musicPlayer = new Computer();
        runVideo(musicPlayer);
        runMusic(musicPlayer);
    }

    public static void runVideo(VideoPlayer videoPLayer){
        videoPLayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}