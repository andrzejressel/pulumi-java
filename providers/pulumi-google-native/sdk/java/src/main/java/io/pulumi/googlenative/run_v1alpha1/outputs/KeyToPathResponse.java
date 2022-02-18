// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyToPathResponse {
    /**
     * The Cloud Secret Manager secret version. Can be 'latest' for the latest value or an integer for a specific version. The key to project.
     * 
     */
    private final String key;
    /**
     * (Optional) Mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume's default mode will be used. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private final Integer mode;
    /**
     * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
     * 
     */
    private final String path;

    @OutputCustomType.Constructor({"key","mode","path"})
    private KeyToPathResponse(
        String key,
        Integer mode,
        String path) {
        this.key = Objects.requireNonNull(key);
        this.mode = Objects.requireNonNull(mode);
        this.path = Objects.requireNonNull(path);
    }

    /**
     * The Cloud Secret Manager secret version. Can be 'latest' for the latest value or an integer for a specific version. The key to project.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * (Optional) Mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume's default mode will be used. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Integer getMode() {
        return this.mode;
    }
    /**
     * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
     * 
     */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyToPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private Integer mode;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyToPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setMode(Integer mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public KeyToPathResponse build() {
            return new KeyToPathResponse(key, mode, path);
        }
    }
}
