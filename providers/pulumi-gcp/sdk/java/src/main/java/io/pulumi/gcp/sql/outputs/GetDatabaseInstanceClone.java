// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDatabaseInstanceClone {
    private final String pointInTime;
    private final String sourceInstanceName;

    @OutputCustomType.Constructor({"pointInTime","sourceInstanceName"})
    private GetDatabaseInstanceClone(
        String pointInTime,
        String sourceInstanceName) {
        this.pointInTime = Objects.requireNonNull(pointInTime);
        this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName);
    }

    public String getPointInTime() {
        return this.pointInTime;
    }
    public String getSourceInstanceName() {
        return this.sourceInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceClone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pointInTime;
        private String sourceInstanceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceClone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pointInTime = defaults.pointInTime;
    	      this.sourceInstanceName = defaults.sourceInstanceName;
        }

        public Builder setPointInTime(String pointInTime) {
            this.pointInTime = Objects.requireNonNull(pointInTime);
            return this;
        }

        public Builder setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName);
            return this;
        }

        public GetDatabaseInstanceClone build() {
            return new GetDatabaseInstanceClone(pointInTime, sourceInstanceName);
        }
    }
}
