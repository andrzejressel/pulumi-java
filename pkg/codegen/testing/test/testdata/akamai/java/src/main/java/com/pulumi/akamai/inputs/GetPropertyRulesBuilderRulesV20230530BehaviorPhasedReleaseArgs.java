// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs();

    @Import(name="cloudletPolicy")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicyArgs> cloudletPolicy;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicyArgs>> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="cloudletSharedPolicy")
    private @Nullable Output<Integer> cloudletSharedPolicy;

    public Optional<Output<Integer>> cloudletSharedPolicy() {
        return Optional.ofNullable(this.cloudletSharedPolicy);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="failoverDuration")
    private @Nullable Output<Integer> failoverDuration;

    public Optional<Output<Integer>> failoverDuration() {
        return Optional.ofNullable(this.failoverDuration);
    }

    @Import(name="failoverEnabled")
    private @Nullable Output<Boolean> failoverEnabled;

    public Optional<Output<Boolean>> failoverEnabled() {
        return Optional.ofNullable(this.failoverEnabled);
    }

    @Import(name="failoverResponseCodes")
    private @Nullable Output<List<String>> failoverResponseCodes;

    public Optional<Output<List<String>>> failoverResponseCodes() {
        return Optional.ofNullable(this.failoverResponseCodes);
    }

    @Import(name="failoverTitle")
    private @Nullable Output<String> failoverTitle;

    public Optional<Output<String>> failoverTitle() {
        return Optional.ofNullable(this.failoverTitle);
    }

    @Import(name="isSharedPolicy")
    private @Nullable Output<Boolean> isSharedPolicy;

    public Optional<Output<Boolean>> isSharedPolicy() {
        return Optional.ofNullable(this.isSharedPolicy);
    }

    @Import(name="label")
    private @Nullable Output<String> label;

    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="populationCookieType")
    private @Nullable Output<String> populationCookieType;

    public Optional<Output<String>> populationCookieType() {
        return Optional.ofNullable(this.populationCookieType);
    }

    @Import(name="populationDuration")
    private @Nullable Output<String> populationDuration;

    public Optional<Output<String>> populationDuration() {
        return Optional.ofNullable(this.populationDuration);
    }

    @Import(name="populationExpirationDate")
    private @Nullable Output<String> populationExpirationDate;

    public Optional<Output<String>> populationExpirationDate() {
        return Optional.ofNullable(this.populationExpirationDate);
    }

    @Import(name="populationRefresh")
    private @Nullable Output<Boolean> populationRefresh;

    public Optional<Output<Boolean>> populationRefresh() {
        return Optional.ofNullable(this.populationRefresh);
    }

    @Import(name="populationTitle")
    private @Nullable Output<String> populationTitle;

    public Optional<Output<String>> populationTitle() {
        return Optional.ofNullable(this.populationTitle);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs(GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs $) {
        this.cloudletPolicy = $.cloudletPolicy;
        this.cloudletSharedPolicy = $.cloudletSharedPolicy;
        this.enabled = $.enabled;
        this.failoverDuration = $.failoverDuration;
        this.failoverEnabled = $.failoverEnabled;
        this.failoverResponseCodes = $.failoverResponseCodes;
        this.failoverTitle = $.failoverTitle;
        this.isSharedPolicy = $.isSharedPolicy;
        this.label = $.label;
        this.locked = $.locked;
        this.populationCookieType = $.populationCookieType;
        this.populationDuration = $.populationDuration;
        this.populationExpirationDate = $.populationExpirationDate;
        this.populationRefresh = $.populationRefresh;
        this.populationTitle = $.populationTitle;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudletPolicy(@Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicyArgs> cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder cloudletPolicy(GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicyArgs cloudletPolicy) {
            return cloudletPolicy(Output.of(cloudletPolicy));
        }

        public Builder cloudletSharedPolicy(@Nullable Output<Integer> cloudletSharedPolicy) {
            $.cloudletSharedPolicy = cloudletSharedPolicy;
            return this;
        }

        public Builder cloudletSharedPolicy(Integer cloudletSharedPolicy) {
            return cloudletSharedPolicy(Output.of(cloudletSharedPolicy));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder failoverDuration(@Nullable Output<Integer> failoverDuration) {
            $.failoverDuration = failoverDuration;
            return this;
        }

        public Builder failoverDuration(Integer failoverDuration) {
            return failoverDuration(Output.of(failoverDuration));
        }

        public Builder failoverEnabled(@Nullable Output<Boolean> failoverEnabled) {
            $.failoverEnabled = failoverEnabled;
            return this;
        }

        public Builder failoverEnabled(Boolean failoverEnabled) {
            return failoverEnabled(Output.of(failoverEnabled));
        }

        public Builder failoverResponseCodes(@Nullable Output<List<String>> failoverResponseCodes) {
            $.failoverResponseCodes = failoverResponseCodes;
            return this;
        }

        public Builder failoverResponseCodes(List<String> failoverResponseCodes) {
            return failoverResponseCodes(Output.of(failoverResponseCodes));
        }

        public Builder failoverResponseCodes(String... failoverResponseCodes) {
            return failoverResponseCodes(List.of(failoverResponseCodes));
        }

        public Builder failoverTitle(@Nullable Output<String> failoverTitle) {
            $.failoverTitle = failoverTitle;
            return this;
        }

        public Builder failoverTitle(String failoverTitle) {
            return failoverTitle(Output.of(failoverTitle));
        }

        public Builder isSharedPolicy(@Nullable Output<Boolean> isSharedPolicy) {
            $.isSharedPolicy = isSharedPolicy;
            return this;
        }

        public Builder isSharedPolicy(Boolean isSharedPolicy) {
            return isSharedPolicy(Output.of(isSharedPolicy));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder populationCookieType(@Nullable Output<String> populationCookieType) {
            $.populationCookieType = populationCookieType;
            return this;
        }

        public Builder populationCookieType(String populationCookieType) {
            return populationCookieType(Output.of(populationCookieType));
        }

        public Builder populationDuration(@Nullable Output<String> populationDuration) {
            $.populationDuration = populationDuration;
            return this;
        }

        public Builder populationDuration(String populationDuration) {
            return populationDuration(Output.of(populationDuration));
        }

        public Builder populationExpirationDate(@Nullable Output<String> populationExpirationDate) {
            $.populationExpirationDate = populationExpirationDate;
            return this;
        }

        public Builder populationExpirationDate(String populationExpirationDate) {
            return populationExpirationDate(Output.of(populationExpirationDate));
        }

        public Builder populationRefresh(@Nullable Output<Boolean> populationRefresh) {
            $.populationRefresh = populationRefresh;
            return this;
        }

        public Builder populationRefresh(Boolean populationRefresh) {
            return populationRefresh(Output.of(populationRefresh));
        }

        public Builder populationTitle(@Nullable Output<String> populationTitle) {
            $.populationTitle = populationTitle;
            return this;
        }

        public Builder populationTitle(String populationTitle) {
            return populationTitle(Output.of(populationTitle));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseArgs build() {
            return $;
        }
    }

}
