package $packageName$;

import java.time.*;
import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.*;

public class TimerTriggers {
    @FunctionName("$functionName$")
    public static void run(
        @TimerTrigger(name="schedule", schedule="$schedule$") String timerInfo,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java Timer trigger function executed at: " + LocalDateTime.now());
    }
}