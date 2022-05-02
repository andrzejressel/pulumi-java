// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.awsnative.iotevents.outputs.AlarmModelPayload;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmModelLambda {
    /**
     * @return The ARN of the Lambda function that is executed.
     * 
     */
    private final String functionArn;
    private final @Nullable AlarmModelPayload payload;

    @CustomType.Constructor
    private AlarmModelLambda(
        @CustomType.Parameter("functionArn") String functionArn,
        @CustomType.Parameter("payload") @Nullable AlarmModelPayload payload) {
        this.functionArn = functionArn;
        this.payload = payload;
    }

    /**
     * @return The ARN of the Lambda function that is executed.
     * 
     */
    public String functionArn() {
        return this.functionArn;
    }
    public Optional<AlarmModelPayload> payload() {
        return Optional.ofNullable(this.payload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmModelLambda defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionArn;
        private @Nullable AlarmModelPayload payload;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmModelLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.payload = defaults.payload;
        }

        public Builder functionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public Builder payload(@Nullable AlarmModelPayload payload) {
            this.payload = payload;
            return this;
        }        public AlarmModelLambda build() {
            return new AlarmModelLambda(functionArn, payload);
        }
    }
}
