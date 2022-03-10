// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CognitiveServicesAccountSkuChangeInfoResponse {
    /**
     * Gets the count of downgrades.
     * 
     */
    private final Double countOfDowngrades;
    /**
     * Gets the count of upgrades after downgrades.
     * 
     */
    private final Double countOfUpgradesAfterDowngrades;
    /**
     * Gets the last change date.
     * 
     */
    private final String lastChangeDate;

    @OutputCustomType.Constructor
    private CognitiveServicesAccountSkuChangeInfoResponse(
        @OutputCustomType.Parameter("countOfDowngrades") Double countOfDowngrades,
        @OutputCustomType.Parameter("countOfUpgradesAfterDowngrades") Double countOfUpgradesAfterDowngrades,
        @OutputCustomType.Parameter("lastChangeDate") String lastChangeDate) {
        this.countOfDowngrades = countOfDowngrades;
        this.countOfUpgradesAfterDowngrades = countOfUpgradesAfterDowngrades;
        this.lastChangeDate = lastChangeDate;
    }

    /**
     * Gets the count of downgrades.
     * 
    */
    public Double getCountOfDowngrades() {
        return this.countOfDowngrades;
    }
    /**
     * Gets the count of upgrades after downgrades.
     * 
    */
    public Double getCountOfUpgradesAfterDowngrades() {
        return this.countOfUpgradesAfterDowngrades;
    }
    /**
     * Gets the last change date.
     * 
    */
    public String getLastChangeDate() {
        return this.lastChangeDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountSkuChangeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double countOfDowngrades;
        private Double countOfUpgradesAfterDowngrades;
        private String lastChangeDate;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountSkuChangeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countOfDowngrades = defaults.countOfDowngrades;
    	      this.countOfUpgradesAfterDowngrades = defaults.countOfUpgradesAfterDowngrades;
    	      this.lastChangeDate = defaults.lastChangeDate;
        }

        public Builder setCountOfDowngrades(Double countOfDowngrades) {
            this.countOfDowngrades = Objects.requireNonNull(countOfDowngrades);
            return this;
        }

        public Builder setCountOfUpgradesAfterDowngrades(Double countOfUpgradesAfterDowngrades) {
            this.countOfUpgradesAfterDowngrades = Objects.requireNonNull(countOfUpgradesAfterDowngrades);
            return this;
        }

        public Builder setLastChangeDate(String lastChangeDate) {
            this.lastChangeDate = Objects.requireNonNull(lastChangeDate);
            return this;
        }
        public CognitiveServicesAccountSkuChangeInfoResponse build() {
            return new CognitiveServicesAccountSkuChangeInfoResponse(countOfDowngrades, countOfUpgradesAfterDowngrades, lastChangeDate);
        }
    }
}
