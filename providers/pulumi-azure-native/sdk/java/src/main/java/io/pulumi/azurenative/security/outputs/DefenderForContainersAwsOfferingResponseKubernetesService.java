// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DefenderForContainersAwsOfferingResponseKubernetesService {
    /**
     * The cloud role ARN in AWS for this feature
     * 
     */
    private final @Nullable String cloudRoleArn;

    @OutputCustomType.Constructor
    private DefenderForContainersAwsOfferingResponseKubernetesService(@OutputCustomType.Parameter("cloudRoleArn") @Nullable String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
    }

    /**
     * The cloud role ARN in AWS for this feature
     * 
    */
    public Optional<String> getCloudRoleArn() {
        return Optional.ofNullable(this.cloudRoleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingResponseKubernetesService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingResponseKubernetesService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRoleArn = defaults.cloudRoleArn;
        }

        public Builder setCloudRoleArn(@Nullable String cloudRoleArn) {
            this.cloudRoleArn = cloudRoleArn;
            return this;
        }
        public DefenderForContainersAwsOfferingResponseKubernetesService build() {
            return new DefenderForContainersAwsOfferingResponseKubernetesService(cloudRoleArn);
        }
    }
}
