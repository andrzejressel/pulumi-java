// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenter {
    private @Nullable String cookieName;
    private @Nullable String description;
    private @Nullable Boolean enableFailover;
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule> failoverRules;
    private @Nullable String failoverTitle;
    private @Nullable String hostname;
    private @Nullable String ip;
    private @Nullable Boolean locked;
    private @Nullable String originId;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenter() {}
    public Optional<String> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> enableFailover() {
        return Optional.ofNullable(this.enableFailover);
    }
    public List<GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule> failoverRules() {
        return this.failoverRules == null ? List.of() : this.failoverRules;
    }
    public Optional<String> failoverTitle() {
        return Optional.ofNullable(this.failoverTitle);
    }
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> originId() {
        return Optional.ofNullable(this.originId);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cookieName;
        private @Nullable String description;
        private @Nullable Boolean enableFailover;
        private @Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule> failoverRules;
        private @Nullable String failoverTitle;
        private @Nullable String hostname;
        private @Nullable String ip;
        private @Nullable Boolean locked;
        private @Nullable String originId;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieName = defaults.cookieName;
    	      this.description = defaults.description;
    	      this.enableFailover = defaults.enableFailover;
    	      this.failoverRules = defaults.failoverRules;
    	      this.failoverTitle = defaults.failoverTitle;
    	      this.hostname = defaults.hostname;
    	      this.ip = defaults.ip;
    	      this.locked = defaults.locked;
    	      this.originId = defaults.originId;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder cookieName(@Nullable String cookieName) {
            this.cookieName = cookieName;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enableFailover(@Nullable Boolean enableFailover) {
            this.enableFailover = enableFailover;
            return this;
        }
        @CustomType.Setter
        public Builder failoverRules(@Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule> failoverRules) {
            this.failoverRules = failoverRules;
            return this;
        }
        public Builder failoverRules(GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule... failoverRules) {
            return failoverRules(List.of(failoverRules));
        }
        @CustomType.Setter
        public Builder failoverTitle(@Nullable String failoverTitle) {
            this.failoverTitle = failoverTitle;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder originId(@Nullable String originId) {
            this.originId = originId;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenter build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenter();
            _resultValue.cookieName = cookieName;
            _resultValue.description = description;
            _resultValue.enableFailover = enableFailover;
            _resultValue.failoverRules = failoverRules;
            _resultValue.failoverTitle = failoverTitle;
            _resultValue.hostname = hostname;
            _resultValue.ip = ip;
            _resultValue.locked = locked;
            _resultValue.originId = originId;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
