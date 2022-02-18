// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentStoreState extends io.pulumi.resources.ResourceArgs {

    public static final ConsentStoreState Empty = new ConsentStoreState();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @InputImport(name="dataset")
    private final @Nullable Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset == null ? Input.empty() : this.dataset;
    }

    /**
     * Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="defaultConsentTtl")
    private final @Nullable Input<String> defaultConsentTtl;

    public Input<String> getDefaultConsentTtl() {
        return this.defaultConsentTtl == null ? Input.empty() : this.defaultConsentTtl;
    }

    /**
     * If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
     * 
     */
    @InputImport(name="enableConsentCreateOnUpdate")
    private final @Nullable Input<Boolean> enableConsentCreateOnUpdate;

    public Input<Boolean> getEnableConsentCreateOnUpdate() {
        return this.enableConsentCreateOnUpdate == null ? Input.empty() : this.enableConsentCreateOnUpdate;
    }

    /**
     * User-supplied key-value pairs used to organize Consent stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The name of this ConsentStore, for example:
     * "consent1"
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ConsentStoreState(
        @Nullable Input<String> dataset,
        @Nullable Input<String> defaultConsentTtl,
        @Nullable Input<Boolean> enableConsentCreateOnUpdate,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name) {
        this.dataset = dataset;
        this.defaultConsentTtl = defaultConsentTtl;
        this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
        this.labels = labels;
        this.name = name;
    }

    private ConsentStoreState() {
        this.dataset = Input.empty();
        this.defaultConsentTtl = Input.empty();
        this.enableConsentCreateOnUpdate = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentStoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataset;
        private @Nullable Input<String> defaultConsentTtl;
        private @Nullable Input<Boolean> enableConsentCreateOnUpdate;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentStoreState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.defaultConsentTtl = defaults.defaultConsentTtl;
    	      this.enableConsentCreateOnUpdate = defaults.enableConsentCreateOnUpdate;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder setDataset(@Nullable Input<String> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder setDataset(@Nullable String dataset) {
            this.dataset = Input.ofNullable(dataset);
            return this;
        }

        public Builder setDefaultConsentTtl(@Nullable Input<String> defaultConsentTtl) {
            this.defaultConsentTtl = defaultConsentTtl;
            return this;
        }

        public Builder setDefaultConsentTtl(@Nullable String defaultConsentTtl) {
            this.defaultConsentTtl = Input.ofNullable(defaultConsentTtl);
            return this;
        }

        public Builder setEnableConsentCreateOnUpdate(@Nullable Input<Boolean> enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
            return this;
        }

        public Builder setEnableConsentCreateOnUpdate(@Nullable Boolean enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = Input.ofNullable(enableConsentCreateOnUpdate);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public ConsentStoreState build() {
            return new ConsentStoreState(dataset, defaultConsentTtl, enableConsentCreateOnUpdate, labels, name);
        }
    }
}
