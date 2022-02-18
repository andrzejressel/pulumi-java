// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Filters events based on exact matches on the CloudEvents attributes.
 * 
 */
public final class EventFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventFilterResponse Empty = new EventFilterResponse();

    /**
     * The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the 'type' attribute.
     * 
     */
    @InputImport(name="attribute", required=true)
    private final String attribute;

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * The value for the attribute.
     * 
     */
    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public EventFilterResponse(
        String attribute,
        String value) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private EventFilterResponse() {
        this.attribute = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.value = defaults.value;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public EventFilterResponse build() {
            return new EventFilterResponse(attribute, value);
        }
    }
}
