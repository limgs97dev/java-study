package oop;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        turnOnMusicPlayer(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeOff(data);

        // 음악 플레이어 상태 확인
        checkMusicPlayerStatus(data);

        // 음악 플레이어 종료
        turnOffMusicPlayer(data);
    }

    static void turnOnMusicPlayer(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void turnOffMusicPlayer(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeOff(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void checkMusicPlayerStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 On, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }
}
