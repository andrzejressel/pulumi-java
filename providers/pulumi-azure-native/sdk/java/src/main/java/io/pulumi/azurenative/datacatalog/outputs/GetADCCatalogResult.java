// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datacatalog.outputs;

import io.pulumi.azurenative.datacatalog.outputs.PrincipalsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetADCCatalogResult {
    /**
     * Azure data catalog admin list.
     * 
     */
    private final @Nullable List<PrincipalsResponse> admins;
    /**
     * Automatic unit adjustment enabled or not.
     * 
     */
    private final @Nullable Boolean enableAutomaticUnitAdjustment;
    /**
     * Resource etag
     * 
     */
    private final @Nullable String etag;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Azure data catalog SKU.
     * 
     */
    private final @Nullable String sku;
    /**
     * Azure data catalog provision status.
     * 
     */
    private final @Nullable Boolean successfullyProvisioned;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Azure data catalog units.
     * 
     */
    private final @Nullable Integer units;
    /**
     * Azure data catalog user list.
     * 
     */
    private final @Nullable List<PrincipalsResponse> users;

    @OutputCustomType.Constructor
    private GetADCCatalogResult(
        @OutputCustomType.Parameter("admins") @Nullable List<PrincipalsResponse> admins,
        @OutputCustomType.Parameter("enableAutomaticUnitAdjustment") @Nullable Boolean enableAutomaticUnitAdjustment,
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("sku") @Nullable String sku,
        @OutputCustomType.Parameter("successfullyProvisioned") @Nullable Boolean successfullyProvisioned,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("units") @Nullable Integer units,
        @OutputCustomType.Parameter("users") @Nullable List<PrincipalsResponse> users) {
        this.admins = admins;
        this.enableAutomaticUnitAdjustment = enableAutomaticUnitAdjustment;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.sku = sku;
        this.successfullyProvisioned = successfullyProvisioned;
        this.tags = tags;
        this.type = type;
        this.units = units;
        this.users = users;
    }

    /**
     * Azure data catalog admin list.
     * 
    */
    public List<PrincipalsResponse> getAdmins() {
        return this.admins == null ? List.of() : this.admins;
    }
    /**
     * Automatic unit adjustment enabled or not.
     * 
    */
    public Optional<Boolean> getEnableAutomaticUnitAdjustment() {
        return Optional.ofNullable(this.enableAutomaticUnitAdjustment);
    }
    /**
     * Resource etag
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Azure data catalog SKU.
     * 
    */
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Azure data catalog provision status.
     * 
    */
    public Optional<Boolean> getSuccessfullyProvisioned() {
        return Optional.ofNullable(this.successfullyProvisioned);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Azure data catalog units.
     * 
    */
    public Optional<Integer> getUnits() {
        return Optional.ofNullable(this.units);
    }
    /**
     * Azure data catalog user list.
     * 
    */
    public List<PrincipalsResponse> getUsers() {
        return this.users == null ? List.of() : this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetADCCatalogResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PrincipalsResponse> admins;
        private @Nullable Boolean enableAutomaticUnitAdjustment;
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable String sku;
        private @Nullable Boolean successfullyProvisioned;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Integer units;
        private @Nullable List<PrincipalsResponse> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GetADCCatalogResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admins = defaults.admins;
    	      this.enableAutomaticUnitAdjustment = defaults.enableAutomaticUnitAdjustment;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
    	      this.successfullyProvisioned = defaults.successfullyProvisioned;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.units = defaults.units;
    	      this.users = defaults.users;
        }

        public Builder setAdmins(@Nullable List<PrincipalsResponse> admins) {
            this.admins = admins;
            return this;
        }

        public Builder setEnableAutomaticUnitAdjustment(@Nullable Boolean enableAutomaticUnitAdjustment) {
            this.enableAutomaticUnitAdjustment = enableAutomaticUnitAdjustment;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSuccessfullyProvisioned(@Nullable Boolean successfullyProvisioned) {
            this.successfullyProvisioned = successfullyProvisioned;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnits(@Nullable Integer units) {
            this.units = units;
            return this;
        }

        public Builder setUsers(@Nullable List<PrincipalsResponse> users) {
            this.users = users;
            return this;
        }
        public GetADCCatalogResult build() {
            return new GetADCCatalogResult(admins, enableAutomaticUnitAdjustment, etag, id, location, name, sku, successfullyProvisioned, tags, type, units, users);
        }
    }
}
