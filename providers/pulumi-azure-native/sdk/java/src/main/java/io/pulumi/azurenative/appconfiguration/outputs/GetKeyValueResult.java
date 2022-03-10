// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKeyValueResult {
    /**
     * The content type of the key-value's value.
     * Providing a proper content-type can enable transformations of values when they are retrieved by applications.
     * 
     */
    private final @Nullable String contentType;
    /**
     * An ETag indicating the state of a key-value within a configuration store.
     * 
     */
    private final String eTag;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The primary identifier of a key-value.
     * The key is used in unison with the label to uniquely identify a key-value.
     * 
     */
    private final String key;
    /**
     * A value used to group key-values.
     * The label is used in unison with the key to uniquely identify a key-value.
     * 
     */
    private final String label;
    /**
     * The last time a modifying operation was performed on the given key-value.
     * 
     */
    private final String lastModified;
    /**
     * A value indicating whether the key-value is locked.
     * A locked key-value may not be modified until it is unlocked.
     * 
     */
    private final Boolean locked;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * A dictionary of tags that can help identify what a key-value may be applicable for.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The value of the key-value.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private GetKeyValueResult(
        @OutputCustomType.Parameter("contentType") @Nullable String contentType,
        @OutputCustomType.Parameter("eTag") String eTag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("label") String label,
        @OutputCustomType.Parameter("lastModified") String lastModified,
        @OutputCustomType.Parameter("locked") Boolean locked,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.contentType = contentType;
        this.eTag = eTag;
        this.id = id;
        this.key = key;
        this.label = label;
        this.lastModified = lastModified;
        this.locked = locked;
        this.name = name;
        this.tags = tags;
        this.type = type;
        this.value = value;
    }

    /**
     * The content type of the key-value's value.
     * Providing a proper content-type can enable transformations of values when they are retrieved by applications.
     * 
    */
    public Optional<String> getContentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * An ETag indicating the state of a key-value within a configuration store.
     * 
    */
    public String getETag() {
        return this.eTag;
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The primary identifier of a key-value.
     * The key is used in unison with the label to uniquely identify a key-value.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * A value used to group key-values.
     * The label is used in unison with the key to uniquely identify a key-value.
     * 
    */
    public String getLabel() {
        return this.label;
    }
    /**
     * The last time a modifying operation was performed on the given key-value.
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * A value indicating whether the key-value is locked.
     * A locked key-value may not be modified until it is unlocked.
     * 
    */
    public Boolean getLocked() {
        return this.locked;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A dictionary of tags that can help identify what a key-value may be applicable for.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The value of the key-value.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyValueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentType;
        private String eTag;
        private String id;
        private String key;
        private String label;
        private String lastModified;
        private Boolean locked;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.label = defaults.label;
    	      this.lastModified = defaults.lastModified;
    	      this.locked = defaults.locked;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setETag(String eTag) {
            this.eTag = Objects.requireNonNull(eTag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setLocked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
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

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public GetKeyValueResult build() {
            return new GetKeyValueResult(contentType, eTag, id, key, label, lastModified, locked, name, tags, type, value);
        }
    }
}
