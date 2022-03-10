// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EdifactValidationSettingsResponse {
    /**
     * The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    private final Boolean allowLeadingAndTrailingSpacesAndZeroes;
    /**
     * The value indicating whether to check for duplicate group control number.
     * 
     */
    private final Boolean checkDuplicateGroupControlNumber;
    /**
     * The value indicating whether to check for duplicate interchange control number.
     * 
     */
    private final Boolean checkDuplicateInterchangeControlNumber;
    /**
     * The value indicating whether to check for duplicate transaction set control number.
     * 
     */
    private final Boolean checkDuplicateTransactionSetControlNumber;
    /**
     * The validity period of interchange control number.
     * 
     */
    private final Integer interchangeControlNumberValidityDays;
    /**
     * The trailing separator policy.
     * 
     */
    private final String trailingSeparatorPolicy;
    /**
     * The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    private final Boolean trimLeadingAndTrailingSpacesAndZeroes;
    /**
     * The value indicating whether to validate character set in the message.
     * 
     */
    private final Boolean validateCharacterSet;
    /**
     * The value indicating whether to Whether to validate EDI types.
     * 
     */
    private final Boolean validateEDITypes;
    /**
     * The value indicating whether to Whether to validate XSD types.
     * 
     */
    private final Boolean validateXSDTypes;

    @OutputCustomType.Constructor
    private EdifactValidationSettingsResponse(
        @OutputCustomType.Parameter("allowLeadingAndTrailingSpacesAndZeroes") Boolean allowLeadingAndTrailingSpacesAndZeroes,
        @OutputCustomType.Parameter("checkDuplicateGroupControlNumber") Boolean checkDuplicateGroupControlNumber,
        @OutputCustomType.Parameter("checkDuplicateInterchangeControlNumber") Boolean checkDuplicateInterchangeControlNumber,
        @OutputCustomType.Parameter("checkDuplicateTransactionSetControlNumber") Boolean checkDuplicateTransactionSetControlNumber,
        @OutputCustomType.Parameter("interchangeControlNumberValidityDays") Integer interchangeControlNumberValidityDays,
        @OutputCustomType.Parameter("trailingSeparatorPolicy") String trailingSeparatorPolicy,
        @OutputCustomType.Parameter("trimLeadingAndTrailingSpacesAndZeroes") Boolean trimLeadingAndTrailingSpacesAndZeroes,
        @OutputCustomType.Parameter("validateCharacterSet") Boolean validateCharacterSet,
        @OutputCustomType.Parameter("validateEDITypes") Boolean validateEDITypes,
        @OutputCustomType.Parameter("validateXSDTypes") Boolean validateXSDTypes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = allowLeadingAndTrailingSpacesAndZeroes;
        this.checkDuplicateGroupControlNumber = checkDuplicateGroupControlNumber;
        this.checkDuplicateInterchangeControlNumber = checkDuplicateInterchangeControlNumber;
        this.checkDuplicateTransactionSetControlNumber = checkDuplicateTransactionSetControlNumber;
        this.interchangeControlNumberValidityDays = interchangeControlNumberValidityDays;
        this.trailingSeparatorPolicy = trailingSeparatorPolicy;
        this.trimLeadingAndTrailingSpacesAndZeroes = trimLeadingAndTrailingSpacesAndZeroes;
        this.validateCharacterSet = validateCharacterSet;
        this.validateEDITypes = validateEDITypes;
        this.validateXSDTypes = validateXSDTypes;
    }

    /**
     * The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
    */
    public Boolean getAllowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }
    /**
     * The value indicating whether to check for duplicate group control number.
     * 
    */
    public Boolean getCheckDuplicateGroupControlNumber() {
        return this.checkDuplicateGroupControlNumber;
    }
    /**
     * The value indicating whether to check for duplicate interchange control number.
     * 
    */
    public Boolean getCheckDuplicateInterchangeControlNumber() {
        return this.checkDuplicateInterchangeControlNumber;
    }
    /**
     * The value indicating whether to check for duplicate transaction set control number.
     * 
    */
    public Boolean getCheckDuplicateTransactionSetControlNumber() {
        return this.checkDuplicateTransactionSetControlNumber;
    }
    /**
     * The validity period of interchange control number.
     * 
    */
    public Integer getInterchangeControlNumberValidityDays() {
        return this.interchangeControlNumberValidityDays;
    }
    /**
     * The trailing separator policy.
     * 
    */
    public String getTrailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }
    /**
     * The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
    */
    public Boolean getTrimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }
    /**
     * The value indicating whether to validate character set in the message.
     * 
    */
    public Boolean getValidateCharacterSet() {
        return this.validateCharacterSet;
    }
    /**
     * The value indicating whether to Whether to validate EDI types.
     * 
    */
    public Boolean getValidateEDITypes() {
        return this.validateEDITypes;
    }
    /**
     * The value indicating whether to Whether to validate XSD types.
     * 
    */
    public Boolean getValidateXSDTypes() {
        return this.validateXSDTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactValidationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowLeadingAndTrailingSpacesAndZeroes;
        private Boolean checkDuplicateGroupControlNumber;
        private Boolean checkDuplicateInterchangeControlNumber;
        private Boolean checkDuplicateTransactionSetControlNumber;
        private Integer interchangeControlNumberValidityDays;
        private String trailingSeparatorPolicy;
        private Boolean trimLeadingAndTrailingSpacesAndZeroes;
        private Boolean validateCharacterSet;
        private Boolean validateEDITypes;
        private Boolean validateXSDTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactValidationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLeadingAndTrailingSpacesAndZeroes = defaults.allowLeadingAndTrailingSpacesAndZeroes;
    	      this.checkDuplicateGroupControlNumber = defaults.checkDuplicateGroupControlNumber;
    	      this.checkDuplicateInterchangeControlNumber = defaults.checkDuplicateInterchangeControlNumber;
    	      this.checkDuplicateTransactionSetControlNumber = defaults.checkDuplicateTransactionSetControlNumber;
    	      this.interchangeControlNumberValidityDays = defaults.interchangeControlNumberValidityDays;
    	      this.trailingSeparatorPolicy = defaults.trailingSeparatorPolicy;
    	      this.trimLeadingAndTrailingSpacesAndZeroes = defaults.trimLeadingAndTrailingSpacesAndZeroes;
    	      this.validateCharacterSet = defaults.validateCharacterSet;
    	      this.validateEDITypes = defaults.validateEDITypes;
    	      this.validateXSDTypes = defaults.validateXSDTypes;
        }

        public Builder setAllowLeadingAndTrailingSpacesAndZeroes(Boolean allowLeadingAndTrailingSpacesAndZeroes) {
            this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes);
            return this;
        }

        public Builder setCheckDuplicateGroupControlNumber(Boolean checkDuplicateGroupControlNumber) {
            this.checkDuplicateGroupControlNumber = Objects.requireNonNull(checkDuplicateGroupControlNumber);
            return this;
        }

        public Builder setCheckDuplicateInterchangeControlNumber(Boolean checkDuplicateInterchangeControlNumber) {
            this.checkDuplicateInterchangeControlNumber = Objects.requireNonNull(checkDuplicateInterchangeControlNumber);
            return this;
        }

        public Builder setCheckDuplicateTransactionSetControlNumber(Boolean checkDuplicateTransactionSetControlNumber) {
            this.checkDuplicateTransactionSetControlNumber = Objects.requireNonNull(checkDuplicateTransactionSetControlNumber);
            return this;
        }

        public Builder setInterchangeControlNumberValidityDays(Integer interchangeControlNumberValidityDays) {
            this.interchangeControlNumberValidityDays = Objects.requireNonNull(interchangeControlNumberValidityDays);
            return this;
        }

        public Builder setTrailingSeparatorPolicy(String trailingSeparatorPolicy) {
            this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy);
            return this;
        }

        public Builder setTrimLeadingAndTrailingSpacesAndZeroes(Boolean trimLeadingAndTrailingSpacesAndZeroes) {
            this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes);
            return this;
        }

        public Builder setValidateCharacterSet(Boolean validateCharacterSet) {
            this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet);
            return this;
        }

        public Builder setValidateEDITypes(Boolean validateEDITypes) {
            this.validateEDITypes = Objects.requireNonNull(validateEDITypes);
            return this;
        }

        public Builder setValidateXSDTypes(Boolean validateXSDTypes) {
            this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes);
            return this;
        }
        public EdifactValidationSettingsResponse build() {
            return new EdifactValidationSettingsResponse(allowLeadingAndTrailingSpacesAndZeroes, checkDuplicateGroupControlNumber, checkDuplicateInterchangeControlNumber, checkDuplicateTransactionSetControlNumber, interchangeControlNumberValidityDays, trailingSeparatorPolicy, trimLeadingAndTrailingSpacesAndZeroes, validateCharacterSet, validateEDITypes, validateXSDTypes);
        }
    }
}
