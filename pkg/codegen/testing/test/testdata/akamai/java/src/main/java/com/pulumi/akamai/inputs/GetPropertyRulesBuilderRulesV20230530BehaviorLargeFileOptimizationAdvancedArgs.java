// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="fragmentSize")
    private @Nullable Output<String> fragmentSize;

    public Optional<Output<String>> fragmentSize() {
        return Optional.ofNullable(this.fragmentSize);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="objectSize")
    private @Nullable Output<String> objectSize;

    public Optional<Output<String>> objectSize() {
        return Optional.ofNullable(this.objectSize);
    }

    @Import(name="prefetchAfterRequest")
    private @Nullable Output<Integer> prefetchAfterRequest;

    public Optional<Output<Integer>> prefetchAfterRequest() {
        return Optional.ofNullable(this.prefetchAfterRequest);
    }

    @Import(name="prefetchDuringRequest")
    private @Nullable Output<Integer> prefetchDuringRequest;

    public Optional<Output<Integer>> prefetchDuringRequest() {
        return Optional.ofNullable(this.prefetchDuringRequest);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs(GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs $) {
        this.enabled = $.enabled;
        this.fragmentSize = $.fragmentSize;
        this.locked = $.locked;
        this.objectSize = $.objectSize;
        this.prefetchAfterRequest = $.prefetchAfterRequest;
        this.prefetchDuringRequest = $.prefetchDuringRequest;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder fragmentSize(@Nullable Output<String> fragmentSize) {
            $.fragmentSize = fragmentSize;
            return this;
        }

        public Builder fragmentSize(String fragmentSize) {
            return fragmentSize(Output.of(fragmentSize));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder objectSize(@Nullable Output<String> objectSize) {
            $.objectSize = objectSize;
            return this;
        }

        public Builder objectSize(String objectSize) {
            return objectSize(Output.of(objectSize));
        }

        public Builder prefetchAfterRequest(@Nullable Output<Integer> prefetchAfterRequest) {
            $.prefetchAfterRequest = prefetchAfterRequest;
            return this;
        }

        public Builder prefetchAfterRequest(Integer prefetchAfterRequest) {
            return prefetchAfterRequest(Output.of(prefetchAfterRequest));
        }

        public Builder prefetchDuringRequest(@Nullable Output<Integer> prefetchDuringRequest) {
            $.prefetchDuringRequest = prefetchDuringRequest;
            return this;
        }

        public Builder prefetchDuringRequest(Integer prefetchDuringRequest) {
            return prefetchDuringRequest(Output.of(prefetchDuringRequest));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedArgs build() {
            return $;
        }
    }

}
