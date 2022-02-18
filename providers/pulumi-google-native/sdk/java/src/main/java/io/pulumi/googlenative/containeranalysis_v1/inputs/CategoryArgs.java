// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The category to which the update belongs.
 * 
 */
public final class CategoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final CategoryArgs Empty = new CategoryArgs();

    /**
     * The identifier of the category.
     * 
     */
    @InputImport(name="categoryId")
    private final @Nullable Input<String> categoryId;

    public Input<String> getCategoryId() {
        return this.categoryId == null ? Input.empty() : this.categoryId;
    }

    /**
     * The localized name of the category.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public CategoryArgs(
        @Nullable Input<String> categoryId,
        @Nullable Input<String> name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    private CategoryArgs() {
        this.categoryId = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CategoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> categoryId;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(CategoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryId = defaults.categoryId;
    	      this.name = defaults.name;
        }

        public Builder setCategoryId(@Nullable Input<String> categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setCategoryId(@Nullable String categoryId) {
            this.categoryId = Input.ofNullable(categoryId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public CategoryArgs build() {
            return new CategoryArgs(categoryId, name);
        }
    }
}
