package hu.veres.domokos.model;

import java.util.Objects;
import java.util.StringJoiner;

public class MessageResponse {

    private final String message;

    private MessageResponse(Builder builder) {
        this.message = builder.getMessage();
    }

    public String getMessage() {
        return message;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageResponse that = (MessageResponse) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MessageResponse.class.getSimpleName() + "[", "]")
                .add("message='" + message + "'")
                .toString();
    }

    public static class Builder {
        private String message;

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public String getMessage() {
            return message;
        }

        public MessageResponse build() {
            return new MessageResponse(this);
        }
    }
}
