// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyVariableEnumOption;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyVariable extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyVariable Empty = new GetImagingPolicyImagePolicyVariable();

    @Import(name="defaultValue", required=true)
    private String defaultValue;

    public String defaultValue() {
        return this.defaultValue;
    }

    @Import(name="enumOptions")
    private @Nullable List<GetImagingPolicyImagePolicyVariableEnumOption> enumOptions;

    public Optional<List<GetImagingPolicyImagePolicyVariableEnumOption>> enumOptions() {
        return Optional.ofNullable(this.enumOptions);
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="postfix")
    private @Nullable String postfix;

    public Optional<String> postfix() {
        return Optional.ofNullable(this.postfix);
    }

    @Import(name="prefix")
    private @Nullable String prefix;

    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GetImagingPolicyImagePolicyVariable() {}

    private GetImagingPolicyImagePolicyVariable(GetImagingPolicyImagePolicyVariable $) {
        this.defaultValue = $.defaultValue;
        this.enumOptions = $.enumOptions;
        this.name = $.name;
        this.postfix = $.postfix;
        this.prefix = $.prefix;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyVariable $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyVariable();
        }

        public Builder(GetImagingPolicyImagePolicyVariable defaults) {
            $ = new GetImagingPolicyImagePolicyVariable(Objects.requireNonNull(defaults));
        }

        public Builder defaultValue(String defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder enumOptions(@Nullable List<GetImagingPolicyImagePolicyVariableEnumOption> enumOptions) {
            $.enumOptions = enumOptions;
            return this;
        }

        public Builder enumOptions(GetImagingPolicyImagePolicyVariableEnumOption... enumOptions) {
            return enumOptions(List.of(enumOptions));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder postfix(@Nullable String postfix) {
            $.postfix = postfix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetImagingPolicyImagePolicyVariable build() {
            $.defaultValue = Objects.requireNonNull($.defaultValue, "expected parameter 'defaultValue' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
