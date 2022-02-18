// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EntityTypeEntity {
    /**
     * A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym
     * could be green onions.
     * For KIND_LIST entity types:
     * * This collection must contain exactly one synonym equal to value.
     * 
     */
    private final List<String> synonyms;
    /**
     * The primary value associated with this entity entry. For example, if the entity type is vegetable, the value
     * could be scallions.
     * For KIND_MAP entity types:
     * * A reference value to be used in place of synonyms.
     *   For KIND_LIST entity types:
     * * A string that can contain references to other entity types (with or without aliases).
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"synonyms","value"})
    private EntityTypeEntity(
        List<String> synonyms,
        String value) {
        this.synonyms = Objects.requireNonNull(synonyms);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym
     * could be green onions.
     * For KIND_LIST entity types:
     * * This collection must contain exactly one synonym equal to value.
     * 
     */
    public List<String> getSynonyms() {
        return this.synonyms;
    }
    /**
     * The primary value associated with this entity entry. For example, if the entity type is vegetable, the value
     * could be scallions.
     * For KIND_MAP entity types:
     * * A reference value to be used in place of synonyms.
     *   For KIND_LIST entity types:
     * * A string that can contain references to other entity types (with or without aliases).
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityTypeEntity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> synonyms;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityTypeEntity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder setSynonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public EntityTypeEntity build() {
            return new EntityTypeEntity(synonyms, value);
        }
    }
}
