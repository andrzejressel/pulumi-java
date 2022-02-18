// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MetadataExportResponse {
    /**
     * The type of the database dump.
     * 
     */
    private final String databaseDumpType;
    /**
     * A Cloud Storage URI of a folder that metadata are exported to, in the form of gs:////, where is automatically generated.
     * 
     */
    private final String destinationGcsUri;
    /**
     * The time when the export ended.
     * 
     */
    private final String endTime;
    /**
     * The time when the export started.
     * 
     */
    private final String startTime;
    /**
     * The current state of the export.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"databaseDumpType","destinationGcsUri","endTime","startTime","state"})
    private MetadataExportResponse(
        String databaseDumpType,
        String destinationGcsUri,
        String endTime,
        String startTime,
        String state) {
        this.databaseDumpType = Objects.requireNonNull(databaseDumpType);
        this.destinationGcsUri = Objects.requireNonNull(destinationGcsUri);
        this.endTime = Objects.requireNonNull(endTime);
        this.startTime = Objects.requireNonNull(startTime);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The type of the database dump.
     * 
     */
    public String getDatabaseDumpType() {
        return this.databaseDumpType;
    }
    /**
     * A Cloud Storage URI of a folder that metadata are exported to, in the form of gs:////, where is automatically generated.
     * 
     */
    public String getDestinationGcsUri() {
        return this.destinationGcsUri;
    }
    /**
     * The time when the export ended.
     * 
     */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The time when the export started.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The current state of the export.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataExportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseDumpType;
        private String destinationGcsUri;
        private String endTime;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataExportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseDumpType = defaults.databaseDumpType;
    	      this.destinationGcsUri = defaults.destinationGcsUri;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder setDatabaseDumpType(String databaseDumpType) {
            this.databaseDumpType = Objects.requireNonNull(databaseDumpType);
            return this;
        }

        public Builder setDestinationGcsUri(String destinationGcsUri) {
            this.destinationGcsUri = Objects.requireNonNull(destinationGcsUri);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public MetadataExportResponse build() {
            return new MetadataExportResponse(databaseDumpType, destinationGcsUri, endTime, startTime, state);
        }
    }
}
