// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponseCloudWatchToKinesis;
import io.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponseKinesisToS3;
import io.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponseKubernetesScubaReader;
import io.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponseKubernetesService;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DefenderForContainersAwsOfferingResponse {
    /**
     * The cloudwatch to kinesis connection configuration
     * 
     */
    private final @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis;
    /**
     * The offering description.
     * 
     */
    private final String description;
    /**
     * The kinesis to s3 connection configuration
     * 
     */
    private final @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3;
    /**
     * The kubernetes to scuba connection configuration
     * 
     */
    private final @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader;
    /**
     * The kubernetes service connection configuration
     * 
     */
    private final @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService;
    /**
     * The type of the security offering.
     * Expected value is 'DefenderForContainersAws'.
     * 
     */
    private final String offeringType;

    @OutputCustomType.Constructor
    private DefenderForContainersAwsOfferingResponse(
        @OutputCustomType.Parameter("cloudWatchToKinesis") @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("kinesisToS3") @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3,
        @OutputCustomType.Parameter("kubernetesScubaReader") @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader,
        @OutputCustomType.Parameter("kubernetesService") @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService,
        @OutputCustomType.Parameter("offeringType") String offeringType) {
        this.cloudWatchToKinesis = cloudWatchToKinesis;
        this.description = description;
        this.kinesisToS3 = kinesisToS3;
        this.kubernetesScubaReader = kubernetesScubaReader;
        this.kubernetesService = kubernetesService;
        this.offeringType = offeringType;
    }

    /**
     * The cloudwatch to kinesis connection configuration
     * 
    */
    public Optional<DefenderForContainersAwsOfferingResponseCloudWatchToKinesis> getCloudWatchToKinesis() {
        return Optional.ofNullable(this.cloudWatchToKinesis);
    }
    /**
     * The offering description.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The kinesis to s3 connection configuration
     * 
    */
    public Optional<DefenderForContainersAwsOfferingResponseKinesisToS3> getKinesisToS3() {
        return Optional.ofNullable(this.kinesisToS3);
    }
    /**
     * The kubernetes to scuba connection configuration
     * 
    */
    public Optional<DefenderForContainersAwsOfferingResponseKubernetesScubaReader> getKubernetesScubaReader() {
        return Optional.ofNullable(this.kubernetesScubaReader);
    }
    /**
     * The kubernetes service connection configuration
     * 
    */
    public Optional<DefenderForContainersAwsOfferingResponseKubernetesService> getKubernetesService() {
        return Optional.ofNullable(this.kubernetesService);
    }
    /**
     * The type of the security offering.
     * Expected value is 'DefenderForContainersAws'.
     * 
    */
    public String getOfferingType() {
        return this.offeringType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis;
        private String description;
        private @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3;
        private @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader;
        private @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService;
        private String offeringType;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchToKinesis = defaults.cloudWatchToKinesis;
    	      this.description = defaults.description;
    	      this.kinesisToS3 = defaults.kinesisToS3;
    	      this.kubernetesScubaReader = defaults.kubernetesScubaReader;
    	      this.kubernetesService = defaults.kubernetesService;
    	      this.offeringType = defaults.offeringType;
        }

        public Builder setCloudWatchToKinesis(@Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis) {
            this.cloudWatchToKinesis = cloudWatchToKinesis;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKinesisToS3(@Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3) {
            this.kinesisToS3 = kinesisToS3;
            return this;
        }

        public Builder setKubernetesScubaReader(@Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader) {
            this.kubernetesScubaReader = kubernetesScubaReader;
            return this;
        }

        public Builder setKubernetesService(@Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService) {
            this.kubernetesService = kubernetesService;
            return this;
        }

        public Builder setOfferingType(String offeringType) {
            this.offeringType = Objects.requireNonNull(offeringType);
            return this;
        }
        public DefenderForContainersAwsOfferingResponse build() {
            return new DefenderForContainersAwsOfferingResponse(cloudWatchToKinesis, description, kinesisToS3, kubernetesScubaReader, kubernetesService, offeringType);
        }
    }
}
