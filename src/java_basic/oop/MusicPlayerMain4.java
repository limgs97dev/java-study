package java_basic.oop;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.turnOn();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 감소
        player.volumeDown();

        // 음악 플레이어 상태 확인
        player.showStatus();

        // 음악 플레이어 종료
        player.turnOff();

    }
}
