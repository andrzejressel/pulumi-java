// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecVolumeSecretItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServiceTemplateSpecVolumeSecret extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecVolumeSecret Empty = new GetServiceTemplateSpecVolumeSecret();

    @InputImport(name="defaultMode", required=true)
    private final Integer defaultMode;

    public Integer getDefaultMode() {
        return this.defaultMode;
    }

    @InputImport(name="items", required=true)
    private final List<GetServiceTemplateSpecVolumeSecretItem> items;

    public List<GetServiceTemplateSpecVolumeSecretItem> getItems() {
        return this.items;
    }

    @InputImport(name="secretName", required=true)
    private final String secretName;

    public String getSecretName() {
        return this.secretName;
    }

    public GetServiceTemplateSpecVolumeSecret(
        Integer defaultMode,
        List<GetServiceTemplateSpecVolumeSecretItem> items,
        String secretName) {
        this.defaultMode = Objects.requireNonNull(defaultMode, "expected parameter 'defaultMode' to be non-null");
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
    }

    private GetServiceTemplateSpecVolumeSecret() {
        this.defaultMode = null;
        this.items = List.of();
        this.secretName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecVolumeSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer defaultMode;
        private List<GetServiceTemplateSpecVolumeSecretItem> items;
        private String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecVolumeSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.secretName = defaults.secretName;
        }

        public Builder setDefaultMode(Integer defaultMode) {
            this.defaultMode = Objects.requireNonNull(defaultMode);
            return this;
        }

        public Builder setItems(List<GetServiceTemplateSpecVolumeSecretItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setSecretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }

        public GetServiceTemplateSpecVolumeSecret build() {
            return new GetServiceTemplateSpecVolumeSecret(defaultMode, items, secretName);
        }
    }
}
