package Singletone;

public class Settings {
    public Settings() {}

    //1번 방법 - 단점 : 서버 시작과 동시에 선언되므로 잘 사용되지 않는 인스턴스일뿐더러 무거운 클래스라면 비용소모가 클수 있다.
    //해당 클래스가 무거운편이 아니라 서버 시작과 동시에 실행해도된다면 이 방법을 사용해도된다.
    //이른초기화(eager initialization)이라고 한다.
//    public static final Settings INSTANCE = new Settings();





    //2번 방법 : 단점 : synchronize가 성능에 어느정도 락을 걸기때문에 꼭 좋은 코드는 아님.
    /*
        public static Settings instance;

        //synchronized(동기화) : 한번에 하나의 스레드만 접근할수 있도록 해준다.
        //만약 synchronize가 없이 getInstance메소드를 사용한다면 멀티스레드 환경에서 세이프하게 작동하지 않는다.
        public static synchronized Settings getInstance() {
            if (instance != null) {
                instance = new Settings();
            }

            return instance;
        }
    */


    //3번 방법
    //double checked Lokcing이라고 한다.
    //이 방법은 실제로 필요하고 아직 선언되지 않은 경우 synchronized를 걸어서 멀티 스레드에도 세이프하다.
    /*
    * volatile
    * - 해당 메소드를 사용하면 멀티 스레드 환경에서 A thread가 new settings()를 한 후에 이 값을 Main Memory에까지 저장하기 때문에
    *   B thread도 공유할수 있다.
    * ♣︎ volatile이 없으면 A thread가 new Setting() 실행한 후 CPU cache에 저장하여 B thread는 공유되지 않아 synchronized속에 double checking if문을 탈수 있다.
    * */
/*
    private static volatile Settings instance;

    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class){
                //굳이 이프문을 또 태우는 이유는??
                //정답 !!! 두개의 멀티 스레드가 들어왔을 경우 a스레드가 synchronized에 들어가 인스턴스가 널이라 new Settings로 생성하고 나서
                //b스레드가 synchronized로 인해 대기하다 들어와 한번더 검사를 해야함.
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }

        return instance;
    }
*/

    //4번 방법 - static inner 클래스 사용
    private static class SettingHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingHolder.INSTANCE;
    }
}
