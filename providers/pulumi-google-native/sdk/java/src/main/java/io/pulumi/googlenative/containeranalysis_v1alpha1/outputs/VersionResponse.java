// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VersionResponse {
    /**
     * Used to correct mistakes in the version numbering scheme.
     * 
     */
    private final Integer epoch;
    /**
     * Whether this version is vulnerable, when defining the version bounds. For example, if the minimum version is 2.0, inclusive=true would say 2.0 is vulnerable, while inclusive=false would say it's not
     * 
     */
    private final Boolean inclusive;
    /**
     * Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
     * 
     */
    private final String kind;
    /**
     * The main part of the version name.
     * 
     */
    private final String name;
    /**
     * The iteration of the package build from the above version.
     * 
     */
    private final String revision;

    @OutputCustomType.Constructor({"epoch","inclusive","kind","name","revision"})
    private VersionResponse(
        Integer epoch,
        Boolean inclusive,
        String kind,
        String name,
        String revision) {
        this.epoch = Objects.requireNonNull(epoch);
        this.inclusive = Objects.requireNonNull(inclusive);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.revision = Objects.requireNonNull(revision);
    }

    /**
     * Used to correct mistakes in the version numbering scheme.
     * 
     */
    public Integer getEpoch() {
        return this.epoch;
    }
    /**
     * Whether this version is vulnerable, when defining the version bounds. For example, if the minimum version is 2.0, inclusive=true would say 2.0 is vulnerable, while inclusive=false would say it's not
     * 
     */
    public Boolean getInclusive() {
        return this.inclusive;
    }
    /**
     * Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The main part of the version name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The iteration of the package build from the above version.
     * 
     */
    public String getRevision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer epoch;
        private Boolean inclusive;
        private String kind;
        private String name;
        private String revision;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epoch = defaults.epoch;
    	      this.inclusive = defaults.inclusive;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.revision = defaults.revision;
        }

        public Builder setEpoch(Integer epoch) {
            this.epoch = Objects.requireNonNull(epoch);
            return this;
        }

        public Builder setInclusive(Boolean inclusive) {
            this.inclusive = Objects.requireNonNull(inclusive);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRevision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public VersionResponse build() {
            return new VersionResponse(epoch, inclusive, kind, name, revision);
        }
    }
}
