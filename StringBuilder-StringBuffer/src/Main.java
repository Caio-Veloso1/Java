import java.time.Duration;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        var stringStart = OffsetDateTime.now();
        String stringConcat = "";
        for(int i = 0; i<200_000; i++){
            stringConcat += 1;
        }
        var stringEnd = OffsetDateTime.now();
        System.out.printf("String: %s\n", getInterval(stringStart, stringEnd));

        var builderStart = OffsetDateTime.now();
        var buildConcat = new StringBuilder();
        for(int i = 0; i<200_000; i++){
            buildConcat.append(i);
        }
        var builderEnd = OffsetDateTime.now();
        System.out.printf("StringBuilder (singlethread): %s\n", getInterval(builderStart, builderEnd));

        var bufferStart = OffsetDateTime.now();
        var bufferConcat = new StringBuffer();
        for(int i = 0; i<200_000; i++){
            bufferConcat.append(i);
        }
        var bufferEnd = OffsetDateTime.now();
        System.out.printf("Stringbuffer (multithread): %s\n", getInterval(builderStart, builderEnd))

    }


    public static long getInterval(final OffsetDateTime start, final OffsetDateTime end){
        return Duration.between(start, end).toMillis();
    }
}