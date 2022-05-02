// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspector;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssessmentTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssessmentTargetArgs Empty = new AssessmentTargetArgs();

    @Import(name="assessmentTargetName")
    private @Nullable Output<String> assessmentTargetName;

    public Optional<Output<String>> assessmentTargetName() {
        return Optional.ofNullable(this.assessmentTargetName);
    }

    @Import(name="resourceGroupArn")
    private @Nullable Output<String> resourceGroupArn;

    public Optional<Output<String>> resourceGroupArn() {
        return Optional.ofNullable(this.resourceGroupArn);
    }

    private AssessmentTargetArgs() {}

    private AssessmentTargetArgs(AssessmentTargetArgs $) {
        this.assessmentTargetName = $.assessmentTargetName;
        this.resourceGroupArn = $.resourceGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssessmentTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssessmentTargetArgs $;

        public Builder() {
            $ = new AssessmentTargetArgs();
        }

        public Builder(AssessmentTargetArgs defaults) {
            $ = new AssessmentTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder assessmentTargetName(@Nullable Output<String> assessmentTargetName) {
            $.assessmentTargetName = assessmentTargetName;
            return this;
        }

        public Builder assessmentTargetName(String assessmentTargetName) {
            return assessmentTargetName(Output.of(assessmentTargetName));
        }

        public Builder resourceGroupArn(@Nullable Output<String> resourceGroupArn) {
            $.resourceGroupArn = resourceGroupArn;
            return this;
        }

        public Builder resourceGroupArn(String resourceGroupArn) {
            return resourceGroupArn(Output.of(resourceGroupArn));
        }

        public AssessmentTargetArgs build() {
            return $;
        }
    }

}
