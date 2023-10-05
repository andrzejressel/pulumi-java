// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs();

    @Import(name="allowCredentials")
    private @Nullable Output<Boolean> allowCredentials;

    public Optional<Output<Boolean>> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }

    @Import(name="allowHeaders")
    private @Nullable Output<String> allowHeaders;

    public Optional<Output<String>> allowHeaders() {
        return Optional.ofNullable(this.allowHeaders);
    }

    @Import(name="allowOrigins")
    private @Nullable Output<String> allowOrigins;

    public Optional<Output<String>> allowOrigins() {
        return Optional.ofNullable(this.allowOrigins);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="exposeHeaders")
    private @Nullable Output<List<String>> exposeHeaders;

    public Optional<Output<List<String>>> exposeHeaders() {
        return Optional.ofNullable(this.exposeHeaders);
    }

    @Import(name="headers")
    private @Nullable Output<List<String>> headers;

    public Optional<Output<List<String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="methods")
    private @Nullable Output<List<String>> methods;

    public Optional<Output<List<String>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    @Import(name="origins")
    private @Nullable Output<List<String>> origins;

    public Optional<Output<List<String>>> origins() {
        return Optional.ofNullable(this.origins);
    }

    @Import(name="preflightMaxAge")
    private @Nullable Output<String> preflightMaxAge;

    public Optional<Output<String>> preflightMaxAge() {
        return Optional.ofNullable(this.preflightMaxAge);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs(GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs $) {
        this.allowCredentials = $.allowCredentials;
        this.allowHeaders = $.allowHeaders;
        this.allowOrigins = $.allowOrigins;
        this.enabled = $.enabled;
        this.exposeHeaders = $.exposeHeaders;
        this.headers = $.headers;
        this.locked = $.locked;
        this.methods = $.methods;
        this.origins = $.origins;
        this.preflightMaxAge = $.preflightMaxAge;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            $.allowCredentials = allowCredentials;
            return this;
        }

        public Builder allowCredentials(Boolean allowCredentials) {
            return allowCredentials(Output.of(allowCredentials));
        }

        public Builder allowHeaders(@Nullable Output<String> allowHeaders) {
            $.allowHeaders = allowHeaders;
            return this;
        }

        public Builder allowHeaders(String allowHeaders) {
            return allowHeaders(Output.of(allowHeaders));
        }

        public Builder allowOrigins(@Nullable Output<String> allowOrigins) {
            $.allowOrigins = allowOrigins;
            return this;
        }

        public Builder allowOrigins(String allowOrigins) {
            return allowOrigins(Output.of(allowOrigins));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder exposeHeaders(@Nullable Output<List<String>> exposeHeaders) {
            $.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder exposeHeaders(List<String> exposeHeaders) {
            return exposeHeaders(Output.of(exposeHeaders));
        }

        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }

        public Builder headers(@Nullable Output<List<String>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<String> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder methods(@Nullable Output<List<String>> methods) {
            $.methods = methods;
            return this;
        }

        public Builder methods(List<String> methods) {
            return methods(Output.of(methods));
        }

        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        public Builder origins(@Nullable Output<List<String>> origins) {
            $.origins = origins;
            return this;
        }

        public Builder origins(List<String> origins) {
            return origins(Output.of(origins));
        }

        public Builder origins(String... origins) {
            return origins(List.of(origins));
        }

        public Builder preflightMaxAge(@Nullable Output<String> preflightMaxAge) {
            $.preflightMaxAge = preflightMaxAge;
            return this;
        }

        public Builder preflightMaxAge(String preflightMaxAge) {
            return preflightMaxAge(Output.of(preflightMaxAge));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportArgs build() {
            return $;
        }
    }

}
