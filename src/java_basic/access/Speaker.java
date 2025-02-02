package java_basic.access;

public class Speaker {
    // private : 모든 외부 호출을 막는다.
    // default(package-private): 같은 패키지안에서 호출은 허용한다.
    // protected: 같은 패지이나에서 호출은 허용한다. 패키지가 달라도 상속관계의 호출은 허용한다.
    // public: 모든 외부 호출을 허용한다.

    private int volume; // private이 붙은 경우 해당 클래스 내부에서만 호출할 수 있음.

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (this.volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다");
        } else {
            this.volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        if (this.volume >= 100) {
            System.out.println("음량을 감소할 수 없습니다. 최소 음량입니다");
        } else {
            this.volume -= 10;
            System.out.println("음량을 10 감소합니다.");
        }
    }

    void showVolume() {
        System.out.println("현재 음량 => " + this.volume);
    }
}
