// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SelectAudioTrackByAttributeResponse {
    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    private final String attribute;
    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
     */
    private final @Nullable String channelMapping;
    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    private final String filter;
    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property.
     * 
     */
    private final @Nullable String filterValue;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectAudioTrackByAttribute'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor
    private SelectAudioTrackByAttributeResponse(
        @OutputCustomType.Parameter("attribute") String attribute,
        @OutputCustomType.Parameter("channelMapping") @Nullable String channelMapping,
        @OutputCustomType.Parameter("filter") String filter,
        @OutputCustomType.Parameter("filterValue") @Nullable String filterValue,
        @OutputCustomType.Parameter("odataType") String odataType) {
        this.attribute = attribute;
        this.channelMapping = channelMapping;
        this.filter = filter;
        this.filterValue = filterValue;
        this.odataType = odataType;
    }

    /**
     * The TrackAttribute to filter the tracks by.
     * 
    */
    public String getAttribute() {
        return this.attribute;
    }
    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
    */
    public Optional<String> getChannelMapping() {
        return Optional.ofNullable(this.channelMapping);
    }
    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
    */
    public String getFilter() {
        return this.filter;
    }
    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property.
     * 
    */
    public Optional<String> getFilterValue() {
        return Optional.ofNullable(this.filterValue);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectAudioTrackByAttribute'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectAudioTrackByAttributeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private @Nullable String channelMapping;
        private String filter;
        private @Nullable String filterValue;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectAudioTrackByAttributeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.channelMapping = defaults.channelMapping;
    	      this.filter = defaults.filter;
    	      this.filterValue = defaults.filterValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setChannelMapping(@Nullable String channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilterValue(@Nullable String filterValue) {
            this.filterValue = filterValue;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public SelectAudioTrackByAttributeResponse build() {
            return new SelectAudioTrackByAttributeResponse(attribute, channelMapping, filter, filterValue, odataType);
        }
    }
}
