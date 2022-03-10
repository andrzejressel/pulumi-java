// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VoiceReceiverResponse {
    /**
     * The country code of the voice receiver.
     * 
     */
    private final String countryCode;
    /**
     * The name of the voice receiver. Names must be unique across all receivers within an action group.
     * 
     */
    private final String name;
    /**
     * The phone number of the voice receiver.
     * 
     */
    private final String phoneNumber;

    @OutputCustomType.Constructor
    private VoiceReceiverResponse(
        @OutputCustomType.Parameter("countryCode") String countryCode,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("phoneNumber") String phoneNumber) {
        this.countryCode = countryCode;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * The country code of the voice receiver.
     * 
    */
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The name of the voice receiver. Names must be unique across all receivers within an action group.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The phone number of the voice receiver.
     * 
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String countryCode;
        private String name;
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setCountryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public VoiceReceiverResponse build() {
            return new VoiceReceiverResponse(countryCode, name, phoneNumber);
        }
    }
}
