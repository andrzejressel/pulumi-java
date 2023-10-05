// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorCloudletPolicy;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector();

    @Import(name="cloudletPolicy")
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorCloudletPolicy cloudletPolicy;

    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="cloudletSharedPolicy")
    private @Nullable Integer cloudletSharedPolicy;

    public Optional<Integer> cloudletSharedPolicy() {
        return Optional.ofNullable(this.cloudletSharedPolicy);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="isSharedPolicy")
    private @Nullable Boolean isSharedPolicy;

    public Optional<Boolean> isSharedPolicy() {
        return Optional.ofNullable(this.isSharedPolicy);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector $) {
        this.cloudletPolicy = $.cloudletPolicy;
        this.cloudletSharedPolicy = $.cloudletSharedPolicy;
        this.enabled = $.enabled;
        this.isSharedPolicy = $.isSharedPolicy;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector(Objects.requireNonNull(defaults));
        }

        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorCloudletPolicy cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder cloudletSharedPolicy(@Nullable Integer cloudletSharedPolicy) {
            $.cloudletSharedPolicy = cloudletSharedPolicy;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder isSharedPolicy(@Nullable Boolean isSharedPolicy) {
            $.isSharedPolicy = isSharedPolicy;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirector build() {
            return $;
        }
    }

}
