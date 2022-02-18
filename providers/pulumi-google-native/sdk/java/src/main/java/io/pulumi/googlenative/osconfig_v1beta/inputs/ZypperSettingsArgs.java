// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Zypper patching is performed by running `zypper patch`. See also https://en.opensuse.org/SDB:Zypper_manual.
 * 
 */
public final class ZypperSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ZypperSettingsArgs Empty = new ZypperSettingsArgs();

    /**
     * Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    @InputImport(name="categories")
    private final @Nullable Input<List<String>> categories;

    public Input<List<String>> getCategories() {
        return this.categories == null ? Input.empty() : this.categories;
    }

    /**
     * List of patches to exclude from update.
     * 
     */
    @InputImport(name="excludes")
    private final @Nullable Input<List<String>> excludes;

    public Input<List<String>> getExcludes() {
        return this.excludes == null ? Input.empty() : this.excludes;
    }

    /**
     * An exclusive list of patches to be updated. These are the only patches that will be installed using 'zypper patch patch:' command. This field must not be used with any other patch configuration fields.
     * 
     */
    @InputImport(name="exclusivePatches")
    private final @Nullable Input<List<String>> exclusivePatches;

    public Input<List<String>> getExclusivePatches() {
        return this.exclusivePatches == null ? Input.empty() : this.exclusivePatches;
    }

    /**
     * Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    @InputImport(name="severities")
    private final @Nullable Input<List<String>> severities;

    public Input<List<String>> getSeverities() {
        return this.severities == null ? Input.empty() : this.severities;
    }

    /**
     * Adds the `--with-optional` flag to `zypper patch`.
     * 
     */
    @InputImport(name="withOptional")
    private final @Nullable Input<Boolean> withOptional;

    public Input<Boolean> getWithOptional() {
        return this.withOptional == null ? Input.empty() : this.withOptional;
    }

    /**
     * Adds the `--with-update` flag, to `zypper patch`.
     * 
     */
    @InputImport(name="withUpdate")
    private final @Nullable Input<Boolean> withUpdate;

    public Input<Boolean> getWithUpdate() {
        return this.withUpdate == null ? Input.empty() : this.withUpdate;
    }

    public ZypperSettingsArgs(
        @Nullable Input<List<String>> categories,
        @Nullable Input<List<String>> excludes,
        @Nullable Input<List<String>> exclusivePatches,
        @Nullable Input<List<String>> severities,
        @Nullable Input<Boolean> withOptional,
        @Nullable Input<Boolean> withUpdate) {
        this.categories = categories;
        this.excludes = excludes;
        this.exclusivePatches = exclusivePatches;
        this.severities = severities;
        this.withOptional = withOptional;
        this.withUpdate = withUpdate;
    }

    private ZypperSettingsArgs() {
        this.categories = Input.empty();
        this.excludes = Input.empty();
        this.exclusivePatches = Input.empty();
        this.severities = Input.empty();
        this.withOptional = Input.empty();
        this.withUpdate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZypperSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> categories;
        private @Nullable Input<List<String>> excludes;
        private @Nullable Input<List<String>> exclusivePatches;
        private @Nullable Input<List<String>> severities;
        private @Nullable Input<Boolean> withOptional;
        private @Nullable Input<Boolean> withUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(ZypperSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
    	      this.severities = defaults.severities;
    	      this.withOptional = defaults.withOptional;
    	      this.withUpdate = defaults.withUpdate;
        }

        public Builder setCategories(@Nullable Input<List<String>> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setCategories(@Nullable List<String> categories) {
            this.categories = Input.ofNullable(categories);
            return this;
        }

        public Builder setExcludes(@Nullable Input<List<String>> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder setExcludes(@Nullable List<String> excludes) {
            this.excludes = Input.ofNullable(excludes);
            return this;
        }

        public Builder setExclusivePatches(@Nullable Input<List<String>> exclusivePatches) {
            this.exclusivePatches = exclusivePatches;
            return this;
        }

        public Builder setExclusivePatches(@Nullable List<String> exclusivePatches) {
            this.exclusivePatches = Input.ofNullable(exclusivePatches);
            return this;
        }

        public Builder setSeverities(@Nullable Input<List<String>> severities) {
            this.severities = severities;
            return this;
        }

        public Builder setSeverities(@Nullable List<String> severities) {
            this.severities = Input.ofNullable(severities);
            return this;
        }

        public Builder setWithOptional(@Nullable Input<Boolean> withOptional) {
            this.withOptional = withOptional;
            return this;
        }

        public Builder setWithOptional(@Nullable Boolean withOptional) {
            this.withOptional = Input.ofNullable(withOptional);
            return this;
        }

        public Builder setWithUpdate(@Nullable Input<Boolean> withUpdate) {
            this.withUpdate = withUpdate;
            return this;
        }

        public Builder setWithUpdate(@Nullable Boolean withUpdate) {
            this.withUpdate = Input.ofNullable(withUpdate);
            return this;
        }

        public ZypperSettingsArgs build() {
            return new ZypperSettingsArgs(categories, excludes, exclusivePatches, severities, withOptional, withUpdate);
        }
    }
}
