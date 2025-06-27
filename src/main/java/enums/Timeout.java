package enums;

import java.time.Duration;

public enum Timeout {
    FIVE(5),
    TEN(10),
    TWENTY(20);
    private long sec;

    Timeout(long sec) {
        this.sec= sec;
    }

    public Duration getDuration() {
        return Duration.ofSeconds(sec);
    }
    public long getSeconds(){
        return sec;
    }
}
